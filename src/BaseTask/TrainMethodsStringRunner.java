package BaseTask;

public class TrainMethodsStringRunner extends TrainMethodsString {
    public static void main(String[] args) {
        TrainMethodsString trainMethodsString = new TrainMethodsString();

        trainMethodsString.printPapa();
        trainMethodsString.printPapa();
        trainMethodsString.printMama();
        trainMethodsString.printMamaString();
        trainMethodsString.printString();
    }

}

//    создать класс TrainMethodsString и в нем
//-- создать невозвратный метод printMama, который ничего не принимает на вход печатает в консоль «мама мыла раму»
//        -- создать невозвратный метод printPapa, который ничего не принимает на вход печатает в консоль «папа мыла раму»
//        -- создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
//        -- создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку
//        -- создать класс TrainMethodsStringRunner с методом main, в этом методе создать обьект класса TrainMethodsString и вызвать всего его методы