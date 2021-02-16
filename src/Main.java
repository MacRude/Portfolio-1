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
	System.out.println("Hello world");
	System.out.println("How is the weather?");
    }
}
