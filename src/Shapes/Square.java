package Shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }



    public double getArea() {
        return length * width;
    }


    public double getPerimeter() {
        return 2 * (length + width);
    }



    protected void setLength(double side) {
         this.length = side;
    }



    protected void setWidth(double side) {
        this.width = side;
    }




//
//    private int singleSide;
//
//    public Square(int side) {
//        super(side, side);
//        this.singleSide = side;
//    }
//
//    public int getArea() {
//        System.out.println("This is the square get area");
//        return singleSide * singleSide;
//    }
//
//    public int getPerimeter() {
//        System.out.println("This is the square perimeter method");
//        return 4 * singleSide;
//    }


}
