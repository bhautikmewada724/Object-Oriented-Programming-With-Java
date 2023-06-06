import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInInches = sc.nextDouble();

        double weightInKg = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKg / (heightInMeters * heightInMeters);     
        System.out.println("Your BMI is: " + bmi);
    }
}
