package Command;

public class Redo extends Command{

    @Override
    public int execute(int a, int b) {
         return operation.add(a,b);
    }

}
