package inheritance;

public class Rectangle extends Tetragon {

    private Point pointUp;
    private Point pointDown;

    private double firstSide;
    private double secondSide;

    public Rectangle(Point pointUp, Point pointDown) {
        super(pointUp, new Point(pointUp.getX(), pointDown.getY()), pointDown, new Point(pointDown.getX(), pointUp.getY()));
        this.firstSide = super.getFirstSide();
        this.secondSide = super.getSecondSide();
    }

    public Rectangle(Point firstTop, Point secondTop, Point thirdTop, Point fourthTop) {
        super(firstTop, secondTop, thirdTop, fourthTop);
        this.firstSide = super.getFirstSide();
        this.secondSide = super.getSecondSide();
    }

    @Override
    public double isSquare() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public double isPerimeter() {
        return (this.firstSide + this.secondSide) * 2;
    }

    public inheritance.Point getPointUp() {
        return pointUp;
    }

    public inheritance.Point getPointDown() {
        return pointDown;
    }

    @Override
    public double getFirstSide() {
        return firstSide;
    }

    @Override
    public double getSecondSide() {
        return secondSide;
    }
}
