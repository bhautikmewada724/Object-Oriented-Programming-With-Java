public class Clock {
    public static void main(String[] args) {
        Time t1 = new Time(10,20,30);
        t1.display();

        Time t2 = new Time(10,20,30);
        t2.display();

        t1.add(t2);  
    }
}
class Time{
    int hour,min,sec;
    int Add;

    Time(){
        hour=0;
        min=0;
        sec=0;
        Add=0;
    }

    Time( int h,int m,int s){
        hour=h;
        min=m;
        sec=s;
    }
    public void display(){
       
        System.out.println("Hours"+hour +" "+ "Minutes" +min + " " + "Seconds" +sec);
    }
    public void add(Time t){
        this.hour=this.hour+t.hour;
        this.min=this.min+t.min;
        this.sec=this.sec+t.sec;
        System.out.println(this.hour+" "+this.min+" "+this.sec);
    }
}