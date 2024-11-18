import java.awt.*;
import java.awt.event.*;
class Fram
{
    Frame f ;
    Fram()
    {
        f=new Frame("My AWT Frame");
        f.setVisible(true);
        f.setBounds(400,100,700,500);
        f.addWindowListener(new WindowAdapter() 
        {
         @Override
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }   
        });
    }
    public static void main(String[] args) 
    {
        new Fram();
    }
}