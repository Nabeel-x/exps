import java.util.Scanner;
class Rectangle{
    double length, breadth;
    Rectangle(double l,double b){
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
    double height;
    Box(double l,double b,double h){
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
        int option;
        do{
            System.out.print("1: Rectangle\n2: Box \n3: Exit\nEnter an option: ");
            option = sob.nextInt();
            if(option == 1){
                System.out.print("Enter length and breadth: ");
                double l = sob.nextDouble();
                double b = sob.nextDouble(); 
                Rectangle r = new Rectangle(l,b);
                r.displayLB();
                r.area();
            }else if(option == 2){
                System.out.print("Enter length, breadth and height: ");
                double l = sob.nextDouble();
                double b = sob.nextDouble();
                double h = sob.nextDouble();
                Box B = new Box(l,b,h);
                B.displayLB();
                B.displayH();
                B.volume();
            }else if(option == 3) break;
            else{
                System.out.println("Invalid option");
            }
        }while(option != 3);
    }
}