package applet;

public class RThread implements Runnable{
	private int param;
	private int limit=20;
	private int counter=0 ;
	public static String s="";
	RunThread frame= null;
	public String getter(){	return this.s;}
	
	private static int ThreadCounter=1;
	Thread t;

	RThread(int x){
		this.param=x;
		t= new Thread(this);
		t.start();
	}
	
	RThread(int x,RunThread frame ){
		this.param=x;
		t= new Thread(this);
		t.start();
		this.frame=frame;
	}
	
	@Override
	public void run() {
		System.out.println("Thread avviato");
		ThreadCounter++;
		while(true) {
			//System.out.println(counter);
			s=s.concat(" " + Integer.toString(counter));		
			counter= counter+2;		
			if(counter> limit) {
				System.out.println(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.res.setText(this.getter());
				return;
			}
			
		}

	}
	
	public static void main (String [] args) throws InterruptedException {
		int var =5;
		RThread r1= new RThread(var);
		r1.t.join();
		RThread r2= new RThread(var);
		r2.t.join();
		RThread r3= new RThread(var);
		r3.t.join();
		RThread r4= new RThread(var);
		r4.t.join();
		RThread r5= new RThread(var);
	}
}
