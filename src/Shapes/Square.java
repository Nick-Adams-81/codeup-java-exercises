package Shapes;

public class Square extends Rectangle{


    private int singleSide;

    public Square(int side) {
        super(side, side);
        this.singleSide = side;

    }

    public int getArea() {
        System.out.println("This is the square get area");
        return singleSide * singleSide;
    }

    public int getPerimeter() {
        System.out.println("This is the square perimeter method");
        return 4 * singleSide;
    }


}
