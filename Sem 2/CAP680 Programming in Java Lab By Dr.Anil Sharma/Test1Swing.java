import javax.swing.*;
class Test1Swing
{
	  public static void main(String args[])
	  {
		  JFrame f = new JFrame();
		  
		  JButton b1 = new JButton("ADD");
		  JButton b2 = new JButton("SUB");
		  JButton b3 = new JButton("Mult");
		  JButton b4 = new JButton("DIV");
		  JButton b5 = new JButton("Calculate");
		  
		  b1.setBounds(50,30,100,40);
		  b2.setBounds(200,30,100,40);
		  b3.setBounds(50,100,100,40);
		  b4.setBounds(200,100,100,40);
		  b5.setBounds(50,150,250,40);
		  
		  f.add(b1);
		  f.add(b2);
		  f.add(b3);
		  f.add(b4);
		  f.add(b5);
		  
		  f.setLayout(null);
		  f.setSize(400,300);
		  f.setVisible(true);
		  
	  }
}	  