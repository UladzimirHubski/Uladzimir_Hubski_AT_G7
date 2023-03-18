package homework.day7.task1;

import java.util.Scanner;

public class PrintConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming == "stop") {
                break;
            } else {
                System.out.printf("Hello, I just got '%s' from you! \n", incoming);
            }
        }
    }
}
