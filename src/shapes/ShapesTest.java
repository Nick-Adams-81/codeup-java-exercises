package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measureable myShape = new Rectangle(4, 5);
        Measureable myShape2 = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape2.getArea());

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getPerimeter());



    }

}
