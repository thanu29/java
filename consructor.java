class A {
    A() {
        System.out.println("Inside default constructor");
    }
    A(int x) {
        this();
        System.out.println("Inside parameterized constructor");
        System.out.println("x value is "+x);
    }
}
public class ThisConstructorDemo {
    public static void main(String args[]) {
        A a = new A(4209);
    }
}
