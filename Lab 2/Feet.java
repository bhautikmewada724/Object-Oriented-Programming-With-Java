import java.util.Scanner;
public class Feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Meters");
        Double meter = sc.nextDouble();
        Double feet;
        feet = meter*3.28;
        System.out.println(feet);
        }
}
