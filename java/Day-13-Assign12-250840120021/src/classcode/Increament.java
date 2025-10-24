package classcode;

public class Increament extends Thread {

	Data objData;
	public Increament(Data objData) {
		super();
		this.objData = objData;
	}
	
	
	public void run() {

		while(true) {
			try {
				synchronized(objData) {
					System.out.println("Run in Increment----------" + ++objData.value);
					Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
