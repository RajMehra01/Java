import java.util.InputMismatchException;
import java.util.Scanner;
class exept 
{
    public static void main(String[] args) 
    {
        int a,b,c ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        try {
            a=sc.nextInt() ;
            System.out.println("Enter the second number ");
            b=sc.nextInt();
            c= a / b ;
            System.out.println(c);
        } 
        catch(ArithmeticException e) 
        {
            System.out.println(e);
        }
        catch(InputMismatchException e1)
        {
            System.out.println(e1);
        }
        System.out.println("Ok");
    }
}