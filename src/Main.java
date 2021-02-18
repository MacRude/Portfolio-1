import java.awt.Frame; //awt is Abstract Window Toolkit, which supports GUI
import java.awt.Component;
import java.util.Scanner;

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

class frame{
    //Creating a frame for the shapes
    //using a constructor, and instantiate a "Frame" object
    Frame frame = new Frame();
    int frameWidth;
    int frameHeight;
    String frameTitle;

    public frame(int frameWidth,int frameHeight,String frameTitle) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.frameTitle = frameTitle = "Drawing board";
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true); //built in boolean
        frame.setTitle(frameTitle);
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Check the opened window, and explore some Shape-creation!");
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        stop = stop.toUpperCase();
        //initializes the object, frame.
        new frame(300,300,"Drawing Board");
        if(stop=="x"){
            frame(setVisible)=true;
        }


    }
}
