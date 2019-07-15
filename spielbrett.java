package maedn;

import javax.swing.*;

public class spielbrett {
	private spielbrettGUI view;
	private spielbrettdata daten;
	
	public spielbrett ()
	{
		view = new spielbrettGUI();
		daten = new spielbrettdata();
		view.setNotes(daten);
	}
	public static void main (String[] args)
	{
		spielbrett spielbrett = new spielbrett();
		spielbrett.active();
		
	}
	private void active()
	{
		view.setVisible(true);
	}
}
