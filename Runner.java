class Distance {
    int feet, inches;
    Distance() {
        feet = 3;
        inches = 6;
    }

    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}

public class Runner {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.display();

        Distance d2 = new Distance(5, 8);
        d2.display();
    }
}
