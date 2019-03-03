package inheritance;

public class Triangle extends Figure implements Properties {

    private Point firstTop;
    private Point secondTop;
    private Point thirdTop;

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    private Triangle() {
    }

    public Triangle(Point firstTop, Point secondTop, Point thirdTop) {
        this.firstTop = firstTop;
        this.secondTop = secondTop;
        this.thirdTop = thirdTop;
        this.firstSide = firstTop.distanse(this.secondTop);
        this.secondSide = secondTop.distanse(this.thirdTop);
        this.thirdSide = thirdTop.distanse(this.firstTop);
    }

    public double heightToFirstSide() {
        double perimeter = isPerimeter() / 2;
        return 2 * firstSide * Math.sqrt((perimeter - this.firstSide) * (perimeter - this.secondSide) * (perimeter - this.thirdSide) * perimeter);
    }

    public double heightToSecondSide() {
        double perimeter = isPerimeter() / 2;
        return 2 * secondSide * Math.sqrt((perimeter - this.firstSide) * (perimeter - this.secondSide) * (perimeter - this.thirdSide) * perimeter);
    }

    public double heightToThirdSide() {
        double perimeter = isPerimeter() / 2;
        return 2 * thirdSide * Math.sqrt((perimeter - this.firstSide) * (perimeter - this.secondSide) * (perimeter - this.thirdSide) * perimeter);
    }

    @Override
    public double isSquare() {
        double perimeter = isPerimeter() / 2;
        return Math.sqrt((perimeter - this.firstSide) * (perimeter - this.secondSide) * (perimeter - this.thirdSide) * perimeter);
    }

    @Override
    public double isPerimeter() {
        return firstSide + secondSide + thirdSide;
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

}
