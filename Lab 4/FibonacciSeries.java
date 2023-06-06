import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries();
    }
    public static void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find terms of fibonacci series");
        int n = sc.nextInt();

        int a=0;
        int b=1;
        int c;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }  
        return; 
    }
}
