package com.example.finalsolarsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("uklad.fxml"));
        Parent root = loader.load();
        HelloController controller = loader.getController();
        controller.setControler(controller);
        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        controller.setStageAndScene(stage, scene);
        controller.zoomButton();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}