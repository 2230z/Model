package Decorator.First;

public abstract class Decorator extends BXJG{
    protected BXJG bxjg;
    public Decorator(BXJG bxjg){
        this.bxjg = bxjg;
    }

    public abstract void addOperation();
}
