//single level inheritance
class A {
    void g(){
        System.out.println("in class A ");
    }
}
class inhe extends A//extends indicates there is inheritance 
{
    void f()
    {
        System.out.println("in inhe class ");
    }
    public static void main(String[] args) {
        inhe obj=new inhe();
        obj.f();
        obj.g();
    }
}