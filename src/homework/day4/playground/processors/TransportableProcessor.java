package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.essence.utils.CoordinatesGenerator;


public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB){
        transportable.move(pointA, pointB);
    }

    public void runTransportable(Transportable transportable) {
        transportable.move(CoordinatesGenerator.generateCoordinate());
    }



}
