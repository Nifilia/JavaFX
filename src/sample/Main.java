package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Main extends Application {

    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage){

        Group root = new Group();
        Scene scene = new Scene(root, 400, 150, Color.BLUE);

        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}
