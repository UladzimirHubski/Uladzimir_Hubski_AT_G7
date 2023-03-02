package homework.day4.playground.essence.creatures;

public class Vertebrata extends Animal {


    public void eat(Insects food){
        System.out.printf("I am %N and I am eating %D", getName(), food.getNameInsects());
    }

}
