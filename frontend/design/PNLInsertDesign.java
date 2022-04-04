package design;


import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PNLInsertDesign {
	private static Color color;
	private static Border border = BorderFactory.createLineBorder(Color.black, 1);
	public static void designLabel(JLabel lbl) {
		lbl.setOpaque(true);
		color = new Color(170,170,170);
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setVerticalAlignment(JLabel.CENTER);
		lbl.setBackground(color);
		lbl.setBorder(new EmptyBorder(0,0,0,0));
		lbl.setBorder(border);
		
	}
}
