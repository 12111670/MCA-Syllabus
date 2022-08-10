//This is second method of awt progrm.
// second way 2
import java.awt.*;

public class Awt3 extends Frame
{
	Label l;
	TextField tf;
	Button b;
	
	public Awt3()
	{
		setLayout(new FlowLayout());
		
		l = new Label("Name :");
		tf = new TextField(20);
		b = new Button("Ok");
		
		add(l);
		add(tf);
		add(b);
	}	
	public static void main(String args[])
	{
		Awt3 a = new Awt3();
		a.setSize(300,500);
		a.setVisible(true);
	}
}	