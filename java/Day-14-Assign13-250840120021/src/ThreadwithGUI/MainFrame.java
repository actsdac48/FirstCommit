package ThreadwithGUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainFrame extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	boolean runningStatus = true;
	Object dummy = new Object();
	
	Thread refRectThread;
	
	ExecutorService executer = Executors.newSingleThreadExecutor();
	ExecutorService some = Executors.newScheduledThreadPool(5);
	
	public MainFrame() {
		setLayout(null);
		Button buttonStart = new Button("Start");
		buttonStart.setBounds(400, 50, 60, 20);
		buttonStart.addActionListener(new ButtonHandler());;
		add(buttonStart);
		
		Button buttonStop = new Button("Stop");
		buttonStop.setBounds(400, 120, 60, 20);
		buttonStop.addActionListener(new ButtonHandler());
		add(buttonStop);
		
		
		setBounds(0, 0, 500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				executer.shutdown();
				dispose();
			}
		});
	}
}