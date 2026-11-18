import java.util.Random;

public class Fastsearch {
	public static long[] getSortedList(int laenge) {
		Random rand = new Random(111111);
		long[] zahlenliste = new long[laenge];
		long naechsteZahl = 0;

		for (int i = 0; i < laenge; i++) {
			naechsteZahl += rand.nextInt(3) + 1;
			zahlenliste[i] = naechsteZahl;
		}

		return zahlenliste;
	}
	
	public static void main(String[] args) {
	  long x;
		final int ANZAHL = 20000000; // 20.000.000

		long[] a = getSortedList(ANZAHL);
		long gesuchteZahl = a[ANZAHL - 1];

		
		
		System.out.println(System.currentTimeMillis() - time + "ms");
	}
public static long fastsearch ( long von, long bis, long x) {
		
		if (von < bis) {
			long luka = (von+bis)/2;
			long miku = von + (bis - von) * (x - a[von]) / (a[bis] - a[von]);
					
		}
	}
}
