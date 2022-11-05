package Decorator.First;

public class Client {
    public static void main(String[] args) {
        System.out.println("------汽车------");
        BXJG bxjg = new Car();
        bxjg.run();
        System.out.println("------机器人------");
        BXJG robot = new Robot(new Car());
        robot.run();
        System.out.println("------飞机------");
        BXJG plane = new Plane(new Car());
        plane.run();
    }
}
