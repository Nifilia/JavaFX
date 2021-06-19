package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

    int clicks = 0;

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label lbl = new Label("Counter");
        lbl.setPrefWidth(70);
        Button btn = new Button("Click");
        btn.setPrefWidth(80);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clicks++;
                lbl.setText(String.valueOf(clicks));
            }
        });

        FlowPane root = new FlowPane(lbl, btn);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.setWidth(250);
        stage.setHeight(200);
        stage.show();
    }
}
