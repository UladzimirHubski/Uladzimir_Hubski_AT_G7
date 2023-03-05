package homework.day4.playground.runners;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.craft.air.Aircraft;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.creatures.Fly;
import homework.day4.playground.essence.creatures.Mosquito;
import homework.day4.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {

        FlyableProcessor flyr = new FlyableProcessor();

        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        //Inset insectFly = new Fly(23, "Domestica Insect");
       // Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        flyr.runFlyable(flyableCopter);
        flyr.runFlyable(flyablePlane);
        flyr.runFlyable(flyableRocket);
        flyr.runFlyable(flyableFly);
        flyr.runFlyable(flyableMosquito);
        flyr.runFlyable(aircraftCopter);
        flyr.runFlyable(aircraftPlane);
        flyr.runFlyable(aircraftRocket);
        flyr.runFlyable(flyableCopter);
        //flyr.runFlyable(insectFly);
        //flyr.runFlyable(insectMosquito);
        flyr.runFlyable(aCopter);
        flyr.runFlyable(aPlane);
        flyr.runFlyable(aRocket);
        flyr.runFlyable(aFly);
        flyr.runFlyable(aMosquito);

    }
}
