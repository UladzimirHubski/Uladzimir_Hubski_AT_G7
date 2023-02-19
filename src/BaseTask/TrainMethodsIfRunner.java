package BaseTask;

public class TrainMethodsIfRunner {



    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println( trainMethodsIf.returnNewInt(9));

        System.out.println( trainMethodsIf.returnNewLong(4000));

        System.out.println( trainMethodsIf.returnNewChar('g'));

        System.out.println( trainMethodsIf.returnNewFloat(0.62f));

        System.out.println( trainMethodsIf.returnNewDouble(90));

        trainMethodsIf.returnNewBoolean();

    }


}
