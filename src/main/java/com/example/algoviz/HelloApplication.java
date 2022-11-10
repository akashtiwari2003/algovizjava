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

//        Setting Title and Icon
        stage.setTitle("Algo Viz");
        Image icon = new Image("Algoviz_Logo.png");
        stage.getIcons().add(icon);




        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}