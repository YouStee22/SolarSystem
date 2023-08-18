package Planets;

import javafx.animation.AnimationTimer;
import javafx.scene.image.ImageView;

public class Sun {
    public AnimationTimer timer;

    public void animationSun(ImageView sun) {
         timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                sun.rotateProperty().set(sun.getRotate() + 0.1);
            }
        };
        timer.start();
    }
}
