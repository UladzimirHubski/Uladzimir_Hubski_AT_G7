package homework.day1.basetask;

public class Bee {

    private String gender;
    private Long weight;

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
