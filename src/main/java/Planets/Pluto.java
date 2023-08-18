package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Pluto {

    int ORBIT = 440;
    Duration DUR = Duration.seconds(61);
    public PathTransition transition;
    public AnimationTimer timer;



    public void rotateJupiter(ImageView pluto) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(pluto);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView pluto, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(pluto);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(howManyYears);
        transition.play();
    }

    public void animationMercury(ImageView pluto) {
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                pluto.rotateProperty().set(pluto.getRotate() - 0.2);
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
}
