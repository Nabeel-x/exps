import java.util.Scanner;
//define a class student
class Student{
    //Five instance variable regno, mark1, mark2, mark3 and total
    int regno,total;
    byte mark1,mark2,mark3;
    //parameterized constructor
    Student(int rno,byte m1,byte m2,byte m3){
        regno = rno;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        total = m1 + m2 + m3;
    }
    void displayResult(){
        System.out.println("Register no: "+regno+"\nMark1: "+mark1+"\nMark2: "+mark2+"\nMark3: "+mark3+"\nTotal: "+total);
        System.out.print("Result: "+(
            (mark1 >= 40 && mark2 >= 40 && mark3 >= 40)?"pass":"fail")
        );
    }
}
class StudentsMain{
    public static void main(String args[]){
        int n,rno;
        byte m1,m2,m3;
        Scanner sob = new Scanner(System.in);
        System.out.print("Enter no of students: ");
        n = sob.nextInt();
        Student students[] = new Student[n];
        for(int i = 0;i < n;i++){
            System.out.println("Enter regno and 3 marks");
            rno = sob.nextInt();
            m1 = sob.nextByte();
            m2 = sob.nextByte();
            m3 = sob.nextByte();
            students[i] = new Student(rno, m1, m2, m3);
        }
        for(Student std: students){
            System.out.println("\nDisplaying student report:");
            std.displayResult();
        }
    }
}
