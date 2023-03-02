package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Matter;

public class Animal extends Matter {
    protected String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void eat(Plant food) {
        System.out.printf("I am %N and I am eating %D", getName(), food.getNamePlant());
    }

}
