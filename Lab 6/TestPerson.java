public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Bhautik", 435,89);
        p1.display();
        Person p2 = new Person("Parth" , 436, 88);
        p2.display();
    }
}

class Person {
    String name;
    int mobileno;
    int marks;

    Person() {
        name = "undefined";
        mobileno=0;
        marks = 0;
    }

    Person(String n, int m,int m1) {
        name = n;
        mobileno = m;
        marks = m1;
    }

    public void display() {
        System.out.println(name + " " + mobileno + " " +marks);
    }
}