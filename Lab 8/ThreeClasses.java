public class ThreeClasses{
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
		System.out.println(c1.getArea());

		Triangle t1 = new Triangle(10,5);
		System.out.println(t1.getArea());

		Square s1 = new Square(10,10);
		System.out.println(s1.getArea());
    }
}
    class Shape{
        int a;
    }
    class Circle extends Shape{
        Circle (int a){
            this.a=a;
        }
        public double getArea(){
            return Math.PI*a*a;
        }
    }
    class Triangle extends Shape{
        int length;
        Triangle(int a,int length){
            this.a=a;
            this.length=length;
        }
        public double getArea(){
            return 0.5*a*length;
        }
    }
    class Square extends Shape{
        int side;
        Square(int a,int side){
            this.a=a;
            this.side=side;
        }
        public double getArea(){
            return a*side;
        }
    }
