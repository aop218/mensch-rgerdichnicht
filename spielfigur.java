package maedn;

public class spielfigur {
	 String farbe;
	 boolean imHaus;
	 boolean imZiel;
	 int index;
	 
	 public spielfigur (String farbe)
	 {
		 this.farbe = farbe;
		 this.imHaus = true;
		 this.imZiel = false;
	 }
	 
	 public void ziehen(int wuerfelaugen)
	 {
		 this.index = index + wuerfelaugen;
	 }
}
