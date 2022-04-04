package methods;

import java.util.Random;

import classes.Honey;


public class UniqueRandomNumber {
	public static int randomNumber(Honey front) {
		Random ran = new Random();
		int x;
		while (true) {
			x= ran.nextInt(800)+100;
			if (isExist(x, front))
				break;
		}
		return x;
		
	}
	private static boolean isExist(int number, Honey front) {
		Honey current =  front;
		while (current != null) {
			if (current.getIdentifier() == number)
				return false;
			current = current.getNext();
		}
		return true;
	}
}
