package com.example.finalsolarsystem;

import Planets.*;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

public class ControllerPlanetsObjects {
    Sun sun1;
    Mercury mercury1;
    Venus venus1;
    Earth earth1;
    Mars mars1;
    Jupiter jupiter1;
    Saturn saturn1;
    Uran uran1;
    Neptun neptun1;
    Pluto pluto1;


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



    AnimationTimer timers;


    public ControllerPlanetsObjects(Sun sun1, Mercury mercury1, Venus venus1, Earth earth1, Mars mars1, Jupiter jupiter1,
                                    Saturn saturn1, Uran uran1, Neptun neptun1, Pluto pluto1, ImageView sun, ImageView mercury,
                                    ImageView venus, ImageView earth, ImageView moon, StackPane moonPane, ImageView mars,
                                    ImageView jupiter, ImageView saturn, StackPane saturnMoonPane, ImageView saturnMoon1,
                                    ImageView saturnMoon2, ImageView saturnMoon3, ImageView saturnMoon4, ImageView saturnMoon5,
                                    ImageView uran, ImageView neptun, ImageView pluto) {
        this.sun1 = sun1;
        this.mercury1 = mercury1;
        this.venus1 = venus1;
        this.earth1 = earth1;
        this.mars1 = mars1;
        this.jupiter1 = jupiter1;
        this.saturn1 = saturn1;
        this.uran1 = uran1;
        this.neptun1 = neptun1;
        this.pluto1 = pluto1;
        this.sun = sun;
        this.mercury = mercury;
        this.venus = venus;
        this.earth = earth;
        this.moon = moon;
        this.moonPane = moonPane;
        this.mars = mars;
        this.jupiter = jupiter;
        this.saturn = saturn;
        this.saturnMoonPane = saturnMoonPane;
        this.saturnMoon1 = saturnMoon1;
        this.saturnMoon2 = saturnMoon2;
        this.saturnMoon3 = saturnMoon3;
        this.saturnMoon4 = saturnMoon4;
        this.saturnMoon5 = saturnMoon5;
        this.uran = uran;
        this.neptun = neptun;
        this.pluto = pluto;
    }

    public void play() {

        sun1.timer.start();
        mercury1.timer.start();
        venus1.timer.start();
        earth1.timer.start();
        mars1.timer.start();
        saturn1.timer.start();
        jupiter1.timer.start();
        uran1.timer.start();
        neptun1.timer.start();
        pluto1.timer.start();


        mercury1.transition.play();
        venus1.transition.play();
        earth1.transition.play();
        earth1.moonTravels.play();
        mars1.transition.play();
        jupiter1.transition.play();
        saturn1.transition.play();
        saturn1.moonTravels.play();
        saturn1.moonTravels2.play();
        saturn1.moonTravels3.play();
        saturn1.moonTravels4.play();
        saturn1.moonTravels5.play();
        uran1.transition.play();
        neptun1.transition.play();
        pluto1.transition.play();
    }
    public void stop() {
        sun1.timer.stop();
        mercury1.timer.stop();
        venus1.timer.stop();
        earth1.timer.stop();
        mars1.timer.stop();
        saturn1.timer.stop();
        jupiter1.timer.stop();
        uran1.timer.stop();
        neptun1.timer.stop();
        pluto1.timer.stop();

        mercury1.transition.pause();
        venus1.transition.pause();
        earth1.transition.pause();
        earth1.moonTravels.pause();
        mars1.transition.pause();
        jupiter1.transition.pause();
        saturn1.transition.pause();
        saturn1.moonTravels.pause();
        saturn1.moonTravels2.pause();
        saturn1.moonTravels3.pause();
        saturn1.moonTravels4.pause();
        saturn1.moonTravels5.pause();
        uran1.transition.pause();
        neptun1.transition.pause();
        pluto1.transition.pause();
    }
    public void zoomIn() {
        sun.translateZProperty().set(sun.getTranslateZ() - 50);
        mercury.translateZProperty().set(mercury.getTranslateZ() - 50);
        venus.translateZProperty().set(venus.getTranslateZ() - 50);
        earth.translateZProperty().set(earth.getTranslateZ() - 50);
        moon.translateZProperty().set(moon.getTranslateZ() - 50);
        mars.translateZProperty().set(mars.getTranslateZ() - 50);
        jupiter.translateZProperty().set(jupiter.getTranslateZ() - 50);
        saturn.translateZProperty().set(saturn.getTranslateZ() - 50);
        saturnMoonPane.translateZProperty().set(saturnMoonPane.getTranslateZ() - 50);
        uran.translateZProperty().set(uran.getTranslateZ() - 50);
        neptun.translateZProperty().set(neptun.getTranslateZ() - 50);
        pluto.translateZProperty().set(pluto.getTranslateZ() - 50);


    }
    public void zoomOut() {
        sun.translateZProperty().set(sun.getTranslateZ() + 50);
        mercury.translateZProperty().set(mercury.getTranslateZ() + 50);
        venus.translateZProperty().set(venus.getTranslateZ() + 50);
        earth.translateZProperty().set(earth.getTranslateZ() + 50);
        moon.translateZProperty().set(moon.getTranslateZ() + 50);
        mars.translateZProperty().set(mars.getTranslateZ() + 50);
        jupiter.translateZProperty().set(jupiter.getTranslateZ() + 50);
        saturn.translateZProperty().set(saturn.getTranslateZ() + 50);
        saturnMoonPane.translateZProperty().set(saturnMoonPane.getTranslateZ() + 50);
        uran.translateZProperty().set(uran.getTranslateZ() + 50);
        neptun.translateZProperty().set(neptun.getTranslateZ() + 50);
        pluto.translateZProperty().set(pluto.getTranslateZ() + 50);
    }
    public void rotatePlanetsAnimation() {
        sun1.animationSun(sun);

        mercury1.rotateMercury(mercury);
        mercury1.animationMercury(mercury);

        venus1.rotateMercury(venus);
        venus1.animationMercury(venus);

        earth1.rotateMercury(earth);
        earth1.animationMercury(earth);
        earth1.createMoon(earth, moonPane, moon);

        mars1.rotateMars(mars);
        mars1.animationMercury(mars);

        jupiter1.rotateJupiter(jupiter);
        jupiter1.animationMercury(jupiter);

        saturn1.rotateJupiter(saturn);
        saturn1.animationMercury(saturn);
        saturn1.createMoon(saturn, saturnMoonPane, saturnMoon1, saturnMoon2, saturnMoon3, saturnMoon4, saturnMoon5);

        uran1.rotateJupiter(uran);
        uran1.animationMercury(uran);

        neptun1.rotateJupiter(neptun);
        neptun1.animationMercury(neptun);

        pluto1.rotateJupiter(pluto);
        pluto1.animationMercury(pluto);
    }
    public void stopPreviousAnimation() {
        mercury1.transition.stop();
        venus1.transition.stop();
        earth1.transition.stop();
        mars1.transition.stop();
        jupiter1.transition.stop();
        saturn1.transition.stop();
        uran1.transition.stop();
        neptun1.transition.stop();
        pluto1.transition.stop();
    }
    public void setDurationForVisualization(int counts) {
        mercury1.setDUR(Duration.seconds(2));
        mercury1.visualization(mercury, counts);

        venus1.setDUR(Duration.seconds(3));
        venus1.visualization(venus, counts);

        earth1.setDUR(Duration.seconds(4));
        earth1.visualization(earth, counts);

        mars1.setDUR(Duration.seconds(5));
        mars1.visualization(mars, counts);

        jupiter1.setDUR(Duration.seconds(6));
        jupiter1.visualization(jupiter, counts);

        saturn1.setDUR(Duration.seconds(7));
        saturn1.visualization(saturn, counts);

        uran1.setDUR(Duration.seconds(8));
        uran1.visualization(uran, counts);

        neptun1.setDUR(Duration.seconds(9));
        neptun1.visualization(neptun, counts);

        pluto1.setDUR(Duration.seconds(10));
        pluto1.visualization(pluto, counts);
    }

    public void playBackAnimation() {

        mercury1.setDUR(Duration.seconds(10));
        venus1.setDUR(Duration.seconds(15));
        earth1.setDUR(Duration.seconds(19));
        mars1.setDUR(Duration.seconds(22));
        jupiter1.setDUR(Duration.seconds(25));
        saturn1.setDUR(Duration.seconds(27));
        uran1.setDUR(Duration.seconds(30));
        neptun1.setDUR(Duration.seconds(32));
        pluto1.setDUR(Duration.seconds(35));

        mercury1.rotateMercury(mercury);
        venus1.rotateMercury(venus);
        earth1.rotateMercury(earth);
        mars1.rotateMars(mars);
        jupiter1.rotateJupiter(jupiter);
        saturn1.rotateJupiter(saturn);
        uran1.rotateJupiter(uran);
        neptun1.rotateJupiter(neptun);
        pluto1.rotateJupiter(pluto);

    }
}
