package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
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

        Button left = new Button("Left");
        BorderPane.setAlignment(left, Pos.CENTER);

        Button right = new Button("Right");
        BorderPane.setAlignment(right, Pos.BOTTOM_LEFT);

        Button top = new Button("Top");
        BorderPane.setAlignment(top, Pos.CENTER);

        Button bottom = new Button("Bottom");
        BorderPane.setAlignment(bottom, Pos.CENTER);

        Button center = new Button("Center");
        BorderPane root = new BorderPane(center, top, right, bottom, left);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("BorderPane in JavaFX");

        stage.show();
    }
}
