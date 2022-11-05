package State;

public class First extends BigLevel {

    @Override
    void becomeBig(Big big) {
        System.out.println("放大一倍");
        big.setState(new Second());
    }
}
