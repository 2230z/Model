package AdapterModel;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Dog dog = new Dog(adapter);
        Cat cat = new Cat(adapter);
        adapter.setCat(cat);
        adapter.setDog(dog);

        dog._catch();

        cat._mouth();
    }
}
