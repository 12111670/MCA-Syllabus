//This progam illustrate how Button is make a Event and Handel it by using ActionListener.

package awt;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
    int count=0;
    Label l;
    Button b;
    
    public MyFrame()
    {
        super("Button Demo");
        
        l = new Label("   "+count);
        b = new Button("OK");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText("  "+count);
    }
}

public class Awt4
{
	public static void main(String[] args) 
	{
	   MyFrame f = new MyFrame();
	   f.setSize(400,300);
	   f.setVisible(true);
	}
}