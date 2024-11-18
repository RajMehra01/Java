import java.util.Scanner;

public class Demo{
    int a,b,c;
    Demo() //constructor
    {
        a=0;
        b=0;
        c=0;
        System.out.println("in Constructor");
    }
    void f()//method
    {
 try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("Enter First Number ");
    a=scanner.nextInt();
    System.out.println("Enter Second Number ");
    b=scanner.nextInt();
}
    c=a+b;
    System.out.println("Sum = "+c);
    System.out.println("in method ");   
    }
    public static void main(String[] args) //main 
        {
            Demo obj=new Demo();
            obj.f();

            System.out.println("in main ");
    }
}