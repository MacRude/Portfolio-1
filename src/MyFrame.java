import javax.swing.*;


public class MyFrame extends JFrame{

    Shapes shapes = new Shapes();
    //Creating frame, with EXIT-mechanism by closing the window
    public MyFrame(){
        this.setSize(500,500);
        this.add(shapes);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Drawing Board");
    }
}
