package maedn;

public class spielbrettdata {
	private spielfigur[] spielfeder;
	private Spieler[] spieler;
	public spielbrettdata(int anzahlspieler)
	{
		this.spielfeder = new spielfigur[40];
		this.spieler = new Spieler[anzahlspieler];
	}
	public spielbrettdata()
	{
		
	}
}
