package methods;

import classes.Honey;

public class HoneyDetail {
	public static String getDetailLong(Honey obj) {
		return  
				"Date		:"+ obj.getDate() + "\n"+
				"Time		:"+ obj.getTime() + "\n"+
				"Identifier	:" + obj.getIdentifier()+ "\n"+
				"Title		:" + obj.getTitle() + "\n"+
				"Description:\n	    " +  obj.getDescription() + "\n\n";
	}
	public static String getDetailShort(Honey obj) {
		return  "       "+
				obj.getIdentifier()+ "        " + 
				obj.getTitle() + "   " +
				obj.getDate() + "   " + 
				obj.getTime();
	}
}
