package Shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width);
    }


    public double getArea() {
        return length * width;
    }


    public double getPerimeter() {
        return 2 * (length + width);
    }


    protected void setLength(double side) {
        length = side;
    }


    protected void setWidth(double side) {
        width = side;
    }

//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return  2 * length + 2 * width;
//    }

}
