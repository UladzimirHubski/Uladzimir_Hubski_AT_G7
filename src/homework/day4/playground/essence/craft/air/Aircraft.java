package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.craft.Transportable;

public class Aircraft extends Matter implements Flyable, Transportable {
    protected String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
