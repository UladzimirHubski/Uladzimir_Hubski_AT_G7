package homework.day1.basetask;

public class TrainMethodsObjects {

    Mouse mouse = new Mouse("m1", 10);
    Souce souce = new Souce("s1", "r1");
    Bee bee = new Bee("male", 10);
    Obstacle obstacle = new Obstacle("HightAlarm", "Alarm");
    Pineapple pineapple = new Pineapple("new", 0.6d);


    public void processMouse() {
        System.out.println(mouse.getName() + "  " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce() {
        System.out.println(souce.getColor() + "  " + souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee() {
        System.out.println(bee.getGender() + " " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle() {
        System.out.println(obstacle.getDescription() + "  " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple() {
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }

}
