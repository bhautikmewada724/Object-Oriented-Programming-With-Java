import java.util.Scanner;

public class Maximum {
   public static int findMax(int num1, int num2) {
      return (num1 > num2) ? num1 : num2;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();

      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();
      
      int max = findMax(num1, num2);
      
      System.out.println("Maximum number: " + max);
   }
}

