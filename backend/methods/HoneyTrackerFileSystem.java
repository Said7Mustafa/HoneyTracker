package methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import classes.HoneyTracker;

public class HoneyTrackerFileSystem {
	private static String path = System.getProperty("user.dir") + "\\HoneyyTracker.ser";
	public static void honeySerializeTree(HoneyTracker e) {
		try {
	        FileOutputStream fileOut = new FileOutputStream(path);
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        out.writeObject(e);
	        out.close();
	        fileOut.close();
	     } catch (IOException i) {
	        i.printStackTrace();
	     }
	}
	public static HoneyTracker honeyDeserializeTree() throws IOException {
		File tempFile = new File(path);
		boolean exists = tempFile.exists();
		if (!exists) {
			HoneyTracker c = new HoneyTracker();
			honeySerializeTree(c);
		}
		HoneyTracker tree = null;
		try {
			FileInputStream fileIn = new FileInputStream(path);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			tree = (HoneyTracker) in.readObject();
			in.close();
			fileIn.close();
		} 
		catch (IOException i) {
			i.printStackTrace();
		} 
		catch (ClassNotFoundException c) {
			c.printStackTrace();
			
		}    
		return tree;
		
	}
	public static String getPath() {
		return path;
	}
	
	
}
