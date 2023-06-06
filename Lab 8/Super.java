// // Java code to show use of super keyword with variables
// // Base class vehicle
// class Vehicle {
// 	int maxSpeed = 120;
// }

// // sub class Car extending vehicle
// class Car extends Vehicle {
// 	int maxSpeed = 180;

// 	void display()
// 	{
// 		// print maxSpeed of base class (vehicle)
// 		System.out.println("Maximum Speed: "
// 						+ maxSpeed);
// 	}
// }
// //Driver Program
// class Super {
// 	public static void main(String[] args)
// 	{
// 		Car small = new Car();
// 		small.display();
// 	}
// }

//
// Java program to show use of super with methods

// superclass Person
// class Person {
// 	void message()
// 	{
// 		System.out.println("This is person class\n");
// 	}
// }
// // Subclass Student
// class Student extends Person {
// 	void message()
// 	{
// 		System.out.println("This is student class");
// 	}
// 	void display()
// 	{
// 		message();
// 		super.message();
// 	}
// }
// // Driver Program
// class Super {
// 	public static void main(String args[])
// 	{
// 		Student s = new Student();
// 		s.display();
// 	}
// }


// Java Code to show use of
// super keyword with constructor

// superclass Person
class Person {
	Person()
	{
		System.out.println("Person class Constructor");
	}
}
class Student extends Person {
	Student()
	{
		super();
		System.out.println("Student class Constructor");
	}
}

// Driver Program
class Super {
	public static void main(String[] args)
	{
		Student s = new Student();
	}
}

