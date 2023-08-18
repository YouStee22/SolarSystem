package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Jupiter {
    int ORBIT = 250;
    Duration DUR = Duration.seconds(30);
    public PathTransition transition;
    public AnimationTimer timer;



    public void rotateJupiter(ImageView jupiter) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(jupiter);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView jupiter, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(jupiter);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(howManyYears);
        transition.play();
    }

    public void animationMercury(ImageView jupiter) {
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                jupiter.rotateProperty().set(jupiter.getRotate() + 0.7);
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
