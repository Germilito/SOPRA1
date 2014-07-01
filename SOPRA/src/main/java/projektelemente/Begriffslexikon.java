package projektelemente;

import java.util.HashMap;
import javax.persistence.*;
import javax.faces.bean.*;

/**
 * Verwaltet ein Lexikon �ber relevante Begriffe als HashMap.
 * 
 * @author Manuel Weber
 * 
 */
@Entity
@ManagedBean
@ApplicationScoped
public class Begriffslexikon {

	@Id
	@OneToOne
	private Projekt projekt;
	
	private HashMap<String, String> begriffe;

	/**
	 * Pr�ft, ob ein �bergebener Begriff im Begriffslexikon enthalten ist und
	 * gibt einen Wahrheitswert zur�ck.
	 * 
	 * @param begriff
	 * @return Wahrheitswert
	 */
	public boolean enthaelt(String begriff) {
		return begriffe.containsKey(begriff);
	}

	/**
	 * Gibt die Beschreibung zu einem �bergebenen Begriff zur�ck.
	 * 
	 * @param Begriff
	 * @return String Beschreibung
	 */
	public String getBeschreibung(String begriff) {
		return (String) begriffe.get(begriff);
	}
	
	
	/* Getter- und Setter-Methoden */

	public Projekt getProjekt() {
		return projekt;
	}

	public void setProjekt(Projekt projekt) {
		this.projekt = projekt;
	}

	public HashMap<String, String> getBegriffe() {
		return begriffe;
	}

	public void setBegriffe(HashMap<String, String> begriffe) {
		this.begriffe = begriffe;
	}
	
}
