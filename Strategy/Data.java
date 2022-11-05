package Strategy;

public class Data {
    private Msg msg;

    public Data(Msg msg){
        this.msg = msg;
    }

    public void security(){
        msg.secure();
    }
}
