package BaseTask;

public class Pineapple {

//    public static void main(String[] args) {
//        Pineapple pineapple = new Pineapple("стенка", 2141.0d);
//        pineapple.pprintPineappleDetails();
//    }

    private String grade;
    private double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }


    public double getHeatCapacity() {
        return heatCapacity;
    }

    void printPineappleDetails() {
        if (heatCapacity >= 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }

    }


}


//- создать класс Pineapple и в нем
//        -- строковое поле grade
//        -- дробное числовое поле heatCapacity
//        -- конструктор, принимающий сорт и теплоемкость и инициализирующий соответствующие поля
//        -- геттеры и сеттеры на каждое поле
//        -- невозвратный метод printPineappleDetails, который сравнивает теплоемкость ананаса с 2140 и если она больше, то печатает в консоль "Я ананас, теплоемкость которого больше, чем у ветчины", в противном случае печатает в консоль "В ветчине тепла запасется больше :("
