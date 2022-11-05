package Command;

public class Client {
    public static void main(String[] args) {
        CommandList menu = new CommandList();
        menu.setCommand(new Redo());
        menu.execute();

    }
}
