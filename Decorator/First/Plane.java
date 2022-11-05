package Decorator.First;

public class Plane extends Decorator{
    public Plane(BXJG bxjg) {
        super(bxjg);
    }
    @Override
    public void run() {
        bxjg.run();
        addOperation();
    }
    @Override
    public void addOperation() {
        System.out.println("我会说话");
    }
}
