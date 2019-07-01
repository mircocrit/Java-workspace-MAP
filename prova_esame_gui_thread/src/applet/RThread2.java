package applet;

public class RThread2 implements Runnable{
	private int param;
	private int limit=0;
	private int counter=20 ;
	public static String s="";
	RunThread frame= null;
	public String getter(){	return this.s;}
	
	private static int ThreadCounter=1;
	Thread t;

	RThread2(int x){
		this.param=x;
		t= new Thread(this);
		t.start();
	}
	
	RThread2(int x,RunThread frame ){
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
			counter= counter-2;		
			if(counter< limit) {
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
		RThread2 r1= new RThread2(var);
		r1.t.join();
		RThread2 r2= new RThread2(var);
		r2.t.join();
		RThread2 r3= new RThread2(var);
		r3.t.join();
		RThread2 r4= new RThread2(var);
		r4.t.join();
		RThread2 r5= new RThread2(var);
	}
}
