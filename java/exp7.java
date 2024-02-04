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
  static Complex add(Complex c1, Complex c2){
    Complex temp = new Complex(0,0);
    temp.real = c1.real + c2.real;
    temp.imaginary = c1.imaginary + c2.imaginary;
    return temp;
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
    Complex c3 = Complex.add(c1,c2);
    System.out.print("Complex number 1: ");
    c1.display();
    System.out.print("Complex number 2: ");
    c2.display();
    System.out.print("Complex number sum: ");
    c3.display();
  }
}
