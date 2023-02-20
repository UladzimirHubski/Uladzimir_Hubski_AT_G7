package homework.day1.basetask;

public class TrainMethodsIfRunner {


    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(9));

        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(4000));

        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('g'));

        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(0.62f));

        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(401));

        trainMethodsIf.returnNewBoolean();

    }


}
