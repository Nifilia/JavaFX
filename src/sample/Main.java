package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Button btn = new Button();
        btn.setText("Click!");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btn.setText("You've clicked!");
            }
        });
        Group root = new Group(btn);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.setWidth(250);
        stage.setHeight(200);

        stage.show();
    }
}
