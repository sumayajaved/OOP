class circle {
    double radius;

    circle() {
        radius = 5;
    }

    circle(double r, double x) {
        radius = r;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}
public class Runner {
    public static void main(String[] args){
        circle c1 = new circle();
        System.out.println("circumference:" + c1.circumference());
        circle c2 = new circle(10,20);
        System.out.println("circumference:" + c2.circumference());

    }

}