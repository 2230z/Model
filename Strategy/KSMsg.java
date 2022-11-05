package Strategy;

public class KSMsg implements Msg {
    @Override
    public void secure() {
        System.out.println("凯撒加密");
    }
}
