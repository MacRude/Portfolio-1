import java.awt.Frame;

interface shapes{
    public void points(int i);
    public void getShape();
        }
class triangle implements shapes{
    public void points(int i){
        i = 3;
    }
    public void getShape(){
    points(3);
    }
}
class rect implements shapes{
    public void points(int i){
        i = 4;
    }
    public void getShape(){

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Check the opened window, and explore some Shape-creation!");

        //Creating a frame for the shapes
        Frame frame = new Frame();
        int frameWidth = 300;
        int frameHeight = 300;
        frame.setSize(frameWidth,frameHeight);
        frame.setVisible(true);
    }
}
