import java.util.Scanner;

public class DemonstrateThis1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double l,b,h;

		Box b1 = new Box();

		System.out.print("Enter Length Of Box : ");
		l = sc.nextDouble();

		System.out.print("Enter Breadth Of Box : ");
		b = sc.nextDouble();

		System.out.print("Enter Height Of Box : ");
		h = sc.nextDouble();

		System.out.println();

		Box b2 = new Box(l,b,h);
		Box b3 = new Box(b2);

		System.out.println("Box-1...");
		b1.display();
		b1.volume();

		System.out.println("Box-2...");
		b2.display();
		b2.volume();

		System.out.println("Box-3...");
		b3.display();
		b3.volume();

		System.out.println("Total Boxes = "+Box.cnt);
	}
}
class Box {
	double length;
	double breadth;
	double height;
	static int cnt = 0;

	//Defualt Constructor
	Box() {
		cnt++;
		length = 0;
		breadth = 0;
		height = 0;
	}

	//Parameterized Constructor
	Box(double length, double breadth, double height) {
		cnt++;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	//Copy Constructor
	Box(Box temp) {
		cnt++;
		this.length = temp.length;
		this.breadth = temp.breadth;
		this.height = temp.height;
	}

	void display() {
		System.out.println("Length of Box = "+length);
		System.out.println("Breadth of Box = "+breadth);
		System.out.println("Height of Box = "+height);
	}

	void volume(){
		double volume = (length*breadth*height);
		System.out.println("Volume = "+volume);
		System.out.println();
	}
}