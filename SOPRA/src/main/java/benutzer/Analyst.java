package benutzer;

import java.util.Set;

import javax.faces.bean.*;
import javax.persistence.*;

import projektelemente.Projekt;

/**
 * 
 * 
 */
@Entity
@ManagedBean
@ApplicationScoped
public class Analyst extends Benutzer {
	
	@OneToMany(mappedBy = "analyst")
	private Set<Projekt> projekte;
	
	public Analyst() {
		this.accountart = "Analyst";
	}
	
	/**
	 * Die Methode erlaubt es dem Analyst ein neues Projekt zu erstellen. Dabei
	 * wird der Methode ein Name f�r das Projekt �bergeben. Existiert der
	 * gew�hlte Projektname noch nicht, wird ein neues Objekt vom Typ Projekt
	 * mit dem �bergebenen Namen erzeugt.
	 * 
	 * @param bezeichnung
	 */
	public void projektErstellen(String bezeichnung) {

	}

	/**
	 * Mit dieser Methode wird ein Kunde dem Projekt zugewiesen. Jedem Projekt
	 * kann maximal ein Kunde zugewiesen werden. Dabei wird jeweils ein Objekt
	 * der Klassen Kunde und Projekt der Methode �bergeben. Der Analyst ist
	 * allen Projekten, die er selbst erstellt hat, automatisch zugewiesen.
	 * 
	 * @param kunde
	 * @param projekt
	 */
	public void kundeHinzuf�gen(Kunde kunde, Projekt projekt) {

	}

	/**
	 * Mit dieser Methode hat der Analyst die M�glichkeit, ein
	 * bereits abgeschlossenes Projekt zu kopieren, um es evtl. zu erweitern.
	 * Dabei wird eine neue Instanz der Klasse Projekt erzeugt. Die Methode
	 * ben�tigt als Parameter ein abgeschlossenes Projekt und eine
	 * Projektbezeichnung f�r die Kopie als String, welche noch nicht existieren
	 * darf.
	 * 
	 * @param projekt
	 */
	public void projektKopieren(Projekt projekt) {

	}
	
	/* Getter- Und Setter-Methoden */

	public Set<Projekt> getProjekte() {
		return projekte;
	}

	public void setProjekte(Set<Projekt> projekte) {
		this.projekte = projekte;
	}
	
}