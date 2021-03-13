import java.awt.*;

public class Circle{
    Point center;
    double radius;
    String shape_name;
    public Circle(String shape_name,double radius, Point center){
        this.center = center;
        this.radius = radius;
        this.shape_name = shape_name;
    }
    public double area(){

        double area = (radius*radius)*Math.PI;
        System.out.println("The area of the circle is: ");
        return area;
    }

    public double circumference(){
        double circumference = Math.PI*2*radius;
        System.out.println("Sir cumference of " + shape_name + "is: ");
        return circumference;
    }

    public double getDist(Point target){

        double dist = Math.sqrt(Math.pow(target.x - center.x, 2) + Math.pow(target.y-center.y, 2));
        return dist;
    }

    public Point getCenter(){
        return center;
    }

    public boolean isInside(Point target){

        boolean isInside = false;
        if(getDist(target) < radius){
            isInside = true;
            System.out.println("The point intersect with shape");
        } else{
            System.out.println("You're good, the point is clear");
        }
       return isInside;
    }



}
