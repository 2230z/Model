package SingleInstance;

public class Client {
    public static void main(String[] args) {
        IdentityCardNo card1 = IdentityCardNo.getInstance(1);
        System.out.println("card1:"+card1.getNo(1));

        IdentityCardNo card2 = IdentityCardNo.getInstance(2);
        System.out.println("card2:"+card2.getNo(2));

        IdentityCardNo card3 = IdentityCardNo.getInstance(3);
        System.out.println("card3:"+card3.getNo(3));
    }
}
