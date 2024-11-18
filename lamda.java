@FunctionalInterface
interface A 
{
    void fun ();
}
class lamda 
{
    public static void main(String[] args) {
        A obj=()->System.out.println("Lamda Expression");
        obj.fun();
    }
}