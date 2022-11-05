package Observer;

public class Student extends Person {

    public Student(Depart subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        state = subject.state;
        System.out.println("学生接到通知，修改完成");
    }

}
