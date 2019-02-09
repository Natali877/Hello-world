package HomeWork6;

public class Rectangle {

   private Point pointUp;
   private Point pointDown;

    public  Rectangle (Point pointUp, Point pointDown) {
       this.pointUp = pointUp;
       this.pointDown = pointDown;
    }


    public double rectangleDiagonal () {
        double curentDistance = Math.sqrt(Math.pow(pointUp.getX()-pointDown.getX(), 2) + Math.pow(pointUp.getY()-pointDown.getY(), 2) );
        return curentDistance;
    }

    public int rectangleSquare () {
        int curentSquare = Math.abs(pointUp.getX()-pointDown.getX()) * Math.abs(pointUp.getY()-pointDown.getY());
        return curentSquare;
    }

}
