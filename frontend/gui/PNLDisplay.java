package gui;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import methods.DisplayDescription;




public class PNLDisplay extends JPanel {
	private static final long serialVersionUID = 111L;
	
	private JTextArea txaDescription;

	public PNLDisplay() {
		instantiate();
		AddDesign();
		addComponentMain();
	}
	private void instantiate() {
		txaDescription = new JTextArea();
	}


	private void AddDesign() {
		setLayout(new GridLayout(1, 1));
		txaDescription.setEditable(false);
		
	}
	
	private void addComponentMain() {
		add(txaDescription);
		setTxaDescription(DisplayDescription.getDisplayDescription(0));
	}

	public void setTxaDescription(String text) {
		this.txaDescription.setText(text);
	}
	
	

}
