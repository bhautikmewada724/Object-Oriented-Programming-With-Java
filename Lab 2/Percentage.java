import java.util.Scanner; 

public class Percentage {
    public static void main(String [] args) {
        Scanner toscan = new Scanner(System.in);

        System.out.println("Enter Mark of Subject 1");
        int s1 = toscan.nextInt();

        System.out.println("Enter Mark of Subject 2");
        int s2 = toscan.nextInt();
        
        System.out.println("Enter Mark of Subject 3");
        int s3 = toscan.nextInt();
        
        System.out.println("Enter Mark of Subject 4");
        int s4 = toscan.nextInt();
        
        System.out.println("Enter Mark of Subject 5");
        int s5 = toscan.nextInt();

        int per=(s1+s2+s3+s4+s5)/5;

        if(per>75)
        System.out.println("Distinction");

        else if (per>=60 && per<=70)
        System.out.println("First Class");

        else if (per>=45 && per<60)
        System.out.println("Second Class");

        else if(per>=35 && per<45)
        System.out.println("Third Class");

        else
        System.out.println("Fail");
    }
}
