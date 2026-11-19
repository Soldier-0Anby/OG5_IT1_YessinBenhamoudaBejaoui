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
		final int ANZAHL = 200000000; // 20.000.000

		long[] a = getSortedList(ANZAHL); //erstellt eine sortierte liste
		long gesuchteZahl = a[ANZAHL-1];
		long time = System.currentTimeMillis();
	   
		System.out.println(gesuchteZahl);
		System.out.println(fastsearch (0, ANZAHL -1, gesuchteZahl, a));
		System.out.println(System.currentTimeMillis() - time + "ms");
 
		
	}
	public static long fastsearch(int von, int bis, long x, long[] a ) {

		if (von < bis) {
			int luka = (von + bis) / 2;
			int miku = (int)(von + (bis - von) * (x - a[von]) / (a[bis] - a[von]));
			if (luka > miku) {
				luka = miku;
				miku = luka;

			}
			if (x == a[luka]) {
				return luka;
			} else if (x == a[miku]) {
				return miku;
			}
			else if (x < a[luka]) {
				return fastsearch(von, luka-1, x, a);
			}
			else if (x < a[miku]) {
				return fastsearch(luka+1, miku-1, x, a);
			}
			else {
				return fastsearch(miku+1, bis, x, a);
			}
			
			

		}
		
		return -1;
	}

	
}
