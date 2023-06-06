import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        check();
    }
    public static int check(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();
        
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }    
            if(count==2){
                return 1;
            }
            else{
                return 0;
            }
    }
}
