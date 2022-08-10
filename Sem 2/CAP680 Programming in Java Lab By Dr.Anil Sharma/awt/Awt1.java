
import java.awt.*;
class Awt1
{
   public static void main(String args[])
   {
	   Frame f = new Frame("My first App");
	   f.setLayout(new FlowLayout());
	   
	   Button b = new Button("ok");
	   Label l = new Label("Name");
	   TextField tl = new TextField(20);
	   
	   f.add(tl);
	   f.add(l);
       f.add(b);
	   
	  f.setSize(300,3000);
	  f.setVisible(true);
   }
}   