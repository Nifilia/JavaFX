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

    CheckBox java;
    CheckBox javascript;
    CheckBox csharp;
    Label selectedLangs;

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        selectedLangs = new Label("No languages selected");

        java = new CheckBox("Java");
        javascript = new CheckBox("JavaScript");
        csharp = new CheckBox("C#");

        java.setOnAction(event -> show());
        javascript.setOnAction(event -> show());
        csharp.setOnAction(event -> show());

        FlowPane root = new FlowPane(Orientation.VERTICAL, 0, 10);
        root.getChildren().addAll(java, javascript, csharp, selectedLangs);
        root.setPadding(new Insets(0, 0, 0, 10));

        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }

    private void show(){
        String allSelected = "";

        if(java.isSelected()) allSelected += "Java ";
        if(javascript.isSelected()) allSelected += "JavaScript ";
        if(csharp.isSelected()) allSelected += "C# ";

        if(allSelected.equals(""))
            selectedLangs.setText("No languages selected");
        else
            selectedLangs.setText(allSelected);
    }
}
