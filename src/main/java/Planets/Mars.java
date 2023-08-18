package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Mars {
    int ORBIT = 200;
    Duration DUR = Duration.seconds(24);
    public PathTransition transition;
    public AnimationTimer timer;



    public void rotateMars(ImageView mars) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(mars);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView mars, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(mars);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(howManyYears);
        transition.play();
    }

    public void animationMercury(ImageView mars) {
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                mars.rotateProperty().set(mars.getRotate() + 0.7);
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
