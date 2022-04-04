package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import design.PNLInsertDesign;
import design.PNLMenuDesign;
import listeners.MenuDropDownActionLisntener;



public class PNLMenuDropdown extends JPanel {
	private static final long serialVersionUID = 111L;
	
	private JMenuBar menuBar;
	
	private JMenu menu, menuInsert, menuDelete, menuDisplay;
	
	private JPanel pnlInsert,pnlNorth,pnlSouth;
	private JLabel lblDate, lblTime, lblTitle, lblDescription;
	
	private JPanel pnlDate, pnlTime;
	private JTextField txtTitle, txtDay, txtMonth, txtYear, txtKK, txtmm;;
	private JTextArea txaInsert;
	private JScrollPane scrInsert;
	private JButton btnInsert;
	
	
	private JLabel lblDelete;
	private JMenuItem btnConfirm;
	private JTextField txtDelete;
	
	private JPanel pnlDisplay;
	private JTextArea txaList;
	private JScrollPane scrlList;
	

	
	public PNLMenuDropdown() {
		instantiate();
		AddDesign();
		addComponentMain();
		addListener();
	}


	private void instantiate() {
		menuBar = new JMenuBar();
		
		
		menu = new JMenu("menu");
		
		
		menuInsert= new JMenu("insert"); 
		pnlInsert = new JPanel();
		pnlNorth = new JPanel();
		pnlSouth = new JPanel();
		
		lblDate = new JLabel("date");
		lblTime  = new JLabel("time");
		lblTitle = new JLabel("title");
		lblDescription = new JLabel("description");
		
		pnlDate = new JPanel();
		txtDay = new JTextField("dd");
		txtMonth = new JTextField("MM");
		txtYear = new JTextField("yyyy");
		
		pnlTime = new JPanel();
		txtKK = new JTextField("hh");
		txtmm = new JTextField("mm");
		
		txtTitle = new JTextField();
		
		txaInsert = new JTextArea();
		scrInsert = new JScrollPane(txaInsert);
		btnInsert = new JButton("insert");
		
		
		menuDelete = new JMenu("delete");
		lblDelete = new JLabel("identifier");
		txtDelete = new JTextField();
		btnConfirm = new JMenuItem("comfirm");
		
		menuDisplay = new JMenu("display");
		pnlDisplay = new JPanel();
		txaList = new JTextArea();
		scrlList = new JScrollPane(txaList);
		
	}
	
	private void AddDesign() {
		setLayout(new GridLayout(1, 1));
		setPreferredSize(new Dimension(48,0));
		setBorder(new EmptyBorder(0, 5, 0, 0));
		setBackground(Color.black);
		
		PNLMenuDesign.designMenuBar(menuBar);
		
		pnlInsert.setLayout(new BorderLayout());
		pnlInsert.setPreferredSize(new Dimension(320, 300));
		pnlNorth.setLayout(new GridLayout(3, 2));
		pnlNorth.setPreferredSize(new Dimension(0,100));
		pnlSouth.setLayout(new BorderLayout());
		lblDescription.setPreferredSize(new Dimension(0,25));
		
		pnlDate.setLayout(new GridLayout(1,3));
		pnlTime.setLayout(new GridLayout(1,2));
		
		PNLInsertDesign.designLabel(lblDate);
		PNLInsertDesign.designLabel(lblTime);
		PNLInsertDesign.designLabel(lblTitle);
		PNLInsertDesign.designLabel(lblDescription);
		
		PNLMenuDesign.designMenuDelete(lblDelete, txtDelete, btnConfirm);
		
		PNLMenuDesign.designMenu(menuDelete, menuDisplay);
		txaList.setEditable(false);
		
		pnlDisplay.setLayout(new GridLayout(1,1));
		pnlDisplay.setPreferredSize(new Dimension(320, 300));
	}
	
	private void addComponentMain() {
		add(menuBar);
		
		
		menuBar.add(menu);
		
		menu.add(menuInsert);
		menuInsert.add(pnlInsert);
		
		pnlInsert.add(pnlNorth, BorderLayout.NORTH);
		
		pnlNorth.add(lblDate);
		pnlNorth.add(pnlDate);
		pnlDate.add(txtDay);
		pnlDate.add(txtMonth);
		pnlDate.add(txtYear);
		
		pnlNorth.add(lblTime);
		pnlNorth.add(pnlTime);
		pnlTime.add(txtKK);
		pnlTime.add(txtmm);
		
		pnlNorth.add(lblTitle);
		pnlNorth.add(txtTitle);
		
		pnlInsert.add(pnlSouth, BorderLayout.CENTER);
		pnlSouth.add(lblDescription, BorderLayout.NORTH);
		pnlSouth.add(scrInsert, BorderLayout.CENTER);
		pnlSouth.add(btnInsert, BorderLayout.SOUTH);
		
		menu.add(menuDelete);
		menuDelete.add(lblDelete);
		menuDelete.add(txtDelete);
		menuDelete.add(btnConfirm);
		

		menu.add(menuDisplay);
		menuDisplay.add(pnlDisplay);
		pnlDisplay.add(scrlList);
			
		
	}
	


	
	public JMenu getMenu() {
		return menu;
	}


	private void addListener() {
		ActionListener act = new MenuDropDownActionLisntener(this);
		MouseListener ml = new MenuDropDownActionLisntener(this);
		btnInsert.addActionListener(act);
		btnConfirm.addActionListener(act);
		menuDisplay.addMouseListener(ml);
		
	}
	

	public JTextField getTxtDay() {
		return txtDay;
	}
	
	
	public JTextField getTxtMonth() {
		return txtMonth;
	}
	
	
	public JTextField getTxtYear() {
		return txtYear;
	}


	public JTextField getTxtKK() {
		return txtKK;
	}


	public JTextField getTxtmm() {
		return txtmm;
	}


	public JTextField getTxtTitle() {
		return txtTitle;
	}


	public JTextArea getTxaInsert() {
		return txaInsert;
	}


	public JButton getBtnInsert() {
		return btnInsert;
	}


	public JMenuItem getBtnConfirm() {
		return btnConfirm;
	}
	public JTextField getTxtDelete() {
		return txtDelete;
	}
	
	
	public JMenu getMenuDisplay() {
		return menuDisplay;
	}
	public JTextArea getTxaList() {
		return txaList;
	}


	
	
	

	
}
