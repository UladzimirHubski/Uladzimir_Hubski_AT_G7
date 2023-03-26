package classwork.day8;

public class Runner1 {
    public static void main(String[] args) {
        MyClass1 mClass1 = new MyClass1();
        mClass1.justMethod1(x -> System.out.println("1. simple text " + x));

        mClass1.justMethod1(System.out::print);

        mClass1.justMethod1(x -> {
            String y = "2. text ";
            System.out.println(y + x + "1111");
        });
    }
}
