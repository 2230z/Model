package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandList {
    private List<Command> list = new ArrayList();

    public void setCommand(Command command){
        list.add(command);
    }

    public void RemoveCommand(Command command){
        list.remove(command);
    }

    public void execute(){
        for(Command com: list){
            System.out.println(com.execute(2,3));
        }
    }

}
