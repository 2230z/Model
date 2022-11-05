package Strategy;

public class DESMsg implements Msg {
    @Override
    public void secure() {
        System.out.println("DES加密");
    }
}
