import java.util.Scanner;

class TypeOfInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float l,w,h;
		byte n;
		int b,s,lt,f;

		System.out.println("Enter Details of Room...");
		System.out.println();

		System.out.print("Enter Length : ");
		l = sc.nextFloat();

		System.out.print("Enter Width : ");
		w = sc.nextFloat();
		
		System.out.print("Enter Height : ");
		h = sc.nextFloat();

		System.out.print("Enter Number of Windows : ");
		n = sc.nextByte();

		System.out.print("Enter Number of Benches : ");
		b = sc.nextInt();
		
		System.out.print("Enter Number of Seats per Bench : ");
		s = sc.nextInt();

		System.out.print("Enter Number of Lights : ");
		lt = sc.nextInt();

		System.out.print("Enter Number of Fans : ");
		f = sc.nextInt();

		Classroom cr1 = new Classroom(l,w,h,n,b,s,lt,f);
		Room r1 = new Room(l,w,h,n);

		System.out.println("\nDetails of Room...");
		r1.display();

		System.out.println("\nDetails of ClassRoom...");
		cr1.display();
	}
}

class Room {
	float length,width,height;
	byte windows;

	Room(float l, float w, float h, byte n) {
	length = l;
	width = w;
	height = h;
	windows = n;
	}

	double area() {
	return length*width;
	}

	void display() {
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
		System.out.println("Height = "+height);
		System.out.println("Number of Windows = "+windows);
		System.out.println("Area of Room = "+area());
	}
}

class Classroom extends Room {
	int bench,seats,light,fan;

	Classroom(float l, float w, float h, byte n, int b, int s, int lt,int f) {
		super(l,w,h,n);
		bench = b;
		seats = s;
		light = lt;
		fan = f;
	}

	int getSeats() {
		return bench*seats;
	}

	void display() {
		super.display();
		System.out.println("Number of Benches = "+bench);
		System.out.println("Number of Seats per Bench = "+seats);
		System.out.println("Number of Lights = "+light);
		System.out.println("Number of Fans = "+fan);
		System.out.println("Total Seats in a Class = "+getSeats());
	}
}