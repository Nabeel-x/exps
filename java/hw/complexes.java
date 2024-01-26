class Complex{
  int real, imaginary;
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
    System.out.println("Complex number: "+real+"+"+imaginary+"i");
  }
}
class ComplexMain{
  public static void main(String args[]){
    Complex c1 = new Complex(1,2);
    Complex c2 = new Complex(3,-1);
    Complex c3 = Complex.add(c1,c2);
    c1.display();
    c2.display();
    c3.display();
  }
}
