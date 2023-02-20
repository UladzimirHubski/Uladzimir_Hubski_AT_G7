package homework.day1.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int a) {
        if (a <= 8) {
            return a * 7;
        } else {
            return a / 4;
        }
    }


    public long returnNewLong(long b) {
        if (b > 300) {
            return b - 300;
        } else {
            return b + 20;
        }
    }

    public String returnNewChar(char c) {
        if (c == 'g') {
            return "go";
        } else {
            return "o" + c;
        }
    }

    public float returnNewFloat(float d) {

        if (d == 0.67f) {
            return d;
        } else {
            return d * 2;
        }
    }

    public double returnNewDouble(double e) {

        if (e > 30 & e < 80) {
            return e + 87;
        } else if (e > 80 & e < 400) {
            return e - 87;
        } else if (e > 400) {
            return e / 4;
        } else {
            return e;
        }
    }


    public void returnNewBoolean() {
        boolean returnNewBoolean = false;

        if (returnNewBoolean) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}

