import java.util.Scanner;
class Student{
    int regNo;
    String name;
    Student(int rno, String n){
        regNo = rno;
        name = n;
    }
    void display(){
        System.out.println("Register No: "+regNo);
        System.out.println("Name: "+name);
    }
}
class Mark extends Student{
    int marks[] = new int[3];
    int total;
    Mark(int rno,String name,int m1,int m2,int m3){
        super(rno, name);
        total = marks[0] = m1;
        total += marks[1] = m2;
        total += marks[2] = m3;
    }
    void displayMark(){
        System.out.println("Marks");
        for(int i=0;i <3;i++) System.out.print("Marks "+(i+1)+" : "+marks[i]+"\n");

    }
    void totalMark(){
        System.out.println("total = "+total);
    }
}
class Result extends Mark{
    char grade;
    Result(int regNo,String Name,int m1,int m2,int m3){
        super(regNo, Name, m1, m2, m3);
        grade();
    }
    char grade(){
        if(total > 90*3) grade = 'S';
        else if(total > 80*3) grade = 'A';
        else if(total > 70*3) grade = 'B';
        else if(total > 60*3) grade = 'C';
        else if(total > 50*3) grade = 'D';
        else if(total >= 40*3) grade = 'E';
        else grade = 'F';
        return grade;        
    }
    void markList(){
        display();
        displayMark();
        System.out.println("Grade = "+grade);
        if(grade != 'F') System.out.println("You pass");
        else System.out.println("You failed");
    }
}
class MultilevelMain{
    public static void main(String args[]){
        Scanner sob = new Scanner(System.in);
        int rno, m1, m2, m3;
        String name;
        System.out.print("Enter name, registerno, m1, m2, m3: ");
        name = sob.nextLine();
        rno = sob.nextInt();
        m1 = sob.nextInt();
        m2 = sob.nextInt();
        m3 = sob.nextInt();
        Result rob = new Result(rno,name,m1,m2,m3);
        rob.markList();
    }
}
