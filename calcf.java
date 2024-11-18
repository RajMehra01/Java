import java.awt.*;
class calcf 
{
    Frame f ;
    Button bsum,bsub,bmul,bdiv;
    Label l1,l2,lr;
    TextField tf1,tf2,tfr ;
    calcf()
    {
        l1 = new Label("Enter First Number");l2 =new Label("Enter Second Number");
        lr = new Label("Result");
        tf1 = new TextField();tf2 = new TextField();tfr = new TextField();
        bsum = new Button("Sum");
        bsub = new Button("Subtract");
        bmul = new Button("Multiply");
        bdiv = new Button("Divide");
        f=new Frame("Calculator");
    }
    void a() 
    {
        f.setLayout(new GridLayout(5, 2));
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(lr);
        f.add(tfr);
        f.add(bsum);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
    }
    void b()
    {
        tfr.setEditable(false);
        f.setVisible(true);
        f.setBounds(400,100,300,200);
    }
    public static void main(String[] args) {
        calcf obj=new calcf();
        obj.a();
        obj.b();
    }
}