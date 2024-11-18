//static nested class is a class inside a class that contains a keyword static
class Staticnested
{
static  class A
{
void fun ()
{
    System.out.println("Static Nested Class");
}
}
public static void main(String[] args) {
    Staticnested.A obj=new Staticnested.A();
    obj.fun();
}
}