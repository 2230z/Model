package Prototype;

public class AbstractCustomer implements Cloneable{
    private String name;
    private int age;
    private Address address = new Address();


    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        AbstractCustomer customer = (AbstractCustomer)deep;
        customer.address = (Address)address.clone();
        return customer;
    }

}
