package AdapterModel;

public class Cat {
    private Adapter adapter;
    public Cat(Adapter adapter){
        this.adapter = adapter;
    }
    public void _mouth(){
        adapter._mouth();
    }

    public void _catch(){
        System.out.println("猫抓老鼠");
    }
}
