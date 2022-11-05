package Command;

public abstract class Command {
    protected Operation operation = new Operation();
    public abstract int execute(int a, int b);
}
