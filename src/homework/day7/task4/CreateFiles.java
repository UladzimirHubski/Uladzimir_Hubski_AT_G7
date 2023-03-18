package homework.day7.task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFiles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String folder = "folder";
        String file = "file.txt";
        while (scanner.hasNext()) {
            String path = scanner.nextLine();
            if (path == "stop") {
                break;
            } else {
                File directory = new File(path);
                for (int i = 1; i <= 4; i++) {
                    directory = new File(directory.getPath() + "/" + folder + i);
                    directory.mkdir();
                }
            }
        }
    }
}
