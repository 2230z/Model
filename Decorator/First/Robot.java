package Decorator.First;

public class Robot extends Decorator{
    public Robot(BXJG bxjg) {
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
