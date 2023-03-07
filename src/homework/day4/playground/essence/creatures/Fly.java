package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Fly extends Insects implements Flyable {
    public void fly(String direction){
        System.out.printf("I am %s, my name is %s and I'am flying to %s\n", getClass().getSimpleName(), nameInsects, direction);
    }
}
