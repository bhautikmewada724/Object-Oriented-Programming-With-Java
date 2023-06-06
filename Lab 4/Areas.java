public class Areas{
    public static void main(String[] args) {
       double ans1 = areaOfCircle(5);
       System.out.println(ans1);
       double ans2 = areaOfTriangle(5,10);
       System.out.println(ans2);
       double ans3 = areaOfSquare(5);
       System.out.println(ans3);
    }
    public static double areaOfCircle(double radius){
        return (3.14*radius*radius);
    }
    public static double areaOfTriangle(double base,double height){
        return (0.5*base*height);
    }
    public static double areaOfSquare(double side){
        return (side*side);
    }
}