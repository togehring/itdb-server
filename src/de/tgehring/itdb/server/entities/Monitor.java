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
@NamedQuery(name="Monitor.findAll", query="SELECT m FROM Monitor m")
@XmlRootElement
public class Monitor {
	
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

	@Column(unique=true)
	private String inventarnummer;
	
	private String gerätenummer;
	private int zoll;
	private boolean touch;
	private String bezeichnung;
	
	public Monitor() {
		
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
	
	public int getZoll() {
		return zoll;
	}
	
	public void setZoll(int zoll) {
		this.zoll = zoll;
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public void setTouch(boolean touch) {
		this.touch = touch;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}
