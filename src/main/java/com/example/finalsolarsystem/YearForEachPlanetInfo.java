package com.example.finalsolarsystem;

import javafx.fxml.FXML;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class YearForEachPlanetInfo {
    Text mercuryDurationInfo;
    Text venusDurationInfo;
    Text earthDurationInfo;
    Text marsDurationInfo;
    Text jupiterDurationInfo;
    Text saturnDurationInfo;
    Text uranusDurationInfo;
    Text neptuneDurationInfo;
    Text plutoDurationInfo;
    Text infoLine;
    Line line;

    public YearForEachPlanetInfo(Text mercuryDurationInfo, Text venusDurationInfo, Text earthDurationInfo, Text marsDurationInfo, Text jupiterDurationInfo, Text saturnDurationInfo, Text uranusDurationInfo, Text neptuneDurationInfo, Text plutoDurationInfo, Text infoLine, Line line) {
        this.mercuryDurationInfo = mercuryDurationInfo;
        this.venusDurationInfo = venusDurationInfo;
        this.earthDurationInfo = earthDurationInfo;
        this.marsDurationInfo = marsDurationInfo;
        this.jupiterDurationInfo = jupiterDurationInfo;
        this.saturnDurationInfo = saturnDurationInfo;
        this.uranusDurationInfo = uranusDurationInfo;
        this.neptuneDurationInfo = neptuneDurationInfo;
        this.plutoDurationInfo = plutoDurationInfo;
        this.infoLine = infoLine;
        this.line = line;
    }

    public void turnOffInformation() {
        mercuryDurationInfo.setVisible(false);
        venusDurationInfo.setVisible(false);
        earthDurationInfo.setVisible(false);
        marsDurationInfo.setVisible(false);
        jupiterDurationInfo.setVisible(false);
        saturnDurationInfo.setVisible(false);
        uranusDurationInfo.setVisible(false);
        neptuneDurationInfo.setVisible(false);
        plutoDurationInfo.setVisible(false);
        infoLine.setVisible(false);
        line.setVisible(false);
    }
    public void turnOnInformation() {
        mercuryDurationInfo.setVisible(true);
        venusDurationInfo.setVisible(true);
        earthDurationInfo.setVisible(true);
        marsDurationInfo.setVisible(true);
        jupiterDurationInfo.setVisible(true);
        saturnDurationInfo.setVisible(true);
        uranusDurationInfo.setVisible(true);
        neptuneDurationInfo.setVisible(true);
        plutoDurationInfo.setVisible(true);
        infoLine.setVisible(true);
        line.setVisible(true);
    }
}
