package methods;

import java.io.IOException;

import classes.HoneyTracker;

public class Deserialized {
	public static HoneyTracker getDeserialzed() {

		HoneyTracker honeyTracker = null;
		try {
			honeyTracker = HoneyTrackerFileSystem.honeyDeserializeTree();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return honeyTracker;
		
	}
}
