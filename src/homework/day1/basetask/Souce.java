package homework.day1.basetask;

public class Souce {

    private String name;
    private String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    void printSouceDetails() {
        System.out.println("Это соус " + this.name +" "+ this.color + " цвета");
    }


}

