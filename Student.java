package Student_Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Student {

    public Student(String name, String dept, int id) {
    }

    public static void main(String[] Args) {

        ArrayList<Student> Student = new ArrayList<Student>();
        input(Student);
        System.out.println(Student.toString());

    }
    public static void input(ArrayList<Student>Student) {
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<2; i++) {
            System.out.println("Enter Name: ");
            String name = scan.nextLine();
            System.out.println("Enter dept: ");
            String dept = scan.nextLine();
            System.out.println("Enter ID: ");
            int ID = scan.nextInt();
            Student.add(new Student(name,dept,ID));
            //scan.nextInt();
        }
    }

}

