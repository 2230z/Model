package Observer;

public class Teacher extends Person {

    public Teacher(Depart subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        state = subject.state;
        System.out.println("教师接到通知，修改完成");
    }

}
