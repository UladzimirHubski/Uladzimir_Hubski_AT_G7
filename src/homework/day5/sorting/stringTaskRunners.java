package homework.day5.sorting;

public class stringTaskRunners {

    public static void main(String[] args) {

        Task1_1 Task1_1 = new Task1_1();
        Task1_1.printLetters("big text big text1");

        Task1_2 Task1_2 = new Task1_2();
        Task1_2.printDuplicates("big text big world small world small");

        Task1_4 Task1_4 = new Task1_4();
        Task1_4.printLog("access_log.2020.09.07 212.168.101.5 granted " +
                "access_log.2020.09.07 212.168.101.6 denied " +
                "access_log.2020.09.07 212.168.101.6 denied " +
                "access_log.2020.09.07 212.168.122.6 denied ");

        Task1_3  task1_3 = new Task1_3();
        task1_3.printInts("adad 1 adad a2ad aa 3asdasda 4 5 6 7 8adad8asd");
    }
}
