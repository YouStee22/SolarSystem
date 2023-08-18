package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Saturn {
    int ORBIT = 320;
    Duration DUR = Duration.seconds(36);
    public PathTransition transition;
    public AnimationTimer timer;
    public PathTransition moonTravels;
    public PathTransition moonTravels2;
    public PathTransition moonTravels3;
    public PathTransition moonTravels4;
    public PathTransition moonTravels5;



    public void rotateJupiter(ImageView saturn) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(saturn);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView saturn, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(saturn);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(howManyYears);
        transition.play();
    }

    public void animationMercury(ImageView saturn) {
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                saturn.rotateProperty().set(saturn.getRotate() - 0.2);
            }
        };
        timer.start();
    }


    public Duration getDUR() {
        return DUR;
    }

    public void setDUR(Duration DUR) {
        this.DUR = DUR;
    }

    public void createMoon(ImageView saturn, StackPane saturnMoonPane, ImageView saturnMoon, ImageView saturnMoon2, ImageView saturnMoon3,
                           ImageView saturnMoon4, ImageView saturnMoon5) {

        saturnMoonPane.translateXProperty().bind(saturn.translateXProperty());
        saturnMoonPane.translateYProperty().bind(saturn.translateYProperty());

        Circle circle1 = new Circle(30);
        circle1.setFill(Color.TRANSPARENT);
        saturnMoonPane.getChildren().add(circle1);

        moonTravels = new PathTransition();
        moonTravels.setNode(saturnMoon);
        moonTravels.setDuration(Duration.seconds(5));
        moonTravels.setInterpolator(Interpolator.LINEAR);
        moonTravels.setPath(circle1);
        moonTravels.setCycleCount(PathTransition.INDEFINITE);
        moonTravels.play();


        Circle circle2 = new Circle(30);
        circle2.setRotate(180);
        circle2.setFill(Color.TRANSPARENT);
        saturnMoonPane.getChildren().add(circle2);

        moonTravels2 = new PathTransition();
        moonTravels2.setNode(saturnMoon2);
        moonTravels2.setDuration(Duration.seconds(6));
        moonTravels2.setInterpolator(Interpolator.LINEAR);
        moonTravels2.setPath(circle2);
        moonTravels2.setCycleCount(PathTransition.INDEFINITE);
        moonTravels2.play();

        Circle circle3 = new Circle(30);
        circle3.setRotate(300);
        circle3.setFill(Color.TRANSPARENT);
        saturnMoonPane.getChildren().add(circle3);

        moonTravels3 = new PathTransition();
        moonTravels3.setNode(saturnMoon3);
        moonTravels3.setDuration(Duration.seconds(5));
        moonTravels3.setInterpolator(Interpolator.LINEAR);
        moonTravels3.setPath(circle3);
        moonTravels3.setCycleCount(PathTransition.INDEFINITE);
        moonTravels3.play();

        Circle circle4 = new Circle(30);
        circle4.setRotate(240);
        circle4.setFill(Color.TRANSPARENT);
        saturnMoonPane.getChildren().add(circle4);

        moonTravels4 = new PathTransition();
        moonTravels4.setNode(saturnMoon4);
        moonTravels4.setDuration(Duration.seconds(3));
        moonTravels4.setInterpolator(Interpolator.LINEAR);
        moonTravels4.setPath(circle4);
        moonTravels4.setCycleCount(PathTransition.INDEFINITE);
        moonTravels4.play();


        Circle circle5 = new Circle(30);
        circle5.setRotate(200);
        circle5.setFill(Color.TRANSPARENT);
        saturnMoonPane.getChildren().add(circle5);

        moonTravels5 = new PathTransition();
        moonTravels5.setNode(saturnMoon5);
        moonTravels5.setDuration(Duration.seconds(4));
        moonTravels5.setInterpolator(Interpolator.LINEAR);
        moonTravels5.setPath(circle5);
        moonTravels5.setCycleCount(PathTransition.INDEFINITE);
        moonTravels5.play();
    }
}
