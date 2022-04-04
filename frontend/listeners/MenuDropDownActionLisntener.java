package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import classes.HoneyTracker;
import functions.Output;
import gui.Main;
import gui.PNLMenuDropdown;
import gui.PNLMenuTracker;
import methods.Deserialized;
import methods.DisplayDescription;
import methods.HoneyTrackerFileSystem;
import methods.UpdatingHoneyTracker;

public class MenuDropDownActionLisntener extends MouseAdapter implements ActionListener {
	PNLMenuDropdown dropdown;


	public MenuDropDownActionLisntener(PNLMenuDropdown dropdown) {
		this.dropdown = dropdown;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dropdown.getBtnInsert()) {
			insert();
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(0));
			PNLMenuTracker.setTrackerDescriptionDefault();
		}
		else if (e.getSource() == dropdown.getBtnConfirm()) {
			delete();
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(0));
			PNLMenuTracker.setTrackerDescriptionDefault();
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == dropdown.getMenuDisplay()) {
			display();
			Main.x.setTxaDescription(DisplayDescription.getDisplayDescription(0));
		}
	}
	
	
	private void display() {
		HoneyTracker ht =  Deserialized.getDeserialzed();
		dropdown.getTxaList().setText(Output.getAsStringShort(ht));
		UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
	}
	private void insert() {
		if (regexDateTime()) {
			HoneyTracker ht =  Deserialized.getDeserialzed();
			String date = dropdown.getTxtDay().getText()+ "/"+dropdown.getTxtMonth().getText()+ "/"+dropdown.getTxtYear().getText();
			String time = dropdown.getTxtKK().getText()+ ":" + dropdown.getTxtmm().getText();
			ht.enqueue(dropdown.getTxtTitle().getText(), date , time, dropdown.getTxaInsert().getText());
			HoneyTrackerFileSystem.honeySerializeTree(ht);
			resetFields();
		}
		UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
		
		
	}
	private void delete() {
		if (regexIdentifier()) {
			HoneyTracker ht =  Deserialized.getDeserialzed();
			ht.delete(Integer.parseInt(dropdown.getTxtDelete().getText()));
			HoneyTrackerFileSystem.honeySerializeTree(ht);		
			resetFields();
		}
		UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
	}
	
	private void resetFields() {
		dropdown.getTxtDay().setText("dd");
		dropdown.getTxtMonth().setText("MM");
		dropdown.getTxtYear().setText("yyyy");
		
		dropdown.getTxtKK().setText("KK");
		dropdown.getTxtmm().setText("mm");
		
		dropdown.getTxtTitle().setText("");
		dropdown.getTxaInsert().setText("");
		dropdown.getTxtDelete().setText("");
	}
	private boolean regexDateTime() {
		
		if (!dropdown.getTxtDay().getText().matches("[0-9]{2}")) {
			return false;
		}
		if (!dropdown.getTxtMonth().getText().matches("[0-9]{2}")) {
			return false;
		}
		if (!dropdown.getTxtYear().getText().matches("[0-9]{4}")) {
			return false;
		}
		if (!dropdown.getTxtKK().getText().matches("[0-9]{2}")) {
			return false;
		}
		if (!dropdown.getTxtmm().getText().matches("[0-9]{2}")) {
			return false;
		}
		
		return true;
	}
	private boolean regexIdentifier() {
		if (!dropdown.getTxtDelete().getText().matches("[0-9]{3}")) {
			return false;
		}
		return true;
	}
	
	
}
