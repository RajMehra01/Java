//Java Functional interfaces are that contains only one abstract method,used primarily with lamda expressions.
//its required to type @FunctionalInterface
@FunctionalInterface
interface A 
{
    void fun();
}
class funcinte 
{
    public static void main(String[] args) {
        A obj=new A()
        {
            public void fun ()
            {
                System.out.println("Functional Interface");
            }
        };
        obj.fun();
    }
}
