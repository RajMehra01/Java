public class poly 
{
    void sum (int a, int b)
    {
        System.out.println("Sum : "+(a+b));
    }
    void sum (double a, int b)
    {
        System.out.println("Sum : "+(a+b));
    }
    void sum (int a, double b)
    {
        System.out.println("Sum : "+(a+b));
    }
    void sum (double a, double b)
    {
        System.out.println("Sum : "+(a+b));
    }
    void sum (int a, int b, int c)
    {
        System.out.println("Sum : "+(a+b+c));
    }
public static void main (String[] args)
{
    poly obj = new poly();
    obj.sum(10,20);
    obj.sum(5.9,6.9);
    obj.sum(12,4,8);
    obj.sum(14,6.2);
    obj.sum(6.3,5);
}
}