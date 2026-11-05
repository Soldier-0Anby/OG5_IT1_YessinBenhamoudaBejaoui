package prim;

import java.util.*;

public class Preem {
	public static void main(String[] args) {
        Stopuhr uhr = new Stopuhr();
        uhr.reset();
		Scanner scan = new Scanner(System.in);
		long p = scan.nextLong();
		boolean check = true;
		uhr.starten();
		if (p > 1) {
			if (p == 2) {
				System.out.println("ist eine primzahxl");
			}
				for (long i = 2; i < p; i++) {
					if (p % i == 0) {
						
						check = false;
						break;

					}

					
				}
			

		}
       uhr.stoppen();
       System.out.println(uhr.vergangeneZeit());
       System.out.println("ist eine primzahl"+ " "+ check);
	}
}
