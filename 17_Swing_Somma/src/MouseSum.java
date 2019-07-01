import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseSum 						implements MouseListener{
	private Somma frame= null;					//preso dal main
	
	public MouseSum(Somma e) {frame = e;}	//costruttore
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//try {//frame.error.setVisible(false);
			
			float num1 = Float.parseFloat(		frame.num1.getText());
			float num2 = Float.parseFloat(		frame.num2.getText());			
			float res = num1+num2;			
												frame.res.setText(	Float.toString(res));
			
		//}catch (NumberFormatException ex) {
			//frame.error.setVisible(true);
		//}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
}
