public class TimeAdd {
    public static void main(String[] args) {
        Time t1 = new Time(5, 50, 33);
        Time t2 = new Time(20, 20, 33);

        t1.addtime(t2);

        System.out.println(t1.hour + " :" + t1.min + " " + t2.second);
    }
}

class Time {
    int hour, min, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.min = minute;
        this.second = second;
    }

    void addtime(Time t) {
        this.second += t.second;
        if (this.second >= 60) {
            this.min++;
            this.second -= 60;
        }
        this.min += t.min;
        if (this.min >= 60) {
            this.hour++;
            this.min -= 60;
        }
        this.hour += t.hour;
    }
}
