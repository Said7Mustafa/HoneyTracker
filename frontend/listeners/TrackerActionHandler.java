package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Main;
import gui.PNLMenuTracker;
import methods.DisplayDescription;
import methods.UpdatingHoneyTracker;

public class TrackerActionHandler implements ActionListener{
	private PNLMenuTracker tracker;
	
	public TrackerActionHandler(PNLMenuTracker tracker) {
		this.tracker = tracker;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		//menu Tracker
		if (e.getSource() == tracker.getBtn1())
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(0));
		else if (e.getSource() == tracker.getBtn2()) 
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(1));
		else if (e.getSource() == tracker.getBtn3()) 
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(2));
		else if (e.getSource() == tracker.getBtn4()) 
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(3));
		
		UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
	}
}