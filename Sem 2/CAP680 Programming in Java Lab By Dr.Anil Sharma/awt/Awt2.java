/*This is the second method of awt package programming.
   First way 1.*/


import java.awt.*;
class MyFrame extends Frame
{
	
	Label l;
	TextField tf;
	Button b;
	
	public MyFrame()
	{
		super("MY App");
		setLayout(new FlowLayout());
		
		l = new Label("Name :");
		tf = new TextField(20);
		b = new Button("Ok");
		
		add(l);
		add(tf);
		add(b);
	}
}
public class Awt2
{
   public static void main(String args[])   
   {
	   MyFrame f = new MyFrame();
	   f.setSize(200,300);
	   f.setVisible(true);
   }
}   