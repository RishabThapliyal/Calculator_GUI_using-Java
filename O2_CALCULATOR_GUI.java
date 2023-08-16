package END;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class O2_CALCULATOR_GUI {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();

	}

}

class Calculator extends JFrame implements ActionListener
{
	JTextField t1 , t2 , t3;
	JButton b1 , b2 , b3 , b4;
	JLabel l ;
	
	public Calculator()
	{
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		
		b1 = new JButton("ADD");
		b2 = new JButton("SUB");
		b3 = new JButton("Mul");
		b4 = new JButton("Div");
		
		l = new JLabel("Result");
		t3 = new JTextField(20);
		
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l);
		add(t3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setLayout(new FlowLayout());     
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		int sum = 0;
		
		if (ae.getSource() == b1) 
		{
			sum = num1 + num2;
		} 
		else if (ae.getSource() == b2) 
		{
			sum = num1 - num2;
		} 
		else if (ae.getSource() == b3) 
		{
			sum = num1 * num2;
		} 
		else if (ae.getSource() == b4) 
		{
			sum = num1 / num2;
		}
		
		t3.setText(sum + "");
	}
}
