package Observer;

public class Client {
    public static void main(String[] args) {
        Depart s = new Department();

        s.add(new Student(s));
        s.add(new Teacher(s));
        s.add(new Student(s));
        s.add(new Teacher(s));

        s.setState("changli");
    }
}
