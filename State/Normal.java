package State;

public class Normal extends BigLevel {

    @Override
    void becomeBig(Big big) {
        System.out.println("原形，大小不变");
        big.setState(new First());
    }
}
