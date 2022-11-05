package Decorator.Second;

public class SimplePhone implements Phone{
    @Override
    public void tip() {
        System.out.println("来电时有声音提醒");
    }
}
