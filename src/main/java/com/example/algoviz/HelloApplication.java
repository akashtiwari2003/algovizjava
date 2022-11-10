package com.example.algoviz;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @FXML
    ImageView logo;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root.load());





        Image icon = new Image("Algoviz_Logo.png");
        stage.getIcons().add(icon);
        stage.setTitle("Algo Viz");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}