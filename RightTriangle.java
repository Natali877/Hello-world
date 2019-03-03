package inheritance;

import static java.lang.System.out;

public class RightTriangle extends Triangle {

    private double firstCathetus;
    private double secondCathetus;

    public RightTriangle(Point firstTop, Point secondTop, Point thirdTop) {
        super(firstTop, secondTop, thirdTop);
        boolean[] triangleTop = {false, false, false};
        double[] triangleSide = {0, 0, 0};

        int counter = 0;
        triangleTop[0] = findCathetus(firstTop, secondTop);
        triangleSide[0] = getFirstSide();
        triangleTop[1] = findCathetus(secondTop, thirdTop);
        triangleSide[1] = getSecondSide();
        triangleTop[2] = findCathetus(thirdTop, firstTop);
        triangleSide[2] = getThirdSide();
        for (int i = 0; i < 3; i++) {
            if (triangleTop[i]) {
                if (counter == 0) {
                    firstCathetus = triangleSide[i];
                } else {
                    secondCathetus = triangleSide[i];
                }
                counter++;
            } else {
                if (counter < 2) {
                    out.println("This triangle is not right triangle");
                }
            }
        }
    }


    @Override
    public double isSquare() {
        return firstCathetus * secondCathetus / 2;
    }

    public boolean findCathetus(Point start, Point end) {
        return (start.getX() == end.getX() | start.getY() == end.getY());
    }
}

