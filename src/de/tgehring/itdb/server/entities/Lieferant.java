package de.tgehring.itdb.server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Lieferant.findAll", query="SELECT l FROM Lieferant l")
@XmlRootElement
public class Lieferant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String bezeichnung;
	private String strasse;
	private String plz;
	private String ort;
	private String postfach;
	private String url;
	private String telefon;
	private String fax;
	private String hotline;
	private String kundennummer;
	private String lkz;
	
	public Lieferant() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public String getStrasse() {
		return strasse;
	}
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	public String getPlz() {
		return plz;
	}
	
	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public String getPostfach() {
		return postfach;
	}
	
	public void setPostfach(String postfach) {
		this.postfach = postfach;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getTelefon() {
		return telefon;
	}
	
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public String getFax() {
		return fax;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getHotline() {
		return hotline;
	}
	
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	
	public String getKundennummer() {
		return kundennummer;
	}
	
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
	
	public String getLkz() {
		return lkz;
	}
	
	public void setLkz(String lkz) {
		this.lkz = lkz;
	}
}
