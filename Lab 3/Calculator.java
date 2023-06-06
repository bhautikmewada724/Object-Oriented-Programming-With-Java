import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        double num1 = sc.nextDouble();

        System.out.println("Enter Number 2");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}
