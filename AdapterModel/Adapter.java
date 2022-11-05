package AdapterModel;

public class Adapter {
    private Dog dog;
    private Cat cat;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void _mouth(){
        dog._mouth();
    }

    public void _catch(){
        cat._catch();
    }
}
