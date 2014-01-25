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
@NamedQuery(name="Tablet.findAll", query="SELECT t FROM Tablet t")
@XmlRootElement
public class Tablet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(fetch=FetchType.LAZY)
	private Benutzer benutzer;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Hersteller hersteller;

	@OneToOne(fetch=FetchType.LAZY)
	private Lieferant lieferant;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Rechnung rechnung;
	
	private String bezeichnung;
	private String ip;
	private String subnet;
	private String gateway;
	private String dnsPrimary;
	private String dnsSecondary;
	
	public Tablet() {
		
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
	
	public Benutzer getBenutzer() {
		return benutzer;
	}
	
	public void setBenutzer(Benutzer benutzer) {
		this.benutzer = benutzer;
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
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getSubnet() {
		return subnet;
	}
	
	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}
	
	public String getGateway() {
		return gateway;
	}
	
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	
	public String getDnsPrimary() {
		return dnsPrimary;
	}
	
	public void setDnsPrimary(String dnsPrimary) {
		this.dnsPrimary = dnsPrimary;
	}
	
	public String getDnsSecondary() {
		return dnsSecondary;
	}
	
	public void setDnsSecondary(String dnsSecondary) {
		this.dnsSecondary = dnsSecondary;
	}
}
