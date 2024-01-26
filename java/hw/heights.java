class Height{
  int feet, inch;
  Height(int a,int b){
    feet = a;
    inch = b;
    if(inch >= 12){
      feet = feet + inch/12;
      inch = inch%2;
    }
  }
  static Height add(Height h1,Height h2){
    Height temp = new Height(0,0);
    temp.feet = h1.feet + h2.feet;
    temp.inch = h1.inch + h2.inch;
    return temp;
  }
  void display(){
    System.out.println("Feets = "+feet+" Inches = "+inch);
  }
}
class HeightMain{
  public static void main(String args[]){
    Height h1 = new Height(5,12);
    Height h2 = new Height(5,9);
    Height h3 = Height.add(h1,h2);
    h1.display();
    h2.display();
    h3.display();
  }
}
