import java.util.Scanner;
class Rectangle{
    int length, breadth;
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    void displayLB(){
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
    void area(){
        System.out.println("Area = "+(length*breadth));
    }
}
class Box extends Rectangle{
    int height;
    Box(int l,int b,int h){
        super(l, b);
        height = h;
    }
    void displayH(){
        System.out.println("Height = "+height);
    }
    void volume(){
        System.out.println("Volume = "+(length*breadth*height));
    }
}
class InheritanceMain{
    public static void main(String args[]){
        Scanner sob = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sob.nextInt();
        int b = sob.nextInt();
        Rectangle rob = new Rectangle(l, b);
        System.out.print("Enter length, breadth and height: ");
        l = sob.nextInt();
        b = sob.nextInt();
        int h = sob.nextInt();
        Box bob = new Box(l,b,h);

        System.out.println("Displaying Rectangle..");
        rob.displayLB();
        rob.area();
        System.out.println("Displaying Box..");
        bob.displayLB();
        bob.displayH();
        bob.volume();
        sob.close();
    }
}