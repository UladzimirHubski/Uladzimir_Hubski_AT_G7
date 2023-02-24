package project.boxing;

import project.water.Bubbles;
import project.water.SparklingWater;

public class Bottle {
    private SparklingWater water;
    private double volume;

    public Bottle(double volume) {
        this.volume = volume;
        this.water = new SparklingWater();
        Bubbles[] bubbles = new Bubbles[(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubbles();
        }
        water.pump(bubbles);
    }

    public void open() {
        water.degas();
    }


}
