package maedn;
import java.util.Random;

import javax.swing.*;

public class spielbrettGUI extends JFrame {
	private spielbrettdata daten;
	private JLabel [] felder;
	private JButton wuerfeln;
	private JTextArea ergebnis;
	private int figurindexgruen;
	private int figurindexgelb;
	private JLabel hintergrundbild;
	private int rundenindex;
	private JLabel haha;
	
	public spielbrettGUI()
	{
		this.setLocation(100, 100);
		this.setSize(1000,1000);
		this.setTitle("Mensch Ärger Dich Nicht");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.figurindexgruen = 0;
		this.figurindexgelb = 39;
		
		haha = new JLabel();
		this.add(haha);
		haha.setBounds(400, 400, 400, 400);
		
		ergebnis = new JTextArea();
		this.add(ergebnis);
		ergebnis.setBounds(130, 15, 100, 100);
		
		wuerfeln = new JButton("WÜRFELN :)");
		this.add(wuerfeln);
		wuerfeln.setBounds(15, 15, 100, 100);
		wuerfeln.addActionListener(e->wuerfeln());
		
		felder = new JLabel[40];
		
		Icon icon1 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.17.png" );
		felder[0] = new JLabel(icon1); 
		this.add(felder[0]);
		felder[0].setBounds(20,20,150,150);
		
		Icon icon3 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-09 um 11.50.50.png" );
		felder[39] = new JLabel(icon3); 
		this.add(felder[39]);
		
		Icon icon2 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.14.png" );
		for (int i = 1; i<39; i++)
		{
		felder[i] = new JLabel(icon2); 
		this.add(felder[i]);
		}
		felder[0].setBounds(400,10,100,100);
		felder[1].setBounds(400,90,100,100);
		felder[2].setBounds(400,170,100,100);
		felder[3].setBounds(400,250,100,100);
		felder[4].setBounds(400,330,100,100);
		felder[5].setBounds(320,330,100,100);
		felder[6].setBounds(240,330,100,100);
		felder[7].setBounds(160,330,100,100);
		felder[8].setBounds(80,330,100,100);
		felder[9].setBounds(0,330,100,100);
		felder[10].setBounds(0,410,100,100);
		felder[11].setBounds(0,490,100,100);
		felder[12].setBounds(80,490,100,100);
		felder[13].setBounds(160,490,100,100);
		felder[14].setBounds(240,490,100,100);
		felder[15].setBounds(320,490,100,100);
		felder[16].setBounds(400,490,100,100);
		felder[17].setBounds(400,570,100,100);
		felder[18].setBounds(400,650,100,100);
		felder[19].setBounds(400,730,100,100);
		felder[20].setBounds(400,810,100,100);
		felder[21].setBounds(480,810,100,100);
		felder[22].setBounds(560,810,100,100);
		felder[23].setBounds(560,730,100,100);
		felder[24].setBounds(560,650,100,100);
		felder[25].setBounds(560,570,100,100);
		felder[26].setBounds(560,490,100,100);
		felder[27].setBounds(640,490,100,100);
		felder[28].setBounds(720,490,100,100);
		felder[29].setBounds(800,490,100,100);
		felder[30].setBounds(800,410,100,100);
		felder[31].setBounds(800,330,100,100);
		felder[32].setBounds(720,330,100,100);
		felder[33].setBounds(640,330,100,100);
		felder[34].setBounds(560,330,100,100);
		felder[35].setBounds(560,250,100,100);
		felder[36].setBounds(560,170,100,100);
		felder[37].setBounds(560,90,100,100);
		felder[38].setBounds(560,10,100,100);
		felder[39].setBounds(480,10,100,100);

		hintergrundbild = new JLabel(new ImageIcon("/Users/jonasholfeld/Desktop/HTWK/2. semester/AOP II/CePdjZtWQAAL2wm.jpg_large"));
		this.add(hintergrundbild);
		hintergrundbild.setBounds(0, 0, 1000, 1000);


	}

	private void wuerfeln() {
		if ((rundenindex%2) == 0 )
		{
		haha.setVisible(false);
		Icon icon1 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.17.png" );
		Icon icon2 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.14.png" );
		Icon icon3 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-09 um 11.50.50.png" );
		Random zufall = new Random();
		int ergebniszahl = zufall.nextInt(6)+1;
		String ergebniswort =  new String();
		ergebniswort = Integer.toString(ergebniszahl);
		this.ergebnis.setText(ergebniswort);
		felder[figurindexgruen].setIcon(icon2);
		figurindexgruen = (figurindexgruen + ergebniszahl) % 39;
		felder[figurindexgruen].setIcon(icon1);
		if (figurindexgruen == figurindexgelb)
		{
			haha.setVisible(true);
			System.out.println("geschmissen");
			figurindexgelb = 0;
			haha.setIcon(new ImageIcon("/Users/jonasholfeld/Desktop/HTWK/2. semester/AOP II/hqdefault.jpg"));
			felder[0].setIcon(icon3);
		}
		}
		else
		{
			Icon icon1 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-09 um 11.50.50.png" );
			Icon icon2 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.14.png" );
			Random zufall = new Random();
			int ergebniszahl = zufall.nextInt(6)+1;
			String ergebniswort =  new String();
			ergebniswort = Integer.toString(ergebniszahl);
			this.ergebnis.setText(ergebniswort);
			felder[figurindexgelb].setIcon(icon2);
			figurindexgelb = (figurindexgelb + ergebniszahl) % 39;
			felder[figurindexgelb].setIcon(icon1);
			if (figurindexgelb == figurindexgruen)
			{
				haha.setVisible(true);
				System.out.println("geschmissen");
				figurindexgruen = 0;
				felder[0].setIcon(new ImageIcon ("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.17.png"));
				haha.setIcon(new ImageIcon("/Users/jonasholfeld/Desktop/HTWK/2. semester/AOP II/hqdefault.jpg"));
			}
		}
		rundenindex = rundenindex+1;
	}
	

	public void setNotes(spielbrettdata daten) {
		this.daten = daten;		
	}

}
