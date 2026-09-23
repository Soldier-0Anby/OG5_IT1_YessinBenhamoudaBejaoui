package omnom;

public class Haustier {

	
	private int hunger;
	private int muede;
	private int zufrieden; 
	private int gesund; 
	private String name;
	
	
	public Haustier(int hunger, int muede, int zufrieden, int gesund, String name) {
		this.hunger = hunger;
		this.muede = muede;
		this.zufrieden = zufrieden;
		this.gesund = gesund;
		this.name = name;
	}


	public int getHunger() {
		return hunger;
		
	}


	public void setHunger(int hunger) {
		this.hunger = hunger;
		if (hunger < 0) {
		 throw new IllegalArgumentException("der wert darf nicht negativ sein");
		}
		if (hunger > 100) {
			 throw new IllegalArgumentException("der wert darf nicht ueber 100 sein");
		}
	}


	public int getMuede() {
		return muede;
		
	}


	public void setMuede(int muede) {
		this.muede = muede;
		if (muede < 0) {
			muede = 0;
			 throw new IllegalArgumentException("der wert darf nicht negativ sein");
		}
		if (muede > 100) {
			 throw new IllegalArgumentException("der wert darf nicht ueber 100 sein");
		}
	}


	public int getZufrieden() {
		return zufrieden;
	}


	public void setZufrieden(int zufrieden) {
		this.zufrieden = zufrieden;
		if (zufrieden < 0) {
			 throw new IllegalArgumentException("der wert darf nicht negativ sein");
		}
		if (zufrieden > 100) {
			 throw new IllegalArgumentException("der wert darf nicht ueber 100 sein");
		}
	}


	public int getGesund() {
		return gesund;
	}


	public void setGesund(int gesund) {
		this.gesund = gesund;
		if (gesund < 0) {
			 throw new IllegalArgumentException("der wert darf nicht negativ sein");
		}
		if (gesund > 100) {
			 throw new IllegalArgumentException("der wert darf nicht ueber 100 sein");
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	} 
}
