package classwork.day5;

import java.io.*;

public class ReadFile {
    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.xlsx"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("vvv");
        out.close();
    }


}
