package esempioThread;

class RThread implements Runnable{	// extends Thread
	private int counter=1;			//partenza da 1
	private int param;
	private int limit=5;			//numero stampe per ogni thread
	
	RThread(int x){		this.param = x;				}//definito da traccia

	@Override	//non c'è se extends
	public void run() {
		while(true){
			System.out.println( param +" + "+ counter );
			counter++;
			if(counter > limit) {
				System.out.println("");
				return;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		int x = 3;								//parametro X della traccia
		for(int i=0;i<5;i++) {
			new Thread(new RThread(x)).start();
		}
	}
}

