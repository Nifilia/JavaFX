package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;

import java.awt.*;
import java.io.IOException;
import java.util.Stack;
import java.util.concurrent.Flow;

public class Main extends Application {

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        ToggleButton lightBtn = new ToggleButton("Light");
        Label stateLbl = new Label();
        lightBtn.setOnAction(event -> {
            if(lightBtn.isSelected()){
                stateLbl.setText("Light on!");
            }
            else{
                stateLbl.setText("Light off!");
            }
        });

        FlowPane root = new FlowPane(10, 10);
        root.getChildren().addAll(lightBtn, stateLbl);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}
