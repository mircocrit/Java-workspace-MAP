
class RThread implements Runnable{
	private int counter=1;			//partenza da 1
	private static int param;
	private int limit=5;			//numero stampe per ogni thread
	
	private Thread t;				
	private static int threadId=1;
	
	RThread(int x){
		this.param = x;				//definito da traccia
		t=new Thread(this);		//dove this= new RThread(x)
		//t.setDaemon(true);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Thread numero " + threadId);
		threadId++;
		while(true){
			System.out.println( param +" + "+ (counter) + " = " + (param+counter) );
			counter++;
			if(counter > limit) {
				try {
					t.sleep(1000);
				} catch (InterruptedException e) {}
				return;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		int x = 3;								//parametro X della traccia
		RThread r1 = new RThread(x);
		r1.t.join(1000);					//x++;
		RThread r2 = new RThread(x);
		r2.t.join(1000);					//x++;
		RThread r3 = new RThread(x);
		r3.t.join(1000);					//x++;
		RThread r4 = new RThread(x);
		r4.t.join(1000);					//x++;
		RThread r5 = new RThread(x);
		r5.t.join(1000);
	}
}

