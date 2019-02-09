package HomeWork6;

import static java.lang.System.out;

public class Test {

    public static void main(String[] args) {

        Point point= new Point(4, 3);
        Point point1 = new Point(12, 9);
        Rectangle rectangle = new Rectangle(point, point1);

        out.println("Distance is " + point.distanse());
        out.println("Distance is " + point1.distanse());
        out.println("Distance is " + point.distanse(point1));
        out.println("Distance is " + rectangle.rectangleDiagonal());
        out.println("Distance is " + rectangle.rectangleSquare());

    }
}
