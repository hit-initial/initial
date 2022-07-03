import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("====学生类====");
        Scanner sc = new Scanner(System.in);
        Student s = new Student(1,"Tom",99.5);
        System.out.println("id:" + s.getId() + " name:" + s.getName() + " socre:" + s.getScore());

    }
}
