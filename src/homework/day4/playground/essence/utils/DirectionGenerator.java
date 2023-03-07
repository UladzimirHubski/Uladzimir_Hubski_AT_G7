package homework.day4.playground.essence.utils;

public class DirectionGenerator {
    public static String generateDirection() {
        int rNumber = (int) (Math.random() * 39) + 1;
        String direction = "";
                if (rNumber >= 1 && rNumber <= 9) {
            direction = "NORTH";

            } else if (rNumber >= 10 && rNumber <= 19) {
                 direction = "SOUTH";

                 } else if (rNumber >= 20 && rNumber <= 29) {
                         direction = "WEST";

                     } else if (rNumber >= 30 && rNumber <= 39) {
                                 direction = "EAST";
                     }
        return direction;
    }

}
