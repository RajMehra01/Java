import java.util.Scanner;

class inhe2 extends A
{
void f() 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number ");
    a = sc.nextInt(); 
    System.out.println("Enter second number ");
    b = sc.nextInt();
}
public static void main(String[] args) {
    inhe2 obj=new inhe2() ;
    obj.f();
    obj.g();
}
}
class A 
{
    int a,b,c ;
    void g() 
    {
        c=a+b;
        System.out.println("Sum="+c);
    }
}