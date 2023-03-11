package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.utils.DirectionGenerator;

public class RideableProcessor {


    public void runRideable(Rideable rideable){
        String direction = DirectionGenerator.generateDirection();
        this.runRideable(rideable, direction);
    }
    public static void runRideable(Rideable rideable){
        rideable.drive(direction);

    }
}
