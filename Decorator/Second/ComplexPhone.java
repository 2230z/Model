package Decorator.Second;

public class ComplexPhone extends Decorator{
    public ComplexPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void addOperation() {
        System.out.println("来电时我还有闪光灯提醒");
    }

    @Override
    public void tip() {
        phone.tip();
        addOperation();
    }
}
