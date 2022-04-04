package methods;

import classes.Honey;
import classes.HoneyTracker;

public class FourUniqueHoney {
	public static Honey[] GetFirstFourUniqueHoney(HoneyTracker honeyTracker) {
		Honey[] FirstFourUniqueHoney = new Honey[4] ;
		Honey current = honeyTracker.getFront();
		
		int indexEntry = 0;
		boolean flag = false;
		int i = 0;
		int j = 0;
		int retrieveToComapare = 0;
		while (j <= honeyTracker.getSize()) {
			if (current == null) 
				break;
			else if(indexEntry == 0) {
				FirstFourUniqueHoney[indexEntry] = current;
				indexEntry++;
			}
			while (i < j) {
				if(retrieveToComapare < 3) {
					if (DateTime_Comparing.dateComparing(FirstFourUniqueHoney[retrieveToComapare].getDate(), 
							current.getDate()) != 0) {
						flag = true;
						retrieveToComapare++;
					}
					else 
						flag = false;
				}
				i++;
			}			
			if(flag) {
				flag = false;
				FirstFourUniqueHoney[indexEntry] = current;
				indexEntry++;	
			}
			current = current.getNext();	
			j++;
		}
		
		return FirstFourUniqueHoney;
	}
	
	
}
