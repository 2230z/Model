package Builder;

public class Person {
    private String body;
    private String cloth;
    private String equipment;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "body='" + body + '\'' +
                ", cloth='" + cloth + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
