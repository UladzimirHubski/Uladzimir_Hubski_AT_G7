package classwork.day6;

import java.util.Scanner;

public class StopSL {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming == "stop") {
                break;
            } else {
                System.out.printf("Just got %s text \n", incoming);
            }
        }
    }
}
