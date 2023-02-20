package homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        CycleMassive cycleMassive = new CycleMassive();
        cycleMassive.setArray();

        CycleMassivePrint cycleMassivePrint = new CycleMassivePrint();
        System.out.println("<-------Array Print ------>");// только для визуального разделения вывода информации методов Array
        cycleMassivePrint.arrayPrint();
        System.out.println();

        CycleMassiveMultFive cycleMassiveMultFive = new CycleMassiveMultFive();
        System.out.println("<-------Array Multiply Five ------>");
        cycleMassiveMultFive.arrayMultFive();
        System.out.println();

        CycleMassiveSquare cycleMassiveSquare = new CycleMassiveSquare();
        System.out.println("<-------Array Square ------>");
        cycleMassiveSquare.cycleArraySquare();
        System.out.println();

        CycleMassiveReverseOrder cycleMassiveReverseOrder = new CycleMassiveReverseOrder();
        System.out.println("<-------Reverse Order ------>");
        cycleMassiveReverseOrder.cycleArrayRevers();
        System.out.println();

        CycleMassiveMin cycleMassiveMin = new CycleMassiveMin();
        System.out.println("<-------Minimum number ------>");
        cycleMassiveMin.arrayMinimum();
        System.out.println();

        CycleMassiveChangeNumbers cycleMassiveChangeNumbers = new CycleMassiveChangeNumbers();
        System.out.println("<-------Change first and last numbers ------>");
        cycleMassiveChangeNumbers.arrayChangeNumbers();
        System.out.println();


        CycleMassiveSorting cycleMassiveSorting = new CycleMassiveSorting();
        System.out.println("<-------Array Sorting ------>");
        cycleMassiveSorting.arraySorting();
        System.out.println();

    }

}
