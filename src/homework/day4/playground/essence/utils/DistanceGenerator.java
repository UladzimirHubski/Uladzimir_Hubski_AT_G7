package homework.day4.playground.essence.utils;

public class DistanceGenerator {
    public static int generateDistance() {
        int randomDistance = (int) (Math.random() * 99) ;
        System.out.println("DistanceGenerator: I have generated distance with value: " + randomDistance);
        return randomDistance;
    }

}
