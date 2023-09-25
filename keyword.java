import java.io.*;
class Student {
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display()
    {
        System.out.println("Student details are ");
        System.out.println(rollno+" "+name+" "+fee+" ");
    }
}
public class ThisDemo2 {
    public static void main(String args[]) {
        Student S1 = new Student(4209,"Thanusha",45700);
        Student S2 = new Student(4249,"Riya",45700);
        S1.display();
        S2.display();
    }
}
