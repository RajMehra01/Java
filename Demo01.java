class Demo01 //Main or main
{
    int a ; 
    Demo01(int a) {
        this.a=a ;

    }
    void f(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Demo01 obj=new Demo01(50);
        obj.f();
    }
}