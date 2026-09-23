package omnom;

public class Haustier {

	
	private int hunger;
	private int muede;
	private int zufrieden; 
	private int gesund; 
	private String name;
	
	
	public Haustier() {
		this.hunger = hunger;
		this.muede = muede;
		this.zufrieden = zufrieden;
		this.gesund = gesund;
		this.name = name;
	}


	public int getHunger() {
		return hunger;
		
	}


	public void setHunger() {
		this.hunger = hunger;
		if (hunger < 0) {
		 System.out.println("game over");	
		}
	}


	public int getMuede() {
		return muede;
		
	}


	public void setMuede() {
		this.muede = muede;
		if (muede < 0) {
		System.out.println("game over");
		}
	}


	public int getZufrieden() {
		return zufrieden;
	}


	public void setZufrieden() {
		this.zufrieden = zufrieden;
		if (zufrieden < 0) {
			 System.out.println("game over");
		}
	}


	public int getGesund() {
		return gesund;
	}


	public void setGesund() {
		this.gesund = gesund;
		if (gesund < 0) {
			 System.out.println("game over");
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	} 
}
