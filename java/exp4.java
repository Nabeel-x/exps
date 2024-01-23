import java.util.Scanner;
class Shape{
  double area(double radius){
    return 3.14*radius*radius;
  }
  double area(double length,double breadth){
    return length*breadth;
  }
  float area(float base,float height){
    return 0.5f*base*height;
  }
}
class ShapeMain{
  public static void main(String args[]){
    Scanner sob = new Scanner(System.in);
    Shape s1 = new Shape();
    int option;
    do{
      System.out.print("1: Circle\n2: Rectangle\n3: Triangle\n4: Exit\nEnter your option: ");
      option = sob.nextInt();
      switch (option) {
        case 1:
          System.out.print("Enter radius: ");
          double r = sob.nextDouble();
          System.out.println("Area of circle = "+s1.area(r));
          break;
        case 2:
          System.out.print("Enter Length and breadth: ");
          double l = sob.nextDouble();
          double h = sob.nextDouble();
          System.out.println("Area of rectangle = "+s1.area(l,h));
          break;
        case 3:
          System.out.print("Enter base and height: ");
          float b = sob.nextFloat();
          float hi = sob.nextFloat();
          System.out.println("Area of triangle = "+s1.area(b,hi));
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid Option");
      }
    }while(option != 4);
  }
}
