package inheritance;

public class Rhombus extends Tetragon {

    private double firstDiagonal;
    private double secondDiadonal;

    public Rhombus(Point firstTop, Point secondTop, Point thirdTop, Point fourthTop) {
        super(firstTop, secondTop, thirdTop, fourthTop);
        firstDiagonal = firstTop.distanse(thirdTop);
        secondDiadonal = secondTop.distanse(fourthTop);
    }

    @Override
    public double isSquare() {
        return (this.diagonalFirst() * this.diagonalSecond()) / 2;
    }

    @Override
    public double isPerimeter() {
        return (getFirstSide() + getSecondSide()) * 2;
    }

    public double getFirstDiagonal() {
        return firstDiagonal;
    }

    public double getSecondDiadonal() {
        return secondDiadonal;
    }

}
