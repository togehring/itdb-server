package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Rechnung.findAll", query="SELECT r FROM Rechnung r")
@XmlRootElement
public class Rechnung {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String rechnungsnummer;
	
	private double rechnungsbetrag;
	private String rechnungsdatum;
	
	public Rechnung() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRechnungsnummer() {
		return rechnungsnummer;
	}

	public void setRechnungsnummer(String rechnungsnummer) {
		this.rechnungsnummer = rechnungsnummer;
	}

	public double getRechnungsbetrag() {
		return rechnungsbetrag;
	}

	public void setRechnungsbetrag(double rechnungsbetrag) {
		this.rechnungsbetrag = rechnungsbetrag;
	}

	public String getRechnungsdatum() {
		return this.rechnungsdatum;
	}

	public void setRechnungsdatum(String rechnungsdatum) {
		this.rechnungsdatum = rechnungsdatum;
	}
}
