import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Somma {	
	JFrame f = new JFrame("Somma");
	JButton sum = new JButton("+");
	
	JTextField num1 = new JTextField(10);		//dimensione
	JTextField num2 = new JTextField(10);
	JLabel res = new JLabel();

	public Somma() {								//costruttore
		f.setLayout(new FlowLayout());																//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		f.setSize(500, 500);
		
		//sum.setBounds(450, 50, 90, 30);		
		sum.addMouseListener(new MouseSum(this));													//error.setVisible(false);
		f.add(num1); 
		f.add(num2);
		f.add(sum);																					//f.add(error);
		f.add(res);
		f.setVisible(true);
		}
	
	public static void main(String[] args) {		
		Somma e = new Somma();
	}
}

