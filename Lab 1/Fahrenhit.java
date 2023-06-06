import java.util.Scanner;

public class Fahrenhit {
    public static void main(String [] args){
        Scanner toscan = new Scanner(System.in);

        System.out.println("Enter Fahrenhit temperature");
        double f = toscan.nextDouble();
        

        double F = 5*(f-32)/9;

        System.out.println(F);


    }
}