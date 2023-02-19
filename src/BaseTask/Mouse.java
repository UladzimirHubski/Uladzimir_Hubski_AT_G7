package BaseTask;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mouse {
//    public static void main(String[] args) {
//        Mouse mouse = new Mouse("Mo", 15);
//        mouse.printMouseDetails();
//    }

        private String name;
        private int age;

    public Mouse(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void setName (String name){
            this.name = name;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public String getName () {
            return name;
        }


        public int getAge () {
            return age;
        }

        void printMouseDetails () {
            System.out.println("Я мышь, меня зовут " + this.name + " и мне " + this.age + " лет");
        }

}




//- создать класс Mouse и в нем
//        -- строковое поле name
//        -- целочисленное поле age
//        -- конструктор, принимающий имя и возраст и инициализирующий соответствующие поля
//        -- геттеры и сеттеры на каждое поле
//        -- невозвратный метод printMouseDetails, который печатает в консоль информацию о мыши в виде "Я мышь, меня зовут <имя мыши> и мне <возраст мыши> лет"


