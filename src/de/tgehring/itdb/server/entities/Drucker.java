package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
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
@NamedQuery(name="Drucker.findAll", query="SELECT d FROM Drucker d")
@XmlRootElement
public class Drucker {

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
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Dvm material;

	@Column(unique=true)
	private String inventarnummer;
	
	private String gerätenummer;
	private String bezeichnung;
	
	public Drucker() {
		
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
	
	public Dvm getMaterial() {
		return material;
	}
	
	public void setMaterial(Dvm material) {
		this.material = material;
	}
	
	public String getInventarnummer() {
		return inventarnummer;
	}
	
	public void setInventarnummer(String inventarnummer) {
		this.inventarnummer = inventarnummer;
	}
	
	public String getGerätenummer() {
		return gerätenummer;
	}
	
	public void setGerätenummer(String gerätenummer) {
		this.gerätenummer = gerätenummer;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}