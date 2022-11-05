package ModelMethod;

public class SavingAccount extends Bank {
    @Override
    void countBalance() {
        System.out.println("定期账户计算利息");
    }
}
