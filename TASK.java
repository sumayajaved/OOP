class Time {
    int hr, min, seconds;

    Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {
        if (h >= 0 && h < 24)
            hr = h;
        else
            hr = 0;

        if (m >= 0 && m < 60)
            min = m;
        else
            min = 0;

        if (s >= 0 && s < 60)
            seconds = s;
        else
            seconds = 0;
    }

    void display() {
        System.out.println(hr + ":" + min + ":" + seconds);
    }
}

public class TASK {
    public static void main(String[] args) {
        Time t = new Time(10, 30, 45);
        t.display();
    }
}