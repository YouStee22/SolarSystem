package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Mercury {
    int ORBIT = 90;
    Duration DUR = Duration.seconds(10);
    public PathTransition transition;
    public AnimationTimer timer;


    public void rotateMercury(ImageView mercury) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(mercury);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView mercury, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(mercury);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(howManyYears);
        transition.play();
    }

    public void animationMercury(ImageView mercury) {
         timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                mercury.rotateProperty().set(mercury.getRotate() + 1);
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
