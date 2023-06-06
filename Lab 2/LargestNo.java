import java.util.Scanner;

public class LargestNo{
    public static void main(String [] args){
       
        Scanner toscan = new Scanner(System.in);

        System.out.println("Enter value of a");
        int a = toscan.nextInt();

        System.out.println("Enter value of b");
        int b = toscan.nextInt();

        System.out.println("Enter value of c");
        int c = toscan.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+ " is Largest");
            }
            else{
                System.out.println(c+"c is Largest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is Largest");
            }
            else{
                System.out.println(c+" is Largest");
            }
        }
    }
}