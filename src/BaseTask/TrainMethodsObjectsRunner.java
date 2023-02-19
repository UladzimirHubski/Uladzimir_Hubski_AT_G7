package BaseTask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse();
        trainMethodsObjects.processSouce();
        trainMethodsObjects.processBee();
        trainMethodsObjects.processObstacle();
        trainMethodsObjects.processPineapple();


//        Mouse mouse = new Mouse("m1", 10);
//        mouse.printMouseDetails();
//        Souce souce = new Souce("s1","r1");
//        souce.printSouceDetails();
//        Bee bee = new Bee("male", 10);
//        bee.printBeeDetails();
//        Obstacle obstacle = new Obstacle("HightAlarm","Alarm");
//        obstacle.printObstacleDetails();
//        Pineapple pineapple = new Pineapple("new", 0.6d);
//        pineapple.printPineappleDetails();

    }

}
//    -- создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект класса TrainMethodsObjects, и вызвать всего его методы
//-- создать метод processMouse, который принимает на вход обьект мыши (Mouse)  печатает в консоль ее имя, возраст и вызывающий метод printMouseDetails
//-- создать метод processSouce, который принимает на вход обьект соуса (Souce) и печатает в консоль его имя, цвет и вызывающий метод printSouceDetails
//-- создать метод processBee, который принимает на вход обьект пчелы (Bee) и печатает в консоль ее пол, вес и вызывающий метод printBeeDetails
//-- создать метод processObstacle, который принимает на вход обьект препятствия (Obstacle) и печатает в консоль его описание, важность и вызывающий метод printObstacleDetails
//-- создать метод processPineapple, который принимает на вход обьект ананаса (Pineapple)  печатает в консоль его сорт, теплоемкость и вызывающий метод printPineappleDetails
