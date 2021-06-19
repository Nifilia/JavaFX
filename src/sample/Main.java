package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
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
    public void start(Stage stage) throws Exception {

        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#");
        ComboBox<String> langsComboBox = new ComboBox<String>(langs);
        langsComboBox.setValue("Java");

        Label lbl = new Label();

        langsComboBox.setOnAction(event -> lbl.setText(langsComboBox.getValue()));
        FlowPane root = new FlowPane(10, 10, langsComboBox, lbl);

        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("ComboBox in JavaFX");
        stage.show();
    }
}
