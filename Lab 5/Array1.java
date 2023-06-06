import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an Array");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0; i<n ; i++){
            System.out.println("Enter Array Elements");
            array[i] = sc.nextInt();
        }
        int countodd=0;
        int counteven=0;
        for(int i=0; i<n ; i++){
            if(array[i]%2==0){
            System.out.println(+array[i]+" Is Even");
            counteven++;
            }
            else{
            System.out.println(+array[i]+" Is Odd");
            countodd++;
            }
        }
        System.out.println("Count of Even Numbers are : "+counteven);
        System.out.println("Count of Odd Numbers are : "+countodd);
    }
}
