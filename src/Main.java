import java.util.Scanner;
import java.awt.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to make a Polygon, or a cirlce?");
        System.out.println("Press 1 for Polygon");
        System.out.println("Press 2 for Circle");
        int ans = scanner.nextInt();

        if(ans==2) {
            System.out.println("Please enter X coordinate for the centerpoint of your shape ");
            int x1 = scanner.nextInt();
            System.out.println("Please enter Y coordinate for the centerpoint of your shape ");
            int y1 = scanner.nextInt();
            Point coords2 = new Point(x1, y1);
            System.out.println("Please enter radius of shape ");
            double r = scanner.nextDouble();
            Circle circle1 = new Circle("dennis", r, coords2);
            System.out.println(circle1.area());
            System.out.println(circle1.circumference());
        } if (ans==1) {
            System.out.println("Please enter X coordinate for the centerpoint of your shape ");
            int x = scanner.nextInt();
            System.out.println("Please enter Y coordinate for the centerpoint of your shape ");
            int y = scanner.nextInt();
            Point coords = new Point(x, y);
            System.out.println("Please enter the Apothemus ");
            double apo = scanner.nextDouble();
            System.out.println("Please enter number of points ");
            int numPoint = scanner.nextInt();
            Polygon poly1 = new Polygon("Bennis", coords, numPoint, apo);
            System.out.println(poly1.area());
            System.out.println(poly1.circumference());
        }
        //Polygon poly2 = new Circle("Dennis", r, coords);
        //System.out.println(circle.area());

        //System.out.println(circle.getDist(circleK.getCenter()));
        //System.out.println(circle.isInside(coords2));
        //Polygon polygon = new Polygon();

    }
}