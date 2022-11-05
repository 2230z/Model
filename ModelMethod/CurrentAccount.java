package ModelMethod;

public class CurrentAccount extends Bank {

    @Override
    void countBalance() {
        System.out.println("活期账户计算利息");
    }
}
