package inheritance;

public class Tetragon extends Figure implements Properties {

    private Point firstTop;
    private Point secondTop;
    private Point thirdTop;
    private Point fourthTop;

    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double fourthSide;

    private Tetragon() {
    }

    public Tetragon(Point firstTop, Point secondTop, Point thirdTop, Point fourthTop) {
        this.firstTop = firstTop;
        this.secondTop = secondTop;
        this.thirdTop = thirdTop;
        this.fourthTop = fourthTop;
        this.firstSide = firstTop.distanse(secondTop);
        this.secondSide = secondTop.distanse(thirdTop);
        this.thirdSide = thirdTop.distanse(fourthTop);
        this.fourthSide = fourthTop.distanse(firstTop);
    }


    public double diagonalFirst() {
        return firstTop.distanse(thirdTop);
    }

    public double diagonalSecond() {
        return secondTop.distanse(fourthTop);
    }

    @Override
    public double isSquare() {
        double halfPerimeter = isPerimeter() / 2;
        return Math.sqrt((halfPerimeter - this.firstSide) * (halfPerimeter - this.secondSide) * (halfPerimeter - this.thirdSide) * (halfPerimeter - this.fourthSide));
    }

    @Override
    public double isPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }

    @Override
    public boolean compareFiguresSquare(Figure figure) {
        return (this.isSquare() == figure.isSquare());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public double getFourthSide() {
        return fourthSide;
    }

}
