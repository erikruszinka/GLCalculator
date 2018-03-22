package sk.akademiasovy.calculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/styles.css");
        primaryStage.setScene(new Scene(root, 248, 337));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
