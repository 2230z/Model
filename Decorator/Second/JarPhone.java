package Decorator.Second;

public class JarPhone extends Decorator{
    public JarPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void addOperation() {
        System.out.println("来电时我还会震动提醒");
    }

    @Override
    public void tip() {
        phone.tip();
        addOperation();
    }
}
