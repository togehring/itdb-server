package de.tgehring.itdb.server.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Gpu.findAll", query="SELECT g FROM Gpu g")
@XmlRootElement
public class Gpu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Hersteller hersteller;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Lieferant lieferant;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Rechnung rechnung;
	
	private String schnittstelle;
	private String speicher;
	private String bezeichnung;
	
	public Gpu() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Hersteller getHersteller() {
		return hersteller;
	}
	
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
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
	
	public String getSchnittstelle() {
		return schnittstelle;
	}
	
	public void setSchnittstelle(String schnittstelle) {
		this.schnittstelle = schnittstelle;
	}
	
	public String getSpeicher() {
		return speicher;
	}
	
	public void setSpeicher(String speicher) {
		this.speicher = speicher;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}
