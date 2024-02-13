import java.util.Scanner;
class Complex{
  int real, imaginary;
  Complex(){
    real = 0;
    imaginary = 0;
  }
  Complex(int a,int b){
    real = a;
    imaginary = b;
  }
  Complex add(Complex cn){
    Complex temp = new Complex();
    temp.real = this.real + cn.real;
    temp.imaginary = this.imaginary + cn.imaginary;
    return temp;
  }
  void add(Complex c1, Complex c2){
    this.real = c1.real + c2.real;
    this.imaginary = c1.imaginary + c2.imaginary;
  }
  void display(){
    System.out.println(real+"+"+imaginary+"i");
  }
}
class ComplexMain{
  public static void main(String args[]){
    Scanner sob = new Scanner(System.in);
    int r,i;
    System.out.print("Enter real and imaginery part: ");
    r = sob.nextInt();
    i = sob.nextInt();
    Complex c1 = new Complex(r,i);
    System.out.print("Enter real and imaginery part: ");
    r = sob.nextInt();
    i = sob.nextInt();
    Complex c2 = new Complex(r,i);
    Complex c3 = c1.add(c2);
    System.out.print("Complex number 1: ");
    c1.display();
    c1.add(c2,c3);
    System.out.print("Complex number 2: ");
    c2.display();
    System.out.print("cn1 and cn2 sum: ");
    c3.display();
    System.out.print("new complex no 1: ");
    c1.display();
  }
}
