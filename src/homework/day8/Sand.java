package homework.day8;

import java.util.Objects;

public class Sand {
    private int weigh;
    private String name;

    public Sand(int weigh, String name) {
        this.weigh = weigh;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sand{" + "weigh=" + weigh + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sand sand = (Sand) o;
        return weigh == sand.weigh && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weigh, name);
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
