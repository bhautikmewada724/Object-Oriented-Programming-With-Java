import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        
      Scanner toscan = new Scanner(System.in);

      System.out.println("Enter Number to find prime or not");
      int num = toscan.nextInt() ;

      boolean flag = false;

      for (int i = 2; i <= num / 2; ++i) {
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (!flag)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
    }
  }