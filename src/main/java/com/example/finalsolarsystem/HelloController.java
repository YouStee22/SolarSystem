package com.example.finalsolarsystem;

import Planets.*;
import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HelloController implements Initializable {
    AnimationTimer timer;
    Scene scene;
    Stage stage;
    @FXML
    PerspectiveCamera camera;
    @FXML
    ImageView sun;
    @FXML
    ImageView mercury;
    @FXML
    ImageView venus;
    @FXML
    ImageView earth;
    @FXML
    ImageView moon;
    @FXML
    StackPane moonPane;
    @FXML
    ImageView mars;
    @FXML
    ImageView jupiter;
    @FXML
    ImageView saturn;
    @FXML
    StackPane saturnMoonPane;
    @FXML
    ImageView saturnMoon1;
    @FXML
    ImageView saturnMoon2;
    @FXML
    ImageView saturnMoon3;
    @FXML
    ImageView saturnMoon4;
    @FXML
    ImageView saturnMoon5;
    @FXML
    ImageView uran;
    @FXML
    ImageView neptun;
    @FXML
    ImageView pluto;

    @FXML
    Text mercuryDurationInfo;
    @FXML
    Text venusDurationInfo;
    @FXML
    Text earthDurationInfo;
    @FXML
    Text marsDurationInfo;
    @FXML
    Text jupiterDurationInfo;
    @FXML
    Text saturnDurationInfo;
    @FXML
    Text uranDurationInfo;
    @FXML
    Text neptunDurationInfo;
    @FXML
    Text plutoDurationInfo;
    @FXML
    Line line;
    @FXML
    Text infoLine;


    @FXML
    Label liveSign;
    @FXML
    ImageView liveSignImage;
    @FXML
    ImageView pauseImage;
    @FXML
    Button pauseButton;
    @FXML
    Text zoomText;
    @FXML
    Text zoomText1;
    @FXML
    Text zoomText2;
    @FXML
    Text zoomText3;
    @FXML
    TextField YEARS_TO_TRAVEL;
    @FXML
    Button YEARS_TO_TRAV_BUTT;
    @FXML
    Label visualizationSign;
    @FXML
    Label stopper;
    @FXML
    Label stopperVisualization;
    @FXML
    Button Duration;

    Sun sun1 = new Sun();
    Mercury mercury1 = new Mercury();
    Venus venus1 = new Venus();
    Earth earth1 = new Earth();
    Mars mars1 = new Mars();
    Jupiter jupiter1 = new Jupiter();
    Saturn saturn1 = new Saturn();
    Uran uran1 = new Uran();
    Neptun neptun1 = new Neptun();
    Pluto pluto1 = new Pluto();
    ControllerPlanetsObjects controllerPlanetsObject;
    HelloController helloController;
    AnimationTimer timerRed;
    YearForEachPlanetInfo inform;



    //DURATION+===============================================================================================

    //DURATION+===============================================================================================



    public void setStageAndScene(Stage stage, Scene scene) {
        this.stage = stage;
        this.scene = scene;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        controllerPlanetsObject = new ControllerPlanetsObjects(sun1, mercury1, venus1, earth1, mars1, jupiter1, saturn1, uran1, neptun1, pluto1,
                sun, mercury, venus, earth, moon, moonPane, mars, jupiter, saturn, saturnMoonPane, saturnMoon1,
                saturnMoon2, saturnMoon3, saturnMoon4, saturnMoon5, uran, neptun, pluto);

        zoomTextOpacity();
        inform = new YearForEachPlanetInfo(mercuryDurationInfo, venusDurationInfo, earthDurationInfo, marsDurationInfo,
                jupiterDurationInfo, saturnDurationInfo, uranDurationInfo, neptunDurationInfo, plutoDurationInfo, infoLine, line);

        visualizationSign.setVisible(false);
        liveSignImage.setVisible(false);
        pauseImage.setVisible(false);

        rotatePlanetsAnimation();
        timer(true);
    }

    public void lifeSignLabel(boolean to) {
        if (to) {
            liveSignImage.setVisible(true);
            liveSign.setStyle("-fx-text-fill: #F44336;" +
                    "-fx-border-color: red;" +
                    "-fx-border-width: 2px; " +
                    "-fx-border-radius: 5px;");
            liveSign.setOpacity(1);
        } else {
            liveSignImage.setVisible(false);
            liveSign.setStyle("-fx-text-fill: white;" +
                    "-fx-border-color: white;" +
                    "-fx-border-width: 2px; " +
                    "-fx-border-radius: 5px;");

            liveSign.setOpacity(0);
        }
    }

    public void pauseButtonClick() {
        pauseButton.setOnAction(event -> {
            lifeSignLabel(true);

            if (pauseImage.isVisible()) {
                pauseImage.setVisible(false);
                pauseButton.setStyle("-fx-text-fill: white;" +
                        "-fx-background-color: transparent;" +
                        "-fx-border-color: white;" +
                        "-fx-border-width: 2px; " +
                        "-fx-border-radius: 5px;");

                controllerPlanetsObject.play();
                timer.start();

            } else {
                lifeSignLabel(false);

                pauseImage.setVisible(true);
                pauseButton.setStyle("-fx-text-fill: #F44336;" +
                        "-fx-background-color: transparent;" +
                        "-fx-border-color: red;" +
                        "-fx-border-width: 2px; " +
                        "-fx-border-radius: 5px;");

                controllerPlanetsObject.stop();
                timer.stop();
            }
        });
    }

    public void zoomButton() {
        scene.setCamera(camera);

        sun.translateXProperty().set(sun.getX());
        sun.translateYProperty().set(sun.getY());

        stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                case W:
                    controllerPlanetsObject.zoomIn();
                    break;
                case S:
                    controllerPlanetsObject.zoomOut();
                    break;
            }
        });
    }

    public void zoomTextOpacity() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int sec = 80;

            @Override
            public void run() {

                zoomText.setOpacity(zoomText.getOpacity() - 0.015);
                zoomText1.setOpacity(zoomText1.getOpacity() - 0.015);
                zoomText2.setOpacity(zoomText2.getOpacity() - 0.015);
                zoomText3.setOpacity(zoomText3.getOpacity() - 0.015);
                sec--;
            }
        };
        timer.schedule(task, 0, 150);
    }

    public void rotatePlanetsAnimation() {

        lifeSignLabel(true);
        controllerPlanetsObject.rotatePlanetsAnimation();
    }

    public void visualization() {
        int counts = 0;
        if (!Character.isDigit(YEARS_TO_TRAVEL.getText().charAt(0))) {
            alert("Wprowadź cyfrę!");
        } else {
            counts = Integer.parseInt(YEARS_TO_TRAVEL.getText());

            controllerPlanetsObject.stopPreviousAnimation();
            controllerPlanetsObject.setDurationForVisualization(counts);

            setTimer(counts);

            timer();
            timerRed.start();
            YEARS_TO_TRAVEL.setText("");
            YEARS_TO_TRAV_BUTT.setVisible(false);
            pauseButton.setVisible(false);
            Duration.setVisible(false);
            inform.turnOffInformation();
        }
    }

    public void setTimer(int counts) {
        lifeSignLabel(false);
        visualizationSign.setVisible(true);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 10 * counts + 1;

            @Override
            public void run() {
                count--;
                if (count == 0) {
                    visualizationSign.setVisible(false);
                    YEARS_TO_TRAV_BUTT.setVisible(true);
                    pauseButton.setVisible(true);
                    Duration.setVisible(true);
                    inform.turnOnInformation();
                    playAnimationBack();

                    stopperVisualization.setLayoutX(-3);
                    stopperVisualization.setLayoutY(35);
                    timerRed.stop();
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }

    public void timer() {
        stopperVisualization.setOpacity(1);
        stopperVisualization.setLayoutX(440);
        stopperVisualization.setLayoutY(278);

        long startTime = System.nanoTime();

        timerRed = new AnimationTimer() {
            @Override
            public void handle(long now) {

                long elapsedTime = now - startTime;
                long milliseconds = elapsedTime % 100;
                long seconds = elapsedTime / 1_000_000_000;
                long minutes = seconds / 60;

                String timeText = String.format("%02d : %02d : %02d", minutes % 60, seconds % 60, milliseconds);
                stopperVisualization.setText(timeText);
            }
        };
        timerRed.start();
    }
    public void playAnimationBack() {
        lifeSignLabel(true);

        controllerPlanetsObject.playBackAnimation();
    }

    public void timer(boolean running) {
        long startTime = System.nanoTime();

        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (running) {
                    long elapsedTime = now - startTime;
                    long milliseconds = elapsedTime % 100;
                    long seconds = elapsedTime / 1_000_000_000;
                    long minutes = seconds / 60;
                    long hours = minutes / 60;

                    String timeText = String.format("%02d : %02d : %02d : %02d", hours, minutes % 60, seconds % 60, milliseconds);
                    stopper.setText(timeText);
                }
            }
        };
        timer.start();

    }

    public void setDurationButton() throws IOException {
        Stage popOutWindow = new Stage();
        popOutWindow.setTitle("Duration settings");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StageOne.fxml"));
        Scene scene = new Scene(loader.load(), 300, 400);
        DurationController durationController = loader.getController();

        durationController.setControlPlanets(controllerPlanetsObject);
        durationController.setNewAnimation(helloController);
        durationController.setTextInformation(mercuryDurationInfo, venusDurationInfo, earthDurationInfo, marsDurationInfo, jupiterDurationInfo
                    ,saturnDurationInfo, uranDurationInfo, neptunDurationInfo, plutoDurationInfo);
        durationController.setStage(popOutWindow);

        popOutWindow.setScene(scene);
        popOutWindow.show();
    }

    @FXML
    public void alert(String typeOfAlert) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Błąd");
        alert.setContentText(typeOfAlert);
        Optional<ButtonType> result = alert.showAndWait();
    }

    public void setControler(HelloController helloController) {
        this.helloController = helloController;
        System.out.println(helloController);
    }

}