package Prototype;

public class Address implements Cloneable {
    private String city = "长沙";
    private Double latitude = 119.25435;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
