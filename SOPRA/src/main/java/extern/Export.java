package extern;

import projektelemente.Projekt;

/**
 * Bietet die M�glichkeit des PDF-Exports von Projekten.
 * 
 * @author Manuel Weber
 * 
 */
public class Export {

	/**
	 * Erzeugt eine PDF-Datei f�r ein �bergebenes Projekt und gibt einen Link
	 * zum Speicherort zur�ck.
	 * 
	 * @param projekt
	 * @return Link zum Speicherort
	 */
	public static String pdfKomplett(Projekt projekt) {
		return "";
	}

	/**
	 * Erzeugt eine PDF-Datei f�r ein �bergebenes Projekt und gibt einen Link
	 * zum Speicherort zur�ck. Im Gegensatz zu pdfKomplett() werden hier beim
	 * Export nur abgenommene Anforderungen ber�cksichtigt.
	 * 
	 * @param projekt
	 * @return 
	 * @return Link zum Speicherort
	 */
	public static String pdfAbgenommeAnforderungen(Projekt projekt) {
		return "";
	}
}
