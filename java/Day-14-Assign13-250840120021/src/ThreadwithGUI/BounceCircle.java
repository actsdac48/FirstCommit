package ThreadwithGUI;

import java.awt.Color;
import java.awt.Graphics;

public class BounceCircle implements Runnable {

	MainFrame frm;
	
	
	public BounceCircle(MainFrame frm) {
		super();
		this.frm = frm;
	}
	@Override
	public void run() {
		
		int xPos = 200;
		int yPos = 450;
		try {
			System.out.println("Bounce Circle Thread created");
			
			frm.refRectThread.join(300);
			
			Graphics grp = frm.getGraphics();
			
			try {
				/*
				 * synchronized(frm.dummy) { System.out.println("Entering the Wait state");
				 * frm.dummy.wait();
				 * 
				 * } System.out.println("Leaving wait");
				 */
				while(frm.runningStatus)
				{
					grp.setColor(Color.white);
					grp.drawOval(xPos, yPos, 60,60);
					
					yPos-=4;
					
					
					grp.setColor(Color.black);
					
					grp.drawOval(xPos, yPos, 60,60);
					Thread.sleep(10);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
