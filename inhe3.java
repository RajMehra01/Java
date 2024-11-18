import java.util.Scanner;

public class inhe3 {
    int a, b, c ;
    void input()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number : ");
            a = scanner.nextInt() ;
            System.out.println("Enter the second number : ");
            b = scanner.nextInt() ;
        }
    }
    public static void main(String[] args) 
    {
        A obj1 = new A() ;
        obj1.input();
        obj1.add();

        B obj2 = new B() ;
        obj2.input();
        obj2.sub();

        C obj3 = new C() ;
        obj3.input();
        obj3.mul();

        D obj4 = new D() ;
        obj4.input();
        obj4.div();
    }
}
class A extends inhe3 
{
    void add ()
    {
        c = a+b ;
        System.out.println("sum"+c);
    }
}
class B extends inhe3 
{
    void sub ()
    {
        c = a-b ;
        System.out.println("sub"+c);
    }
}
class C extends inhe3 
{
    void mul ()
    {
        c = a*b ;
        System.out.println("mul"+c);
    }
}
class D extends inhe3 
{
    void div ()
    {
        c = a/b ;
        System.out.println("div"+c);
    }
}
