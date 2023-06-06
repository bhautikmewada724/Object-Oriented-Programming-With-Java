import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Radius");
        double r = s1.nextDouble();
        AreaPeri ap = new AreaPeri(r);
        ap.display();
    }
}

class AreaPeri{
    double radius;
    double Area;
    double Perimeter;

    AreaPeri(){
        radius=0;
        Area=0;
        Perimeter=0;
    }

    AreaPeri(double r){
         Area=3.14*r*r;
         Perimeter=2*3.14*r;
    }

    public void display(){
       
        System.out.println("Area is"+Area + " "+ "Perimeter is" +Perimeter);
    }
}
