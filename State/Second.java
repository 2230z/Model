package State;

public class Second extends BigLevel {
    @Override
    void becomeBig(Big big) {
        System.out.println("放大两倍");
        big.setState(new Normal());
    }
}
