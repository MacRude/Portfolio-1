import java.util.Scanner;
import java.awt.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter X coordinate for the centerpoint of your shape ");
        int x = scanner.nextInt();
        System.out.println("Please enter Y coordinate for the centerpoint of your shape ");
        int y = scanner.nextInt();
        Point coords = new Point(x,y);
        Point coords2 = new Point(100,100);
        System.out.println("Please enter radius of shape ");
        double r = scanner.nextDouble();

        Circle circleK = new Circle("Bennis", r, coords2);
        Circle circle = new Circle("Dennis", r, coords);
        //System.out.println(circle.area());

        //System.out.println(circle.getDist(circleK.getCenter()));
        System.out.println(circle.isInside(coords2));
        Polygon polygon = new Polygon();



    }
}
