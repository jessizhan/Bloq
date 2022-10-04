// Copied from lecture

package ui;

import org.antlr.runtime.MismatchedTokenException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Stage window;
    Scene scene;

    public static void main(String[] args) throws IOException, MismatchedTokenException, InterruptedException {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException, MismatchedTokenException {
        window = stage;
        window.setTitle("bloq");
        window.getIcons().add(new Image("file:src/ui/images/bloq.png"));
        editorScene();
    }

    private void editorScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("editor.fxml"));
        Parent root = loader.load();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("editor.css").toExternalForm());
        window.setScene(scene);
        window.show();
    }
}
