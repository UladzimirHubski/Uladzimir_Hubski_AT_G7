package BaseTask;

public class TrainMethodsIf {


    //public static void main(String[] args) {
    //   new TrainMethodsIf().returnNewInt();
    // new TrainMethodsIf().returnNewLong();
    //  new TrainMethodsIf().returnNewChar();
    //  new TrainMethodsIf().returnNewFloat();
    //  new TrainMethodsIf().returnNewDouble();
    //  new TrainMethodsIf().returnNewBoolean();
    // /}

    public int returnNewInt(int a) {
        if (a <= 8) {
            a = a * 7;
        } else {
            a = a / 4;
        }
        return a;
    }


    public long returnNewLong(long b) {
        if (b > 300) {
            b = b - 300;
        } else {
            b = b + 20;
        }
        return b;

    }

    public String returnNewChar(char c) {
        if (c == 'g') {
            return "go";
        } else {
            return "o" + c;
        }
        //return returnNewChar;
    }

    public float returnNewFloat(float d) {


        if (d == 0.67f) {
            d = d;
        } else {
            d = d * 2;
        }
        return d;
    }

    public double returnNewDouble(double e) {

        if (e > 30 & e < 80) {
            e = e + 87;
        } else if (e > 80 & e < 400) {
            e = e - 87;
        } else {
            e = e;
        }
        return e;
    }


    public void returnNewBoolean() {
        boolean returnNewBoolean = true;

        if (returnNewBoolean == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }

    }


}

