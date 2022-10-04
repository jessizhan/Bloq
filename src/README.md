# **Setting Up UI**

## **Installing Java and Python**
Install Java 17 or 18 through https://www.oracle.com/java/technologies/downloads/#jdk18-mac  
Install Python through https://www.python.org/downloads/  
Install Pillow for Python by following the instructions on https://pillow.readthedocs.io/en/stable/installation.html

## **Setting up Intellij**
Go to "File>Project Structure>Modules", add the current project to modules through the + button.   
Keep all default options as Intellij prompt you through the process of adding the module.  
All libraries needed should be added automatically. If any library is missing, add it to the project structure through
the *libraries* tab.  

Go to "Edit Configurations" (it's in the dropdown beside the run button), open the "Modify options" dropdown and select 
"Add VM options".  
Paste in ```--module-path lib/JavaFxWindows/lib --add-modules=javafx.controls --add-modules=javafx.fxml``` 
for Windows  
or ```-module-path lib/JavaFx/ --add-modules=javafx.controls --add-modules=javafx.fxml``` for Mac.  

Open "src>parser", and right click on "bloqLexer.g4". Choose "Generate ANTLR Recognizer", repeat the same action for 
"bloqParser.g4".  
Move the entire "gen" folder into the "parser" folder.

Command line for parsing g4 files:
```
cd src/parser/
antlr4 bloq*.g4 -visitor -o gen
```

Run UI from "src>ui>Main"
