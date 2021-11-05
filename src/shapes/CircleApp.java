package shapes;
import util.Input;


public class CircleApp {

    public static void circle() {
        Input input = new Input();
        double in = input.getDouble(1, 1000);
        Circle circle = new Circle(in);
        System.out.println("area = " + circle.getArea());
        System.out.println("Circumference = " + circle.getCircumfrence());
    }

    public static void main(String[] args) {
        circle();
    }

}
