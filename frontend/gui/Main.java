package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


import listeners.WindowDragging;
import methods.UpdatingHoneyTracker;


public class Main extends JFrame{
	
	private static final long serialVersionUID = 111L;
	private JPanel pnlMenu, pnlMenuTracker;
	public static PNLDisplay x = new PNLDisplay();
	private JMenuItem btnExit = new JMenuItem("exit");
	PNLMenuDropdown pnlMenuDropdown = new PNLMenuDropdown();
	
	public Main() {
		DisplayScreen();
		instantiate();
		AddDesign();
		addComponentMain();
		AddListener();
	}
	private void DisplayScreen() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 400);
		this.setLocation(720, 220);
	}
	
	private void instantiate() {
		pnlMenu = new JPanel();
		pnlMenuTracker = new PNLMenuTracker();
		
		
	}
	
	private void AddDesign() {
		pnlMenu.setLayout(new BorderLayout());
		pnlMenu.setPreferredSize(new Dimension(0,30));
	}
	
	private void addComponentMain() {		
		add(pnlMenu, BorderLayout.NORTH);
		
		pnlMenu.add(pnlMenuDropdown, BorderLayout.EAST);
		pnlMenuDropdown.getMenu().add(btnExit);
		
		pnlMenu.add(pnlMenuTracker, BorderLayout.CENTER);	
		
		
		add(x, BorderLayout.CENTER);	
	}
	
	private void AddListener() {
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UpdatingHoneyTracker.getUpdatingHoneyTrackerFile();
				dispose();
				
				
			}
		});
		
		MouseListener ml = new WindowDragging(this);
		MouseMotionListener mml = new WindowDragging(this);
		this.addMouseListener(ml);
		this.addMouseMotionListener(mml);
	}
	
}
