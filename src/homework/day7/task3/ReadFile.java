package homework.day7.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));

        String line;
        int punct = 0;
        int word = 0;
        int count;

        if ((line = in.readLine()) != null) {
            String[] wordnumber = line.split("[\\p{Punct}\\d\\s]");
            System.out.println(line);
            word = wordnumber.length;
            count = line.replaceAll("\\p{Punct}", "").length();
            punct = (punct + count);
            System.out.printf("Знаки препинания - %s, слова - %s.", punct, word).println();
        } else {
            System.out.printf("Файл пустой");
        }
    }
}



