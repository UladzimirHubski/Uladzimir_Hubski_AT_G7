package homework.day1.cycletask;

public class CycleFor {

    public static void main(String[] args) {
        for (int i = 3; i < 19; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
