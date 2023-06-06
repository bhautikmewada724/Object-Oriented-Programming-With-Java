import java.util.Scanner;

public class Candidate2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Candidate_Id");
        int cd= sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Cnadidate_Name");
        String cn= sc.nextLine();

        System.out.println("Enter Age");
        int ca= sc.nextInt();
        
        System.out.println("Enter Candidate_Weight");
        double cw= sc.nextDouble();

        System.out.println("Enter Candidate_Height");
        double ch= sc.nextDouble();

        Candidate_ c1 = new Candidate_(cd,cn,ca,cw,ch);
        c1.display();

        Candidate_ c2 = new Candidate_(cd,cn,ca,cw,ch);
        c2.display();
    }
}

class Candidate_{
    int Candidate_Id;
    String Cnadidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;

    Candidate_(){
     Candidate_Id=0;
     Cnadidate_Name="undefined" ;
     Candidate_Age=0;
     Candidate_Weight=0;
     Candidate_Height=0;
    }

    Candidate_(int c, String name,int a,double w,double h){
     Candidate_Id=c;
     Cnadidate_Name= name;
     Candidate_Age=a;
     Candidate_Weight=w;
     Candidate_Height=h;
    }

    public void display(){
        System.out.println(Candidate_Id + " " +Cnadidate_Name + " " +Candidate_Age + " " +  Candidate_Weight + " " +Candidate_Height);
    }
}

