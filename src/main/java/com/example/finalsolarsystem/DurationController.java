package com.example.finalsolarsystem;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DurationController {
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
    TextField mercury;
    @FXML
    TextField venus;
    @FXML
    TextField earth;
    @FXML
    TextField mars;
    @FXML
    TextField jupiter;
    @FXML
    TextField saturn;
    @FXML
    TextField uran;
    @FXML
    TextField neptun;
    @FXML
    TextField pluto;
    ControllerPlanetsObjects controllerPlanetsObjects;
    Stage stage;

    List<Integer> dur = new LinkedList<>();
    public HelloController helloController;



    public void setControlPlanets(ControllerPlanetsObjects controllerPlanetsObjects) {
        this.controllerPlanetsObjects = controllerPlanetsObjects;

    }
    public void setTextInformation(Text mercuryDurationInfo, Text venusDurationInfo, Text earthDurationInfo, Text marsDurationInfo, Text jupiterDurationInfo
                    ,Text saturnDurationInfo, Text uranDurationInfo, Text neptunDurationInfo, Text plutoDurationInfo) {
        this.mercuryDurationInfo = mercuryDurationInfo;
        this.venusDurationInfo = venusDurationInfo;
        this.earthDurationInfo = earthDurationInfo;
        this.marsDurationInfo = marsDurationInfo;
        this.jupiterDurationInfo = jupiterDurationInfo;
        this.saturnDurationInfo = saturnDurationInfo;
        this.uranDurationInfo = uranDurationInfo;
        this.neptunDurationInfo = neptunDurationInfo;
        this.plutoDurationInfo = plutoDurationInfo;

    }

    public void acceptButton() {
        if (checkIfInteger()) {
            fillGaps();
            controllerPlanetsObjects.stopPreviousAnimation();

            if (dur.get(0) != 0) {
                controllerPlanetsObjects.mercury1.setDUR(Duration.seconds(dur.get(0)));
                String[] tab1 = mercuryDurationInfo.getText().split(" ");
                mercuryDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(0) + " " + tab1[3]);
            }
            if (dur.get(1) != 0) {
                controllerPlanetsObjects.venus1.setDUR(Duration.seconds(dur.get(1)));
                String[] tab1 = venusDurationInfo.getText().split(" ");
                venusDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(1) + " " + tab1[3]);
            }
            if (dur.get(2) != 0) {
                controllerPlanetsObjects.earth1.setDUR(Duration.seconds(dur.get(2)));
                String[] tab1 = earthDurationInfo.getText().split(" ");
                earthDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(2) + " " + tab1[3]);
            }
            if (dur.get(3) != 0) {
                controllerPlanetsObjects.mars1.setDUR(Duration.seconds(dur.get(3)));
                String[] tab1 = marsDurationInfo.getText().split(" ");
                marsDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(3) + " " + tab1[3]);
            }
            if (dur.get(4) != 0) {
                controllerPlanetsObjects.jupiter1.setDUR(Duration.seconds(dur.get(4)));
                String[] tab1 = jupiterDurationInfo.getText().split(" ");
                jupiterDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(4) + " " + tab1[3]);
            }
            if (dur.get(5) != 0) {
                controllerPlanetsObjects.saturn1.setDUR(Duration.seconds(dur.get(5)));
                String[] tab1 = saturnDurationInfo.getText().split(" ");
                saturnDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(5) + " " + tab1[3]);
            }
            if (dur.get(6) != 0) {
                controllerPlanetsObjects.uran1.setDUR(Duration.seconds(dur.get(6)));
                String[] tab1 = uranDurationInfo.getText().split(" ");
                uranDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(6) + " " + tab1[3]);
            }
            if (dur.get(7) != 0) {
                controllerPlanetsObjects.neptun1.setDUR(Duration.seconds(dur.get(7)));
                String[] tab1 = neptunDurationInfo.getText().split(" ");
                neptunDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(7) + " " + tab1[3]);
            }
            if (dur.get(8) != 0) {
                controllerPlanetsObjects.pluto1.setDUR(Duration.seconds(dur.get(8)));
                String[] tab1 = plutoDurationInfo.getText().split(" ");
                plutoDurationInfo.setText(tab1[0] + " " + tab1[1] + " " + dur.get(8) + " " + tab1[3]);
            }
            helloController.rotatePlanetsAnimation();
            stage.close();
        }
    }

    public void setNewAnimation(HelloController helloController) {
        this.helloController = helloController;
    }
    public void fillGaps() {
        if (mercury.getText().equals(""))
            mercury.setText("0");
        dur.add(Integer.valueOf(mercury.getText()));

        if (venus.getText().equals(""))
            venus.setText("0");
        dur.add(Integer.valueOf(venus.getText()));

        if (earth.getText().equals(""))
            earth.setText("0");
        dur.add(Integer.valueOf(earth.getText()));

        if (mars.getText().equals(""))
            mars.setText("0");
        dur.add(Integer.valueOf(mars.getText()));

        if (jupiter.getText().equals(""))
            jupiter.setText("0");
        dur.add(Integer.valueOf(jupiter.getText()));

        if (saturn.getText().equals(""))
            saturn.setText("0");
        dur.add(Integer.valueOf(saturn.getText()));

        if (uran.getText().equals(""))
            uran.setText("0");
        dur.add(Integer.valueOf(uran.getText()));

        if (neptun.getText().equals(""))
            neptun.setText("0");
        dur.add(Integer.valueOf(neptun.getText()));

        if (pluto.getText().equals(""))
            pluto.setText("0");
        dur.add(Integer.valueOf(pluto.getText()));
    }
    @FXML
    public void alert(String typeOfAlert) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Błąd");
        alert.setContentText(typeOfAlert);
        Optional<ButtonType> result = alert.showAndWait();
    }
    public boolean checkIfInteger() {
        String check = mercury.getText() + venus.getText() + earth.getText() + mars.getText() + jupiter.getText() +
                saturn.getText() + uran.getText() + neptun.getText() + pluto.getText();

        char[] areDigits = check.toCharArray();
        for (int i = 0; i < areDigits.length; i++) {
            if (!Character.isDigit(areDigits[i])) {
                alert("Podano błędną wartość, prosze wprowadzić cyfrę");
                return false;
            }
        }
        return true;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

}

