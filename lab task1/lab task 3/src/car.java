public class car{
    String name;
    String colour;
    int yearmodel;
    double fuellevel;
    int speedmeter;
    public void cardisplay(){
        System.out.println("Car name:"+" "+name+" "+"Colour:"+" "+colour+" "+"Year model:"+" "+yearmodel+" "+"Fuel level"+" "+fuellevel+" "+"Speed meter"+" "+speedmeter);
    }
    public static void main(String[]args){
        car c1 = new car();
        c1.name = "honda";
        c1.colour = "Red";
        c1.yearmodel = 2021;
        c1.fuellevel = 60;
        c1.speedmeter = 120;
        c1.cardisplay();

    }
}