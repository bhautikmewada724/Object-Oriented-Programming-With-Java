public class Employee4 {
    public static void main(String[] args) {
        GetEmployeeDetails d1 = new GetEmployeeDetails(23,"Bhautik","Bhavnagar",26,80000);
        d1.DisplayEmpolyeeDetails();

        GetEmployeeDetails d2 = new GetEmployeeDetails();
        d2.DisplayEmpolyeeDetails();
    }
}

class GetEmployeeDetails {
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    GetEmployeeDetails(){
    Employee_ID=0;
    Employee_Name="Undefined";
    Designation="Undefined";
    Age=0;
    Salary=0;
    }

    GetEmployeeDetails(int id,String Name,String d,int a,double s){
    Employee_ID=id;
    Employee_Name=Name;
    Designation=d;
    Age=a;
    Salary=s;
    }

    public void DisplayEmpolyeeDetails(){
        System.out.println(+Employee_ID + " " + Employee_Name + " " +Designation + " " +Age + " " + Salary);
    }
}
