package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Himmelskoerper {

	// Attribute

	private int anzahlHafen;
	
	
	// Methoden

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}

	public Planet(double posX, double posY, String name, int anzahlHafen) {
	
		super(posX, posY, name);
		this.anzahlHafen = anzahlHafen;
		
	}
	public Planet() {
		super();
	}

	

	public int getAnzahlHafen() {
		return anzahlHafen;
	}

	public void setAnzahlHafen(int anzahlHafen) {
		this.anzahlHafen = anzahlHafen;
	}

}