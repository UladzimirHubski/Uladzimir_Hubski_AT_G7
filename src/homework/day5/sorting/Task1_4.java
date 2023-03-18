package homework.day5.sorting;

import java.util.Arrays;

public class Task1_4 {
    public void printLog(String text) {
        String[] arrayLog = text.replaceAll("access_log.\\d{4}.\\d{2}.\\d{2} ", "").split("\\n"); // удаляем по примеру с пробелом и разбваем кажду строку на ячейку массива
        System.out.println(Arrays.toString(arrayLog));
        String[][] logLines = new String[arrayLog.length][3];
        int nuberRecord = 0;

        for (String[] logLine : logLines) {
            for (int i = 0; i < 3; i++) {
                logLine[i] = "0";              //заполнил двумерный массив нулями
            }
            System.out.println(Arrays.toString(logLine));
        }
//
//
//        for (String logLine : arrayLog) {
//
//            String[] everLine = logLine.split(" ");
//
//            for (String[] logLine : arrayLog) {
//                if (everLine[0].equals(logLine[0]) || logLine[0].equals("0")) {
//                    if (logLine[0].equals("0")) {
//                        nuberRecord++;
//                        logLine[0] = everLine[0];
//                    }
//                }
//
//            }
//        }
    }
}

