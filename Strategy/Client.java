package Strategy;

public class Client {
    public static void main(String[] args) {
        System.out.println("-------------");
        Data data = new Data(new DESMsg());
        data.security();

        System.out.println("-------------");
        Data data1 = new Data(new KSMsg());
        data1.security();

    }
}
