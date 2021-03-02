import javax.swing.*;
import java.awt.*;
import java.awt.MouseInfo;

public class Shapes extends JPanel {

    public void paint(Graphics g){



        super.paint(g);
        this.setBackground(Color.WHITE);



        Graphics2D g2d = (Graphics2D) g;

        double X = MouseInfo.getPointerInfo().getLocation().getX();
        double Y = MouseInfo.getPointerInfo().getLocation().getY();
        //Create a menu bar
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(0,0,500,70);


        //Creating several menu buttons
        g2d.setColor(Color.WHITE);
        if(X>=20 && X<=70 && Y>=10 && Y<=60) {
            g2d.setColor(Color.DARK_GRAY);
            g2d.fillRect(20, 10, 50, 30);
        }else{
               g2d.setColor(Color.WHITE);
               g2d.fillRect(20, 10, 50, 30);
            }


        g2d.fillRect(140,10,50,30);
        g2d.fillRect(260,10,50,30);
        g2d.fillRect(380,10,50,30);

        //Create rectangles
        g2d.setColor(Color.RED);
        g2d.fillRect(30,15,30,20);
        g2d.setFont(new Font("Arial",Font.PLAIN,15));
        g2d.setColor(Color.BLACK);
        g2d.drawString("Rectangles",15,60);

        //Create circles
        g2d.setColor(Color.BLUE);
        g2d.fillOval(150,12,25,25);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Circles",135,60);

        //Create triangles
        g2d.setColor(Color.GREEN);
        int [] x_tri = {270,285,300};
        int [] y_tri = {35,15,35};
        g2d.fillPolygon(x_tri,y_tri,3);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Triangles",255,60);

        //Create Polygons
        g2d.setColor(Color.PINK);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(390,15,420,35);
        g2d.drawLine(390,35,420,15);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Polygon",375,60);
/*
        int[] xPoints = {50,100,225,300,450};
        int[] yPoints = {20,50,175,320,490};
        int nPoints = xPoints.length;

        g2d.setColor(Color.GREEN);
        g2d.drawPolyline(xPoints,yPoints,nPoints);


        g2d.setFont(new Font("Comic Sans",Font.ITALIC,15));
        g2d.setColor(Color.YELLOW);
        g2d.drawString("YEET",100,100);

        g2d.setColor(Color.CYAN);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(200,50,40,40);


        int [] x = {100,200,300};
        int [] y = {300,127,300};
        g2d.setColor(Color.RED);
        g2d.fillPolygon(x,y,3);

        g2d.setColor(Color.BLUE);
        g2d.fillRect(100,100,200,200);

        g2d.setColor(Color.PINK);
        g2d.drawOval(50,50,100,100);

 */
    }
}
