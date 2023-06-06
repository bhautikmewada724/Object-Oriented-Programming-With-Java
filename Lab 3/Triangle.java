import java.util.Scanner;

public class Triangle{
    public static void main(String [] args){

        Scanner toscan = new Scanner(System.in);

        System.out.println("Enter First Side of Triangle");
        double side1 = toscan.nextDouble();
        
        System.out.println("Enter Second Side of Triangle");
        double side2 = toscan.nextDouble();
        
        System.out.println("Enter Third Side of Triangle");
        double side3 = toscan.nextDouble();

        if(side1 ==side2 && side2==side3 && side3==side1){
            System.out.println("Triangle is Equilateral");
        }
        else if(side1 ==side2 || side2==side3 || side3==side1){
            System.out.println("Triangle is Isoceles");
        }
        else{
            System.out.println("Triangle is Scalene");
        }
    }
}