package view.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class AddLandDialog extends JDialog implements ActionListener {
	public static final long serialVersionUID = 1L;
	
	public AddLandDialog(ManageAssetDialog landDialog) 
	{
		super(landDialog, "Add Land Dialog", true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub

	}
}
