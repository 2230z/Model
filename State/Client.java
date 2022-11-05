package State;

public class Client {
    public static void main(String[] args) {
        Big big = new Big();
        big.setState(new Normal());
        big.click(big);
        big.click(big);
        big.click(big);
    }
}
