public class BankAccount3 {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account(22,"Bhautik","bhautikmewada724@gmail.com","Saving",500.25);
        b1.display();

        Bank_Account b2 = new Bank_Account();
        b2.display();

    }
}

class Bank_Account{
    int Acc_No;
    String Username;
    String Email;
    String Account_Type;
    double Balance;

    Bank_Account(){
     Acc_No=0;
     Username="Undefined";
     Email="undefined";
     Account_Type="Undefined";
     Balance=0;
    }

    Bank_Account(int a,String u,String e,String t,double b){
        Acc_No=a;
        Username=u;
        Email=e;
        Account_Type=t;
        Balance=b;
    }

    public void display(){
        System.out.println(+Acc_No+ " " +Username + " " +Email + " " +Account_Type + " " +Balance);
    }
}