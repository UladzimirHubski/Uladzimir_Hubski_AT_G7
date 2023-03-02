package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.Matter;

public abstract class Container extends Matter {

    protected String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
