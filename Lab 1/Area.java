import java.util.Scanner;
public class Area {
    public static void main(String [] args){

        Scanner toscan =  new Scanner(System.in);

        System.out.println("Enter Radius");
        double radius = toscan.nextDouble();

        double Area = 3.14*radius*radius;

        System.out.println("Area of entered radius is"+Area);
    }
}
