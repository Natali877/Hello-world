package inheritance;

import static java.lang.System.out;

public class Demo {

    public static void main(String[] args) {

        Tetragon ther2 = new Tetragon(new Point(1, 2), new Point(2, 4), new Point(6, 4), new Point(5, 2));
        Rectangle rec1 = new Rectangle(new Point(1, 2), new Point(1, 4), new Point(5, 4), new Point(5, 2));
        Rectangle rec2 = new Rectangle(new Point(6, 5), new Point(2, 2));
        Rhombus rhomb1 = new Rhombus(new Point(0, 3), new Point(4, 6), new Point(8, 3), new Point(4, 0));
        RightTriangle triang1 = new RightTriangle(new Point(2, 2), new Point(2, 4), new Point(4, 4));

        out.println(ther2.compareFiguresSquare(ther2));
        out.println("Square is " + rec2.isSquare() + ", Perimeter is " + rec2.isPerimeter() + ", FirstSide is " + rec2.getFirstSide() + ", SecondSide is " + rec2.getSecondSide());
        out.println("Square is " + rec1.isSquare() + ", Perimeter is " + rec1.isPerimeter() + ", FirstSide is " + rec1.getFirstSide() + ", SecondSide is " + rec1.getSecondSide());
        out.println("Square is " + rhomb1.isSquare() + ", Perimeter is " + rhomb1.isPerimeter() + ", the Side is " + rhomb1.getFirstSide() + ", Diagonals are " + rhomb1.getFirstDiagonal() + " and " + rhomb1.getSecondDiadonal());
        out.println("Square is " + ther2.isSquare() + ", Perimeter is " + ther2.isPerimeter() + ", FirstSide is " + ther2.getFirstSide() + ", SecondSide is " + ther2.getSecondSide());
        out.println("Square is " + triang1.isSquare() + ", Perimeter is " + rec2.isPerimeter() + ", FirstCathetus is " + triang1.getFirstSide() + ", SecondCathetus is " + triang1.getSecondSide());

    }
}


