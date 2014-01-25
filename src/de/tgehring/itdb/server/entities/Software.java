package de.tgehring.itdb.server.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Software.findAll", query="SELECT s FROM Software s")
@XmlRootElement
public class Software {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Lieferant lieferant;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Rechnung rechnung;
	
	private int maxLizenzen;
	private int anzahlLizenzen;
	private String bezeichnung;
	
	public Software() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Lieferant getLieferant() {
		return lieferant;
	}
	
	public void setLieferant(Lieferant lieferant) {
		this.lieferant = lieferant;
	}
	
	public Rechnung getRechnung() {
		return rechnung;
	}
	
	public void setRechnung(Rechnung rechnung) {
		this.rechnung = rechnung;
	}
	
	public int getMaxLizenzen() {
		return maxLizenzen;
	}
	
	public void setMaxLizenzen(int maxLizenzen) {
		this.maxLizenzen = maxLizenzen;
	}
	
	public int getAnzahlLizenzen() {
		return anzahlLizenzen;
	}
	
	public void setAnzahlLizenzen(int anzahlLizenzen) {
		this.anzahlLizenzen = anzahlLizenzen;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}
