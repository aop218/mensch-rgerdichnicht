package maedn;

public class Spieler {
	private String farbe;
	private String name;
	private spielfigur[] figuren;
	
	public Spieler(String name, String farbe) {
	
		this.name = name;
		this.farbe = farbe;
		for (int i = 0; i <4; i++)
		{
			figuren[i] = new spielfigur(farbe);
		}
	}
}