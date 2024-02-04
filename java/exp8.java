import java.util.Scanner;
class Student{
  int regno, mark1, mark2, mark3, total;
  Student(int r,int m1,int m2,int m3){
    regno = r;
    mark1 = m1;
    mark2 = m2;
    mark3 = m3;
    total = m1+m2+m3;
  }
  void display(){
    System.out.println("\nRegno = "+regno);
    System.out.println("Total = "+total);
    if(mark1 < 40 || mark2 < 40 || mark3 < 40){
      System.out.println("Result = Fail");
    }else{
      System.out.println("Result = Pass");
    }
  }
}
class StudentMain{
  public static void main(String args[]){
    Scanner sob = new Scanner(System.in);
    int n,rno,m1,m2,m3;
    System.out.print("Enter no of students: ");
    n = sob.nextInt();
    Student[] sarr = new Student[n];
    for(int i = 0;i < n;i++){
      System.out.print("Enter regno, mark1, mark2 and mark3: ");
      rno = sob.nextInt();
      m1 = sob.nextInt();
      m2 = sob.nextInt();
      m3 = sob.nextInt();
      sarr[i] = new Student(rno,m1,m2,m3);
    }
    for(Student s:sarr){
      s.display();
    }
  }
}
