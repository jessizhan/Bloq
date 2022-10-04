package ui.controller;

import ast.evaluator.BloqVisitor;
import ast.evaluator.PyEvaluator;
import ast.evaluator.VariableValidator;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.image.BufferedImage;
import java.io.*;

import javafx.scene.layout.*;
import libs.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.ParseToASTVisitor;
import parser.gen.bloqLexer;
import parser.gen.bloqParser;

import javax.imageio.ImageIO;

public class EditorController {
    @FXML
    private Button runButton;

    @FXML
    private TextArea editorTextArea;

    @FXML
    private TextArea consoleTextArea;

    @FXML
    private ImageView outputImageView;

    @FXML
    private AnchorPane rightPane;

    // parts of this method where the lexer, parser and visitors are created are modelled after the lecture examples
    @FXML
    public void runButtonClicked(ActionEvent event) {
        try {
            String input = editorTextArea.getText();
            consoleTextArea.clear();

            bloqLexer lexer = new bloqLexer(CharStreams.fromString(input));
            for (Token token : lexer.getAllTokens()) {
                System.out.println(token);
            }
            lexer.reset();
            TokenStream tokens = new CommonTokenStream(lexer);
            System.out.println("Done tokenizing");

            bloqParser parser = new bloqParser(tokens);
            ParseToASTVisitor visitor = new ParseToASTVisitor();
            Node parsedProgram = (Node)parser.program().accept(visitor);
            System.out.println("Done parsing");

            System.out.println(parser);

            BloqVisitor validate = new VariableValidator();
            StringBuilder sbErrors = new StringBuilder();
            String errors = (String) parsedProgram.accept(validate, sbErrors);
            if (errors != "") {
                consoleTextArea.appendText("Static check errors: \n" + errors);
                return;
            }
            System.out.println("Done validating");

            PrintWriter out = new PrintWriter(new FileWriter("./output.py"));
            BloqVisitor eval = new PyEvaluator();
            parsedProgram.accept(eval, out);
            out.close();
            System.out.println("Done evaluation");

            // TODO: Double check python or python3, if on ARM macOS, may need to add 'arch -arm64' before python
            Process process = Runtime.getRuntime().exec("python3 ./output.py");

            int exitcode = process.waitFor();
            System.out.println(exitcode);

            File imageFile;
            if (exitcode != 0) {
                imageFile = new File("error.png");
            } else {
                imageFile = new File("output.png");
            }

            // referred to https://stackoverflow.com/questions/26712643/javafx-imageview-set-center-image  and
            // official documentation https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BackgroundSize.html
            // to set the image as the background and resizable with window resizing
            BufferedImage bufferedImage = ImageIO.read(imageFile);
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
            BackgroundSize backgroundSize = new BackgroundSize(450, 450, false, false, true, false);
            BackgroundImage backgroundImage = new BackgroundImage(image,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    backgroundSize);
            rightPane.setBackground(new Background(backgroundImage));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
