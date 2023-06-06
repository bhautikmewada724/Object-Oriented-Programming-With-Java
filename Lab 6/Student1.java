import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Enrollment no");
        int eno= sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name");
        String name= sc.nextLine();

        System.out.println("Enter Gender");
        char gender= sc.next().charAt(0);
        
        System.out.println("Enter Marks");
        int marks= sc.nextInt();

        Student s1 = new Student(eno, name,gender, marks);
        s1.display();
        Student s2 = new Student();
        s2.display();
    }
}

class Student {
    int enrollmentno;
    String name;
    char gender;
    int marks;
    static int count;

    Student() {
        enrollmentno = 0;
        name = "undefined";
        gender = 'm';
        marks = 0;
        count++;

    }

    Student(int e, String n, char g, int m) {
        name = n;
        gender = g;
        enrollmentno = e;
        marks = m;
        count++;
    }

    public void display(){
        System.out.println(enrollmentno + " " +name + " " +gender + " " +  marks + " " +count);
    }
}