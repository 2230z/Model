package ModelMethod;

public class Client {
    public static void main(String[] args) {

        System.out.println("--------------");
        Bank bank = new CurrentAccount();
        bank.operation();

        System.out.println("--------------");
        Bank bank2 = new SavingAccount();
        bank2.operation();
    }
}
