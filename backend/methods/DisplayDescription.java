package methods;

import java.util.ArrayList;

import classes.Honey;

public class DisplayDescription {
	public static String getDisplayDescription(int index) {

		ArrayList<Honey> sameDateStorage = FourUniqueHoneyDateStorage.getFourUniqueHoneyDateStorage(Deserialized.getDeserialzed());
		Honey[] tempForButton  = FourUniqueHoney.GetFirstFourUniqueHoney(Deserialized.getDeserialzed());
		String FinalToDisplay = "";

		for (int i = 0; i < indexIsNotNull(); i++) {
			for (int j = 0; j < sameDateStorage.size(); j++) {
				if (tempForButton[i].getDate().equals(sameDateStorage.get(j).getDate())
						&& i == index) {
					FinalToDisplay = FinalToDisplay + 
							"Date	:"+ sameDateStorage.get(j).getDate() + "\n"+
							"Time	:"+ sameDateStorage.get(j).getTime() + "\n"+
							"Identifier	:" + sameDateStorage.get(j).getIdentifier()+ "\n"+
							"Title	" + sameDateStorage.get(j).getTitle() + "\n"+
							"Description:\n" +  sameDateStorage.get(j).getDescription() + "\n\n";
				}
			}
		}
		return FinalToDisplay;
	}
	private static int indexIsNotNull() {
		Honey[] tempForButton  = FourUniqueHoney.GetFirstFourUniqueHoney(Deserialized.getDeserialzed());
		int i;
		for (i = 0; i < tempForButton.length; i++) 
			if (tempForButton[i] == null)
				break;
		return i;		
	}
}
