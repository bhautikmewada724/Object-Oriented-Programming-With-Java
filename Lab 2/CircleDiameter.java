import java.util.Scanner;

public class CircleDiameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the circle: ");
        double area = sc.nextDouble();

        double radius = Math.sqrt(area / Math.PI);
        double diameter = 2 * radius;
        
        System.out.println("The diameter of the circle is: " + diameter);
        
    }
}
