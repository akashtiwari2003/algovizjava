package com.example.algoviz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);

        Image img = new Image("Algoviz_Logo.png");


        Image icon = new Image("Algoviz_Logo.png");
        stage.getIcons().add(icon);
        stage.setTitle("Algo Viz");


//
        ImageView logo = new ImageView(img);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}