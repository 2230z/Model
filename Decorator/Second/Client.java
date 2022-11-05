package Decorator.Second;

public class Client {
    public static void main(String[] args) {
        System.out.println("-----JarPhone------");
        Phone phone1 = new JarPhone(new SimplePhone());
        phone1.tip();
        System.out.println("-----ComplexPhone------");
        Phone phone2 = new ComplexPhone(phone1);
        phone2.tip();
    }
}
