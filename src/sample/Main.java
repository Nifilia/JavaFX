package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.concurrent.Flow;

public class Main extends Application {

    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {

        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");

        FlowPane root = new FlowPane(10, 10, label1, label2);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("FlowPane in JavaFX");
        stage.setWidth(300);
        stage.setHeight(200);

        stage.show();
    }
}
