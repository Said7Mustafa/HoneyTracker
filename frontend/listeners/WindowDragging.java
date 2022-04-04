package listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import gui.Main;

public class WindowDragging extends MouseAdapter{
	private volatile int screenX = 0;
	private volatile int screenY = 0;
	private volatile int myX = 0;
	private volatile int myY = 0;
	
	private Main frame;
	
	
	
	public WindowDragging(Main frame) {
		super();
		this.frame = frame;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		int deltaX = e.getXOnScreen() - screenX;
        int deltaY = e.getYOnScreen() - screenY;
       frame.setLocation(myX + deltaX, myY + deltaY);
	}
	@Override
	public void mousePressed(MouseEvent e) {
        screenX = e.getXOnScreen();
        screenY = e.getYOnScreen();
        myX = frame.getX();
        myY = frame.getY();
	}
}