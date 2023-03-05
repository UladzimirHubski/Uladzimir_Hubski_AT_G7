package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;

public class Vehicle extends Matter implements Transportable, Rideable {
    protected String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
