package Observer;

public abstract class Person {
    protected Depart subject;
    protected String state;

    public abstract void update();
}
