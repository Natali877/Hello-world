package inheritance;

public class Figure implements Properties {

    @Override
    public double isSquare() {
        return 0;
    }

    @Override
    public double isPerimeter() {
        return 0;
    }

    @Override
    public boolean compareFiguresSquare(Figure figure) {
        return false;
    }
}
