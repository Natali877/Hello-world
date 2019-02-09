package HomeWork6;

public class Point {

    private  int x;
    private  int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanse () {
        double curentDistance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) );
        return curentDistance;
    }

    public double distanse (Point point) {
        double curentDistance = Math.sqrt(Math.pow(this.x-point.getX(), 2) + Math.pow(this.y-point.getY(), 2) );
        return curentDistance;
    }


    public void setX (int x1){
        x = x1;
    }

    public void setY (int y1){
        y = y1;
    }

    public int getX (){
        return x;
    }

    public int getY (){
        return y;
    }

}
