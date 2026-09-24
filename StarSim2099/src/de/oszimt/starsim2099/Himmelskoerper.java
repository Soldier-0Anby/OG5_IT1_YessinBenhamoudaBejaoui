package de.oszimt.starsim2099;

public class Himmelskoerper {
	private double posX; 
	private double posY; 
	protected String name;
	
	
	public Himmelskoerper(double posX, double posY, String name) {
		this.posX = posX;
		this.posY = posY;
		this.name = name;
	}
	public Himmelskoerper() {
		
	}
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
