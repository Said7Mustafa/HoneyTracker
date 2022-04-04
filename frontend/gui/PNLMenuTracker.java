package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Honey;
import design.PNLMenuDesign;
import listeners.TrackerActionHandler;
import methods.Deserialized;
import methods.FourUniqueHoney;
import methods.UpdatingHoneyTracker;




public class PNLMenuTracker extends JPanel{
	private static final long serialVersionUID = 111L;
	
	private static JButton btn1;

	private static JButton btn2;

	private static JButton btn3;

	private static JButton btn4;
	
	public PNLMenuTracker() {
		instantiate();
		AddDesign();
		addComponentMain();
		setTrackerDescriptionDefault();
		AddListener();
	}
	private void instantiate() {
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		btn4 = new JButton();
	}

	private void AddDesign() {
		setLayout(new GridLayout(1, 4));
		setBorder(new EmptyBorder(0, 0, 0, 10));	
		setBackground(Color.black);
		
		PNLMenuDesign.designButton(btn1);
		PNLMenuDesign.designButton(btn2);
		PNLMenuDesign.designButton(btn3);
		PNLMenuDesign.designButton(btn4);
		
	}
	
	private void addComponentMain() {
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}
	
	public static void setTrackerDescriptionDefault() {
		UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
		btn1.setText(getBtnText(btn1));
		btn2.setText(getBtnText(btn2));
		btn3.setText(getBtnText(btn3));
		btn4.setText(getBtnText(btn4));
	}
	
	private static String getBtnText(JButton btn) {
		Honey[] temp =  FourUniqueHoney.GetFirstFourUniqueHoney(Deserialized.getDeserialzed());
		if (temp != null)
			if (btn == btn1 && temp[0] != null)
				return temp[0].getDate();
			else if (btn == btn2 && temp[1] != null) 
				return temp[1].getDate();
			else if (btn == btn3 && temp[2] != null) 
				return temp[2].getDate();
			else if (btn == btn4 && temp[3] != null) 
				return temp[3].getDate();
			else
				return null;
		return null;
	}
	
	private void AddListener() {
		ActionListener act = new TrackerActionHandler(this);
		btn1.addActionListener(act);
		btn2.addActionListener(act);
		btn3.addActionListener(act);
		btn4.addActionListener(act);
	}
	
	
	public JButton getBtn1() {
		return btn1;
	}
	public JButton getBtn2() {
		return btn2;
	}
	public JButton getBtn3() {
		return btn3;
	}
	public JButton getBtn4() {
		return btn4;
	}
	
	
}
