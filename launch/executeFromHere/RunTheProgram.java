package executeFromHere;

import gui.Main;
import methods.UpdatingHoneyTracker;


public class RunTheProgram {
	public static void main(String[] args) {
		UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
		new Main().setVisible(true);
	}
}
