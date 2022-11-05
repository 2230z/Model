package AdapterModel;

public class Dog {
    private Adapter adapter;
    public Dog(Adapter adapter){
        this.adapter = adapter;
    }
    public void _mouth(){
        System.out.println("狗叫");
    }

    public void _catch(){
        adapter._catch();
    }
}
