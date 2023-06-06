import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Size of an Array");
       int n = sc.nextInt();

       int array[] = new int[n];

       for(int i=0;i<n;i++){
        array[i]= sc.nextInt();
       }
       int sum=0;
       for(int i=0;i<n;i++){
        if(array[i]%3==0 || array[i]%5==0){
            sum=sum+array[i];
        }
       }
       System.out.println("Sum is "+sum);
    }
}
