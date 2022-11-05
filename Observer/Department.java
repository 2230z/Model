package Observer;

public class Department extends Depart {


    @Override
    public void add(Person observer) {
        list.add(observer);
    }

    @Override
    public void remove(Person observer) {
        list.remove(observer);
    }

    @Override
    public void Notify() {
        for(Person obj:list){
            obj.update();
        }
    }
}
