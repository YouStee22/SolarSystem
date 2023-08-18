package Planets;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Venus {
    int ORBIT = 115;
    Duration DUR = Duration.seconds(15);
    public PathTransition transition;
    public AnimationTimer timer;



    public void rotateMercury(ImageView venus) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(venus);
        transition.setDuration(DUR);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setPath(circle);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
    }

    public void visualization(ImageView venus, int howManyYears) {
        Circle circle = new Circle(ORBIT);

        transition = new PathTransition();
        transition.setNode(venus);
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
                mercury.rotateProperty().set(mercury.getRotate() + 0.7);
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
