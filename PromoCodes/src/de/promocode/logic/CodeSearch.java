package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list        Liste der Codes im Long-Format
	 * @param searchValue Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(int von, int bis, long[] list, long searchValue) {
        
		if (von < bis) {
			int rin = (von + bis) / 2;
			int meiko = (int) (von + (bis - von) * (searchValue - list[von]) / (list[bis] - list[von]));

			if (rin > meiko) {
				meiko = rin;
				rin = meiko;
			}
			if (searchValue == list[rin]) {
				return rin;
			} else if (searchValue == list[meiko]) {
				return meiko;

			} else if (searchValue < list[rin]) {
				return findPromoCode(von, rin - 1, list, searchValue);
			} else if (searchValue < list[meiko]) {
				return findPromoCode(rin + 1, meiko - 1, list, searchValue);
			} else {
				return findPromoCode(meiko + 1, bis, list, searchValue);
			}
		}
		return NOT_FOUND;
	}

}
