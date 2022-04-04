package methods;

import classes.Honey;
import classes.HoneyTracker;

public class UpdatingHoneyTracker {
	
	static HoneyTracker ht;
	public static void getUpdatingHoneyTrackerFile() {
		ht = Deserialized.getDeserialzed();
		Honey current = ht.getFront();
		while (current != null) {
			if (DateTime_Comparing.dateComparing(ht.getFront().getDate(), SystemDateAndTimeAsString.getDate()) <= 0)
				if (DateTime_Comparing.timeComparing(ht.getFront().getTime(), SystemDateAndTimeAsString.getTime()) <= 0)
					ht.dequeue();
			else  if(DateTime_Comparing.dateComparing(ht.getFront().getDate(), SystemDateAndTimeAsString.getDate()) == 1)
				break;
			current = current.getNext();
		}
		HoneyTrackerFileSystem.honeySerializeTree(ht);
		
	}
	public static HoneyTracker getUpdatingHoneyTrackersim(HoneyTracker htt) {
		Honey current = htt.getFront();
		while (current != null) {
			System.out.println(DateTime_Comparing.dateComparing(htt.getFront().getDate(), SystemDateAndTimeAsString.getDate()));
			
			if (DateTime_Comparing.dateComparing(htt.getFront().getDate(), SystemDateAndTimeAsString.getDate()) <= 0) {
				if (DateTime_Comparing.timeComparing(htt.getFront().getTime(), SystemDateAndTimeAsString.getTime()) <= 0) {
					htt.dequeue();
				}
			}
			else  if(DateTime_Comparing.dateComparing(htt.getFront().getDate(), SystemDateAndTimeAsString.getDate()) == 1) {
				break;
			}
			
			current = current.getNext();
		}
		return htt;
	}
	
}
