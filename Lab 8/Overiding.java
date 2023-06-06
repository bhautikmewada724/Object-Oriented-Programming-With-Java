public class Overiding {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        System.out.println("---Smartphone---");
        s.setAlarm();

        Iphone i = new Iphone();
        System.out.println("---Iphone---");
        i.setAlarm();
    }
}
class Smartphone{
    public void setAlarm(){
        System.out.println("Go to Apps\nOpen Clock\nSet Alarm");
    }
}
class Iphone extends Smartphone{
    public void setAlarm(){
        System.out.println("Tell Siri To Put Alarm");
    }
}
