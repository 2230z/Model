package Builder;

public class Client {
    public static void main(String[] args) {
        System.out.println("----------");
        Director director = new Director();
        Map map1 = director.createMap(new MapA());
        System.out.println(map1);
        Person person1 = director.createPerson(new UserA());
        System.out.println(person1);
    }
}
