import java.util.Scanner;


public class VovelConsonant {
    public static void main(String [] args) {
        Scanner toscan = new Scanner(System.in);
        
        System.out.println("Enter Character");
        char ch = toscan.next().charAt(0); 

        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println(ch  + "Is Vovel");
        }
        else
        {
            System.out.println(ch + "Is Consonant");
        }
    }
}
