package project.water;

public class SparklingWater extends Water {

    private Bubbles[] bubbles;

    public void pump(Bubbles[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
                for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                bubbles[i].cramp();
            }
        }
    }
}
