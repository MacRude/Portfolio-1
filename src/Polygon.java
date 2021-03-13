import java.util.Scanner;
import java.awt.*;

public class Polygon{
    String poly_name;
    Point center;
    int numPoints;
    double sideLength;

    public Polygon(String poly_name,Point center ,int numPoints, double sideLength){
        this.poly_name = poly_name;
        this.numPoints = numPoints;
        this.sideLength = sideLength;
        this.center = center;
    }

    public double circumference(){
        double circumference = sideLength*numPoints;
        System.out.println("The circumference of the polygon is; ");
        return circumference;
    }
    public double area(){
        double area = 0.5*this.circumference()*(sideLength/(2*Math.tan(Math.PI/numPoints)));
        System.out.println("The area of the polygon is: ");
        return Math.round(area);
    }
    public double getDist(Point target){
        double dist = Math.sqrt(Math.pow(target.x - center.x, 2) + Math.pow(target.y-center.y, 2));
        return dist;
    }
    public Point getCenter(){
        return center;
    }
    public boolean isInside(){
        boolean isInside = false;
        return isInside;
    }
}
