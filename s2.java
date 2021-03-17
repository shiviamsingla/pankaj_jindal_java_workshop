import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class f1 extends JFrame implements ActionListener
{
		JButton b1,b2;
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		f1()
		{
			super("Guru Nanak");
			setLayout(null);
			
			l1=new JLabel("Enter X");
			l1.setBounds(10,10,70,30);  
			this.add(l1);
			
			t1 = new JTextField();
			t1.setBounds(90,10,100,30);
			this.add(t1);
			
			l2=new JLabel("Enter y");
			l2.setBounds(10,50,70,30);  
			this.add(l2);
			
			t2 = new JTextField();
			t2.setBounds(90,50,70,30);
			this.add(t2);
			
			
			l3=new JLabel("Enter X");
			l3.setBounds(10,90,70,30);  
			this.add(l3);
			
			t3 = new JTextField();
			t3.setBounds(90,90,70,30);
			this.add(t3);
			
			
			b1 = new JButton("ADD");
			b1.setBounds(30,130,70,30);
			b1.addActionListener(this);
			b1.setActionCommand("add");
			this.add(b1);
			
			b2 = new JButton("SUB");
			b2.setBounds(110,130,70,30);
			b2.addActionListener(this);
			b2.setActionCommand("minus");
			this.add(b2);
			
		}//end of const.
		public void actionPerformed(ActionEvent ae)
		{
			
			String str = ae.getActionCommand();
			int x,y,z=0;
			x =Integer.parseInt(t1.getText());
			y =Integer.parseInt(t2.getText());
			
			if(str.equals("add"))
			{
				z=x+y;
			}
			else if(str=="minus")
			{
				z=x-y;
			}
			String ans=""+z;
			t3.setText(ans);
		}
		
}//end of class
class s2
{
	public static void main(String args[])
	{
		f1 obj = new f1();
		obj.setSize(400,400);
		obj.setVisible(true);
	}
}
