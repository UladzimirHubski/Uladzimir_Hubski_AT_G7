package BaseTask;

public class Bee {

//    public static void main(String[] args) {
//        Bee bee = new Bee("винный", 10);
//        bee.printBeeDetails();
//    }

    public String gender;
    public Long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }


    public long getWeight() {
        return weight;
    }

    void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / this.weight + " раз");
    }


}

//    создать класс Bee и в нем
//-- строковое поле gender
//        -- длинное целочисленное поле weight
//        -- конструктор, принимающий пол и массу и инициализирующий соответствующие поля
//        -- геттеры и сеттеры на каждое поле
//        -- невозвратный метод printBeeDetails, который делит 500 кг на массу пчелы и печатает в консоль информацию о ней в виде "Я легче лося в <> раз"
