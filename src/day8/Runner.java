package day8;

public class Runner {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();
        mClass.justMethod(() -> 3.14151926);
        mClass.justMethod(() -> {
            double pi = 3.14151926;
            return pi;
        });
    }
}