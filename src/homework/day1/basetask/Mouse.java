package homework.day1.basetask;

public class Mouse {

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

