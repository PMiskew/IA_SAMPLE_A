import java.awt.Dimension;

import javax.swing.JFrame;

public class WindowA extends JFrame {

	
	private Controller mainControl;
	
	public WindowA(Controller c) {
		
		mainControl = c; //this gives you access to the controller 
		this.setSize(new Dimension(400,400));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
}


