package classcode;

public class Entry {

	public static void main(String[] args) {

		
		Data objData = new Data();
		
		Increament obj = new Increament(objData);
		
		obj.start();
		
		Decrement obj2 = new Decrement(objData);
		
		Thread objThread = new Thread(obj2);
		
		objThread.start();
		
		
		
		
		
		
		
		
		
		
		
//		Increament incThread = new Increament(5);
//
//		incThread.start();
//		incThread.setDaemon(true);

		
//		  Decrement decThread = new Decrement(); Thread threadObj = new
//		  Thread(decThread);
//		  
//		  threadObj.start();
		  
		 

//		Runnable lambda = () -> {
//			try {
//				for (int i = 0; i < 1000; i++) {
//					System.out.println("Lambda thread");
//					Thread.sleep(200);
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		};

//		Thread obj = new Thread(lambda);
//		obj.start();
		
		
		
		
		
		
		
		System.out.println("MAIN EXITED***********************************************");
	}

}
