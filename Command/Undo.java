package Command;

public class Undo extends Command{

    @Override
    public int execute(int a, int b) {
        return operation.add(a,b);
    }
}
