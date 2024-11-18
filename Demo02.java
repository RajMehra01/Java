class Demo02
{
    int x ;
    Demo02(int a)
        {
            x=a;
        }
        Demo02(Demo02 y)
        {
            x=y.x;
        }
        void f()
        {
            System.out.println(x);   
        }
        public static void main (String[] args)
        {

            Demo02 obj=new Demo02(50);
            Demo02 obj1=new Demo02(obj);
            obj.f();
            obj1.f();
            
        }
    }


