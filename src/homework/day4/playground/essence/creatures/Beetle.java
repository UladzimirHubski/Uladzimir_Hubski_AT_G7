package homework.day4.playground.essence.creatures;

public class Beetle extends Insects implements Crawlable {
    public String nameBeetle;
    public int massBeetle = 22;

    public String getNameBeetle() {
        return nameBeetle;
    }

    public void setNameBeetle(String nameBeetle) {
        this.nameBeetle = nameBeetle;
    }



    public void nest(Carrot home) {
        if (massBeetle > home.getMass()) {
            int cbMass;
            cbMass = getMass() / home.getMass();
            System.out.printf("I am %N adn I will nest there with %D my family members!", getName(), cbMass);
        } else {
            System.out.println("This carrot is too small for nesting :( ");
        }
    }
}

