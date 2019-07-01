package applet;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

import java.applet.*;

public class RunThread {
	JFrame f = new JFrame("run");
	JButton button= new JButton("Avvia");
	JButton button2= new JButton("Inverti");
	//JTextArea area= new JTextArea("Inserire numero -->");
	//JTextField text= new JTextField(10);	
	//JTextField res = new JTextField(30);
	JLabel res = new JLabel();
	
	RunThread(){
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(button);
		f.add(button2);
		//f.add(area);	//numero threads
		//f.add(text);
		f.add(res);
		f.setSize(500,200);
		button.addMouseListener(new Worker(this));
		button2.addMouseListener(new Worker2(this));
	}
	public static void main (String [] args) {
		RunThread r = new RunThread();
	}
}
