package applet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import applet.RThread;
//Avvia
public class Worker2 implements MouseListener {
	RunThread frame= null;
	
	public Worker2(RunThread runThread) {
		this.frame=runThread;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//int num= Integer.parseInt(frame.text.getText());
		int base = 0;
		//for(int i=0; i< num; i++) {
		;
			//}
		//frame.res.setText("Threads avviati correttamente");
		//System.out.println(r1.getter());
		frame.res.setText(new RThread2(base,this.frame).getter());
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public static void main(String[] args) {

	}

}
