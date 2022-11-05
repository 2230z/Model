package Decorator.Second;

public abstract class Decorator implements Phone{
    protected Phone phone;
    public Decorator(Phone phone){
        this.phone = phone;
    }
    public abstract void addOperation();
}
