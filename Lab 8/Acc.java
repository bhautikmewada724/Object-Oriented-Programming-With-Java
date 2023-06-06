public class Acc{
	public static void main(String[] args) {
		Interest i1 = new Interest();
		i1.display();
	}
}

class AccountDetails{
	int year=2;
	double princial=20000;
	double rate=5;
}
class Interest extends AccountDetails{
	double ans= (princial*year*rate)/100;

	void display(){
		System.out.println("Total Interest is  "+ans);
	}
}