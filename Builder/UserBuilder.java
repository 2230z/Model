package Builder;

public abstract class UserBuilder {
    Person person = new Person();

    public abstract void setBody();
    public abstract void setCloth();
    public abstract void setEquipment();

    public Person create() {
        return person;
    }
}
