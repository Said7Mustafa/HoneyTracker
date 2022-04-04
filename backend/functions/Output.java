package functions;

import classes.Honey;
import classes.HoneyTracker;
import methods.HoneyDetail;

public class Output {
	public static void outputInConsoleLong(HoneyTracker honeytracker) {
		Honey current =  honeytracker.getFront();
		while (current != null) {
			System.out.println(HoneyDetail.getDetailLong(current));
			current = current.getNext();
		}
	}
	public static String getAsStringLong(HoneyTracker honeytracker) {
		Honey current =  honeytracker.getFront();
		String finalOutput = "";
		while (current != null) {
			finalOutput = 	finalOutput + HoneyDetail.getDetailLong(current);
			current = current.getNext();
		}
		return finalOutput;
	}
	public static void outputFirstFourUniqueHoneyLong(Honey[] FirstFourUniqueHoney ) {
		for (int i = 0; i < FirstFourUniqueHoney.length; i++) {
			if (FirstFourUniqueHoney[i] == null)
				break;
			System.out.println(HoneyDetail.getDetailLong(FirstFourUniqueHoney[i]));
		}
	}
	public static void outputInConsoleShort(HoneyTracker honeytracker) {
		System.out.println("IDENTIFIER   TITLE	DATE	  TIME");
		Honey current =  honeytracker.getFront();
		while (current != null) {
			System.out.println(HoneyDetail.getDetailShort(current));
			current = current.getNext();
		}
	}
	public static String getAsStringShort(HoneyTracker honeytracker) {
		Honey current =  honeytracker.getFront();
		String finalOutput = "IDENTIFIER   TITLE            DATE         TIME\n";
		while (current != null) {
			finalOutput = 	finalOutput + HoneyDetail.getDetailShort(current) + "\n";
			current = current.getNext();
		}
		return finalOutput;
	}
	public static void outputFirstFourUniqueHoneyShort(Honey[] FirstFourUniqueHoney ) {
		System.out.println("IDENTIFIER   TITLE	DATE	TIME");
		for (int i = 0; i < FirstFourUniqueHoney.length; i++) {
			if (FirstFourUniqueHoney[i] == null)
				break;
			System.out.println(HoneyDetail.getDetailShort(FirstFourUniqueHoney[i]));
		}
	}
}
