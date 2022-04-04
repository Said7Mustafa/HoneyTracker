package design;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PNLMenuDesign {
	private static Color color = new Color(170,170,170);
	private static Border border = BorderFactory.createLineBorder(Color.black, 1);
	
	public static void designMenuBar(JMenuBar menubar) {

		menubar.setBorder(new EmptyBorder(0,0,0,0));
		menubar.setBorder(border);

	}
	public static void designButton(JButton btn) {
		btn.setOpaque(true);
		btn.setHorizontalAlignment(JLabel.CENTER);
		btn.setVerticalAlignment(JLabel.CENTER);
		btn.setBackground(color);
		btn.setBorder(new EmptyBorder(0,0,0,0));
		btn.setBorder(border);
	}
	public static void designMenuDelete(JLabel lbl, JTextField txt, JMenuItem menuitem ) {
		lbl.setPreferredSize(new Dimension(60, 30));
		txt.setPreferredSize(new Dimension(60, 30));
		menuitem.setPreferredSize(new Dimension(60, 30));
	}
	public static void designMenu(JMenuItem menuitem, JMenu mnu) {
		menuitem.setPreferredSize(new Dimension(70, 30));
		mnu.setPreferredSize(new Dimension(70, 30));
		
	}
	
}
