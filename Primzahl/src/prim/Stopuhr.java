package prim;
public class Stopuhr {

protected double startZeit;
protected double endZeit;
//protected double gZeit;


public void starten() {
	this.startZeit = System.currentTimeMillis();
	
}
public void stoppen() {
	this.endZeit = System.currentTimeMillis();
	
}

public void reset() {
	this.endZeit = 0;
	this.startZeit = 0;
	
}

public double vergangeneZeit() {
	return endZeit - startZeit;
}


}

  


