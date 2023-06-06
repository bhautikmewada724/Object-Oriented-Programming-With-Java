import java.util.Scanner;
public class Call {
    public static void main(String[] args) {
        
        Scanner toscan = new Scanner(System.in);

        System.out.println("Enter Number of calls");
        int call = toscan.nextInt();

        double price=0;

        if(call<=100){
            price = 200;
        }
        else if(call<=150){
            price = 200 + (call-100)*0.60;
        }
        else if(call<=200){
            price = 250 + (call-250)*0.50;
        }
        else if(call>=200){
            price = 300 + (call-300)*0.40;
        }
        System.out.println(price);
    }
}
