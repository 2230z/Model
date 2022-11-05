package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        String s = "abcdefg";
//        Iterator iterator = new ConcreteIterator();
//        iterator.setStr(s);
//        System.out.println("-----顺序-----");
//        System.out.print(iterator.First()+" ");
//        while(!iterator.isDone()){
//            System.out.print(iterator.next()+" ");
//        }
//        System.out.println("    ");
//        System.out.println("-----逆序-----");
//        System.out.print(iterator.Last()+" ");
//        while(!iterator.isDone()){
//            System.out.print(iterator.prior()+" ");

//        }

        List<Student> lists = new ArrayList();
        Iterator<Student> iterator = lists.iterator();
        while(iterator.hasNext()){
            Student stu = iterator.next();
            System.out.println(stu.toString());
        }

    }
}
