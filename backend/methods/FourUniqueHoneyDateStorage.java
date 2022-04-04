package methods;

import java.util.ArrayList;

import classes.Honey;
import classes.HoneyTracker;

public class FourUniqueHoneyDateStorage {
	
	public static ArrayList<Honey> getFourUniqueHoneyDateStorage(HoneyTracker honeyTracker){
		ArrayList<Honey> sameDateStorage = new ArrayList<>(); 
		Honey[] temp = FourUniqueHoney.GetFirstFourUniqueHoney(honeyTracker);
		Honey current;
		
		//if there is no unique date after index 3
		if (!isMoreThanFourUniqueNodes(honeyTracker)) { //false
			current = temp[0];
			while(current != null) {
				sameDateStorage.add(current);
				current = current.getNext();
			}
			return sameDateStorage;
		}		
		//if there is a unique date after index 3
		else if(isMoreThanFourUniqueNodes(honeyTracker)) { //true
			Honey loopBreaker = temp[3];
			current = temp[0];
			while (temp[3].getDate().equals(loopBreaker.getDate()))
				loopBreaker = loopBreaker.getNext();
			
			while(current != loopBreaker) {
				sameDateStorage.add(current);
				current = current.getNext();
			}
			return sameDateStorage;
		}
		return null;
	}
	private static boolean isMoreThanFourUniqueNodes(HoneyTracker honeyTracker) {
		Honey current = FourUniqueHoney.GetFirstFourUniqueHoney(honeyTracker)[3] ;
		Honey[] comepare = FourUniqueHoney.GetFirstFourUniqueHoney(honeyTracker) ;
		if (current != null) {
			while(current != null) {
				if (!current.getDate().equals(comepare[3].getDate()))
					return true;
				current = current.getNext();
			}			
		}
		return false;
	}
}
