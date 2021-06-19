package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
import java.util.Stack;
import java.util.concurrent.Flow;

public class Main extends Application {

    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {

        Button topBtn = new Button("Top");
        AnchorPane.setTopAnchor(topBtn, 10.0);
        AnchorPane.setLeftAnchor(topBtn, 60.0);
        AnchorPane.setRightAnchor(topBtn, 60.0);

        Button bottomBtn = new Button("Bottom");
        AnchorPane.setBottomAnchor(bottomBtn, 10.0);
        AnchorPane.setLeftAnchor(bottomBtn, 60.0);
        AnchorPane.setRightAnchor(bottomBtn, 60.0);

        Button leftBtn = new Button("Left");
        AnchorPane.setTopAnchor(leftBtn, 30.0);
        AnchorPane.setLeftAnchor(leftBtn, 15.0);
        AnchorPane.setBottomAnchor(leftBtn, 30.0);

        Button rightBtn = new Button("Right");
        AnchorPane.setTopAnchor(rightBtn, 30.0);
        AnchorPane.setRightAnchor(rightBtn, 10.0);
        AnchorPane.setBottomAnchor(rightBtn, 30.0);

        AnchorPane root = new AnchorPane(topBtn, rightBtn, bottomBtn, leftBtn);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("AnchorPane in JavaFX");

        stage.show();
    }
}
