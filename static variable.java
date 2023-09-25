import java.io.*;
class Student {
    int rollno;
    String name;
    static String College = "SITE";
        Student(int r,String n)
        {
            rollno = r;
            name = n;
        }
        void display() {
            System.out.println(rollno+" "+name+" "+College+" ");
        }
    }
    public class StaticMethodDemo {
        public static void main(String args[]) {
            Student s1 = new Student(209,"Thanusha");
            Student s2 = new Student(249,"Riya");
            System.out.println("Student detalis are ");
            s1.display();
            s2.display();
        }
    }
