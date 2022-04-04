package test;



import classes.HoneyTracker;
import methods.HoneyTrackerFileSystem;
import methods.UpdatingHoneyTracker;


public class run {
	public static void main(String[] args) {
		HoneyTracker h = new HoneyTracker();
	
		
		h.enqueue("SEN2002", "08/01/2018", "13:34", "exam");
		h.enqueue("SEN2003", "08/02/2018", "13:34", "exam");
		h.enqueue("SEN2004", "08/03/2018", "13:34", "exam");
		h.enqueue("SEN2005", "08/04/2018", "13:34", "exam");
		h.enqueue("SEN2006", "08/05/2018", "13:34", "exam");
		h.enqueue("SEN2007", "18/07/2022", "21:58", "exam");
//		HoneyTrackerFileSystem.honeySerializeTree(h);
		
//		functions.Output.outputInConsoleShort(h);
		
//		UpdatingHoneyTracker.getUpdatingHoneyTrackersim(h)
//		System.out.println();
//		functions.Output.outputInConsoleShort(UpdatingHoneyTracker.getUpdatingHoneyTrackersim(h));
//		try {
//			h = HoneyTrackerFileSystem.honeyDeserializeTree();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}
}
