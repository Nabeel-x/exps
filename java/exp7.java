//add two complex numbers using the following methods
import java.util.Scanner;
//define a class complex
class Complex{
  //two instance variable
  int real, imaginary;
  //constructor without parameter to initialize real and imaginary part with zero
  Complex(){
    real = 0;
    imaginary = 0;
  }
  //constructor with two parameters to store values to real and imaginery fields
  Complex(int a,int b){
    real = a;
    imaginary = b;
  }
  //static method to add to find the sum of two objects are arguments
  static Complex sum(Complex c1, Complex c2){
    Complex temp = new Complex(0,0);
    temp.real = c1.real + c2.real;
    temp.imaginary = c1.imaginary + c2.imaginary;
    return temp;
  }
  //display() method to print complex numbers
  void display(){
    System.out.println(real+"+"+imaginary+"i");
  }
}
//main class, creating objects of complex class and calling static function
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
    Complex c3 = Complex.sum(c1,c2);
    System.out.print("Complex number 1: ");
    c1.display();
    System.out.print("Complex number 2: ");
    c2.display();
    System.out.print("Complex number sum: ");
    c3.display();
  }
}
