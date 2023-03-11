package homework.day4.playground.essence.utils;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int randomNumber = (int) (Math.random() * 79) + 1;
        System.out.println("I have generated point with value: " + randomNumber);
        return randomNumber;
    }
}
