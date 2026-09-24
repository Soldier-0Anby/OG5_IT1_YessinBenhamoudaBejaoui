package de.oszimt.starsim2099;

public class Mond extends Himmelskoerper{
private boolean haterz;

public Mond(double posX, double posY, String name, boolean haterz) {
	super(posX, posY, name);
	this.haterz = haterz;
}

public static char[][] getDarstellung() {
	char[][] mondShape = { { '\0', '/', 'U', 'U', '\\', '\0' }, { '|', 'M', 'I', 'K', 'U', '|' },
			{ '\0', '\\', 'U', 'U', '/', '\0' } };
	return mondShape;
}


public Mond() {
super();
}

public boolean isHaterz() {
	return haterz;
}

public void setHaterz() {
	this.haterz = haterz;
}
public boolean getHaterz() {
	return haterz;
}
}
