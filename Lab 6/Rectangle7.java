import java.util.Scanner;
public class Rectangle7 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Length");
        double length = s1.nextDouble();

        System.out.println("Enter width");
        double width = s1.nextDouble();

        AreaPeri ap = new AreaPeri(length);
        ap.display();
    }
}
class Rectangle{
    double length;
    double width;
    double area;

    Rectangle(){
        length = 0;
        width = 0;
        area = 0;
    }
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    Rectangle(Rectangle r){
        this.length=r.length;
        this.width=r.width;
    }
    void findArea(){
        double area= this.length*this.width;
    }
    void display(){
        System.out.println(area);
    }
}
