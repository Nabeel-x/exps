import java.lang.Math;
class Point{
  double x,y;
  Point(double a ,double b){
    x = a;
    y = b;
  }
  static double distance(Point p1,Point p2){
    double sqx = Math.pow(p2.x - p1.x,2);
    double sqy = Math.pow(p2.y - p1.y,2);
    double result = Math.sqrt(sqx+sqy);
    return result;
  }
  static Point midpoint(Point p1,Point p2){
    Point temp = new Point(0,0);
    temp.x = (p1.x + p2.x)/2;
    temp.y = (p1.y + p2.y)/2;
    return temp;
  }
  void display(){
    System.out.println("x = "+x+" y = "+y);
  }
}
class PointMain{
  public static void main(String args[]){
    Point p1 = new Point(3,4);
    Point p2 = new Point(6,8);
    Point p3 = Point.midpoint(p1,p2);
    double distance = Point.distance(p2,p1);
    p1.display();
    p2.display();
    System.out.println("Distance between p1 and p2: "+distance);
    System.out.print("Midpoint of p1 and p2: ");
    p3.display();
  }
}
