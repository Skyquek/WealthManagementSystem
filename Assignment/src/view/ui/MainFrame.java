package view.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {
	public static final long serialVersionUID = 1L;
	
	private JButton btnManageAsset = new JButton("Manage Asset"); 
	
	public MainFrame() {
		super("Wealth Management System");
		
		// Grid Layout
		GridLayout layout = new GridLayout();
		
		this.add(btnManageAsset);
		
		this.setLayout(layout);
		this.setSize(300,200);
		this.setResizable(true);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source == btnManageAsset)
		{
			System.out.print("Hello World!");
		}
	}
	
	public static void main(String[] args)
	{
		new  MainFrame();
	}

}
