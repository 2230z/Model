package Prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        AbstractCustomer customer = new AbstractCustomer();
        AbstractCustomer customer2 = (AbstractCustomer)customer.clone();

        System.out.println("========Customer=========");
        System.out.println(customer);
        System.out.println(customer2);

        System.out.println("========Address=========");
        System.out.println(customer.getAddress());
        System.out.println(customer2.getAddress());
    }


}
