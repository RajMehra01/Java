import java.awt.*;
import java.awt.event.*;
class namef implements ActionListener
{
    Frame f ;
    Button b ;
    Label l ;
    TextField tf ; 
    namef() 
    {
        tf=new TextField();
        l=new Label("Enter Your Name");
        b=new Button("Click Me");
        f=new Frame("My AWT frame");
        f.setLayout(null);
        f.add(b);
        f.add(tf);
        f.add(l);
        l.setBounds(100,50,200,50);
        tf.setBounds(100,100,200,50);
        b.setBounds(100, 150, 200, 50);
        f.setBounds(400, 100, 400, 250);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() 
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Hello! "+ tf.getText()+" How are you ");
    }
    public static void main(String[] args)
    {new namef();}
}