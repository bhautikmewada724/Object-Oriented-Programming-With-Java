import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.print("Number is Positive");
        }
        else
        {
            System.out.println("Number is Negative");
        }
    }
}
