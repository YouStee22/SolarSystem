package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Earth {
    int ORBIT = 160;
    Duration DUR = Duration.seconds(19);
    public PathTransition transition;
    public PathTransition moonTravels;
    public AnimationTimer timer;



    public void rotateMercury(ImageView earth) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(earth);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView earth, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(earth);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(howManyYears);
        transition.play();
    }



    public void animationMercury(ImageView earth) {
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                earth.rotateProperty().set(earth.getRotate() + 0.7);
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



    public void createMoon(ImageView earth, StackPane moonPane, ImageView moon) {

        moonPane.translateXProperty().bind(earth.translateXProperty());
        moonPane.translateYProperty().bind(earth.translateYProperty());

        Circle circle1 = new Circle(20);
        circle1.setFill(Color.TRANSPARENT);
        moonPane.getChildren().add(circle1);

        moonTravels = new PathTransition();
        moonTravels.setNode(moon);
        moonTravels.setDuration(Duration.seconds(4));
        moonTravels.setInterpolator(Interpolator.LINEAR);
        moonTravels.setPath(circle1);
        moonTravels.setCycleCount(PathTransition.INDEFINITE);
        moonTravels.play();
    }


}
