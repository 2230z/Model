package Proxy;

public class Picture implements Operation{

    private Application app = new Application();

    @Override
    public void run(){
        app.run();
    }
}
