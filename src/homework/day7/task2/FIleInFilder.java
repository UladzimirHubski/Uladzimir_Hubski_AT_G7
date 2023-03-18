package homework.day7.task2;

import java.io.File;
import java.util.Scanner;

public class FIleInFilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String path = scanner.nextLine();
            if (path == "stop") {
                break;
            } else {
                File directory = new File(path);
                File[] filesAndFolders = directory.listFiles();
                for (File fileOrFolder : filesAndFolders) {
                    System.out.println(fileOrFolder.getName());
                }
            }
        }
    }
}
