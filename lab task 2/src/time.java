public class time {
    int hours;
    int minutes;
    int seconds;
    public void displaytime(){
        System.out.println("Hours:"+" "+hours+" "+"Minutes:"+" "+minutes+" "+"Seconds:"+" "+seconds);
    }

    public static void main(String[] args) {
        time t1 = new time();
        t1.hours = 5;
        t1.minutes = 13;
        t1.seconds = 54;
        t1.displaytime();

    }
}