import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Frame extends JFrame implements ActionListener{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	//10-dot 11-add 12-sub 13-mul 14-divide 15-equal
	JTextField input;
	String oper = "";
	float x,y;
	Frame(){
		//Global Settings
		super("Simple Calculator");

		/*========================
		  ==DRAW ELEMENTS START===
		  ========================*/

		input = new JTextField();
		input.setBounds(10,10,170,30);
		this.add(input);

		b1 = new JButton("1");
		b1.setBounds(10,50,50,30);
		b1.addActionListener(this);
		b1.setActionCommand("one");
		this.add(b1);
		b2 = new JButton("2");
		b2.setBounds(70,50,50,30);
		b2.addActionListener(this);
		b2.setActionCommand("two");
		this.add(b2);
		b3 = new JButton("3");
		b3.setBounds(130,50,50,30);
		b3.addActionListener(this);
		b3.setActionCommand("three");
		this.add(b3);

		b4 = new JButton("4");
		b4.setBounds(10,100,50,30);
		b4.addActionListener(this);
		b4.setActionCommand("four");
		this.add(b4);
		b5 = new JButton("5");
		b5.setBounds(70,100,50,30);
		b5.addActionListener(this);
		b5.setActionCommand("five");
		this.add(b5);
		b6 = new JButton("6");
		b6.setBounds(130,100,50,30);
		b6.addActionListener(this);
		b6.setActionCommand("six");
		this.add(b6);

		b7 = new JButton("7");
		b7.setBounds(10,150,50,30);
		b7.addActionListener(this);
		b7.setActionCommand("seven");
		this.add(b7);
		b8 = new JButton("8");
		b8.setBounds(70,150,50,30);
		b8.addActionListener(this);
		b8.setActionCommand("eight");
		this.add(b8);
		b9 = new JButton("9");
		b9.setBounds(130,150,50,30);
		b9.addActionListener(this);
		b9.setActionCommand("nine");
		this.add(b9);

		b11 = new JButton("+");
		b11.setBounds(10,200,35,30);
		b11.addActionListener(this);
		b11.setActionCommand("addition");
		this.add(b11);
		b12 = new JButton("-");
		b12.setBounds(55,200,35,30);
		b12.addActionListener(this);
		b12.setActionCommand("minus");
		this.add(b12);
		b13 = new JButton("*");
		b13.setBounds(100,200,35,30);
		b13.addActionListener(this);
		b13.setActionCommand("multiply");
		this.add(b13);
		b14 = new JButton("/");
		b14.setBounds(145,200,35,30);
		b14.addActionListener(this);
		b14.setActionCommand("divide");
		this.add(b14);

		b0 = new JButton("0");
		b0.setBounds(10,250,50,30);
		b0.addActionListener(this);
		b0.setActionCommand("zero");
		this.add(b0);
		b10 = new JButton(".");
		b10.setBounds(70,250,50,30);
		b10.addActionListener(this);
		b10.setActionCommand("dot");
		this.add(b10);
		b15 = new JButton("=");
		b15.setBounds(130,250,50,30);
		b15.addActionListener(this);
		b15.setActionCommand("equal");
		this.add(b15);

		/*========================
		  ==DRAW ELEMENTS END=====
		  ========================*/
	} //constructor ends here

	public void actionPerformed(ActionEvent ae){
		String act = ae.getActionCommand();
		if (act.equals("one")) {
			input.setText(input.getText()+1);
		}
		else if (act.equals("two")) {
			input.setText(input.getText()+2);
		}
		else if (act.equals("three")) {
			input.setText(input.getText()+3);
		}
		else if (act.equals("four")) {
			input.setText(input.getText()+4);
		}
		else if (act.equals("five")) {
			input.setText(input.getText()+5);
		}
		else if (act.equals("six")) {
			input.setText(input.getText()+6);
		}
		else if (act.equals("seven")) {
			input.setText(input.getText()+7);
		}
		else if (act.equals("eight")) {
			input.setText(input.getText()+8);
		}
		else if (act.equals("nine")) {
			input.setText(input.getText()+9);
		}
		else if (act.equals("zero")) {
			input.setText(input.getText()+0);
		}
		else if (act.equals("dot")) {
			input.setText(input.getText()+".");
		}
		else if (act.equals("addition")) {
			oper = "+";
			x = Float.parseFloat(input.getText());
			input.setText("");
		}
		else if (act.equals("minus")) {
			oper = "-";
			x = Float.parseFloat(input.getText());
			input.setText("");
		}
		else if (act.equals("multiply")) {
			oper = "*";
			x = Float.parseFloat(input.getText());
			input.setText("");
		}
		else if (act.equals("divide")) {
			oper = "/";
			x = Float.parseFloat(input.getText());
			input.setText("");
		}
		/*Get second operand here and display output*/
		else if (act.equals("equal")) {
			y = Float.parseFloat(input.getText());
			if (oper.equals("+")) {
				input.setText(""+(x+y));
			}
			else if (oper.equals("-")) {
				input.setText(""+(x-y));
			}
			else if (oper.equals("*")) {
				input.setText(""+(x*y));
			}
			else if (oper.equals("/")) {
				input.setText(""+(x/y));
			}
			else{
				System.out.println("Oops! Something happen wrong");
			}
		}
		else{
			System.out.println("Wrong Event Command");
		}

	} // interface methods ends here
}
class calculator{
	public static void main(String[] args) {
		Frame obj = new Frame();
		obj.setSize(210,350);
		obj.setLayout(null);
		obj.setVisible(true);
	}
}
