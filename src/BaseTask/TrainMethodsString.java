package BaseTask;

public class TrainMethodsString {


    public void printMama() {
        System.out.println("мама мыла раму");
    }

    public void printPapa() {
        System.out.println("папа мыл раму");
    }

    public void printString() {
        String printString = "Java";
        System.out.println(printString);
    }

    public void printMamaString() {
        String printString = "Java";
        System.out.println("мама мыла " + printString);
    }


}

//    создать класс TrainMethodsString и в нем
//-- создать невозвратный метод printMama, который ничего не принимает на вход печатает в консоль «мама мыла раму»
//        -- создать невозвратный метод printPapa, который ничего не принимает на вход печатает в консоль «папа мыла раму»
//        -- создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
//        -- создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку
//        -- создать класс TrainMethodsStringRunner с методом main, в этом методе создать обьект класса TrainMethodsString и вызвать всего его методы
