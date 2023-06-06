import java.util.Scanner;
public class Array3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i=0;i<n;i++){
                System.out.println("Enter numbers in Array");
                numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter number to find position in Array");
        int x = sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("X found at "+i);
            }
        }
    }
}