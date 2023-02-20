package homework.day1.basetask;

public class Obstacle {

    private String description;
    private String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }


    public String getSeverity() {
        return severity;
    }

    void printObstacleDetails() {
        System.out.println("Возникло " + this.severity + " препятствиие " + this.description);
    }

}


