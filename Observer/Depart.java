package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Depart {
    public String state;
    List<Person> list = new ArrayList<>();

    public void setState(String state) {
        this.state = state;
        Notify();
    }

    public abstract void add(Person observer);
    public abstract void remove(Person observer);
    public abstract void Notify();
}
