package BaseTask;

public class Souce {
//    public static void main(String[] args) {
//        Souce souce = new Souce("винный", "красного");
//        souce.printSouceDetails();
//    }

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


//- создать класс Souce и в нем
//        -- строковое поле name
//        -- строковое поле color
//        -- конструктор, принимающий имя и цвет и инициализирующий соответствующие поля
//        -- геттеры и сеттеры на каждое поле
//        -- невозвратный метод printSouceDetails, который печатает в консоль информацию о соусе в виде "Это соус <имя соуса> <цвет соуса> цвета"