package de.tgehring.itdb.server.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Rechner.findAll", query="SELECT r FROM Rechner r")
@XmlRootElement
public class Rechner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(fetch = FetchType.LAZY)
	private Hersteller hersteller;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Lieferant lieferant;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable=true)
	private Rechnung rechnung;

	@OneToOne(fetch = FetchType.LAZY)
	private Benutzer benutzer;

	@OneToOne(fetch = FetchType.LAZY)
	private Abteilung abteilung;

	@OneToOne(fetch = FetchType.LAZY)
	private Gebäude gebäude;

	@OneToOne(fetch = FetchType.LAZY)
	private Cpu cpu;

	@OneToOne(fetch = FetchType.LAZY)
	private Gpu gpu;

	@OneToOne(fetch = FetchType.LAZY)
	private Monitor monitor;

	private String ram;
	private String hdd1;
	private String hdd2;
	private String hdd3;
	private String hdd4;
	private String laufwerk1;
	private String laufwerk2;

	@ManyToMany
	@JoinTable(name = "RECHNER_HAS_SOFTWARE", 
		joinColumns = { @JoinColumn(name = "RECHNER_ID", referencedColumnName = "ID") }, 
		inverseJoinColumns = { @JoinColumn(name = "SOFTWARE_ID", referencedColumnName = "ID") })
	private List<Software> software;

	@Column(unique = true)
	private String inventarnummer;
	
	private String gerätenummer;
	private boolean ausrangiert;
	private String garantie;
	private String computername;
	private String arbeitsgruppe;
	private String domäne;
	private String ip1;
	
	@Column(nullable=true)
	private String ip2;
	
	private String subnet1;

	@Column(nullable=true)
	private String subnet2;
	
	private String gateway;
	private String dnsPrimary;
	private String dnsSecondary;
	private String anmerkungen;
	private String wartung;
	private boolean initWartung;
	
	public Rechner() {
		
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

	public Benutzer getBenutzer() {
		return benutzer;
	}

	public void setBenutzer(Benutzer benutzer) {
		this.benutzer = benutzer;
	}

	public Abteilung getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(Abteilung abteilung) {
		this.abteilung = abteilung;
	}

	public Gebäude getGebäude() {
		return gebäude;
	}

	public void setGebäude(Gebäude gebäude) {
		this.gebäude = gebäude;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Gpu getGpu() {
		return gpu;
	}

	public void setGpu(Gpu gpu) {
		this.gpu = gpu;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd1() {
		return hdd1;
	}

	public void setHdd1(String hdd1) {
		this.hdd1 = hdd1;
	}

	public String getHdd2() {
		return hdd2;
	}

	public void setHdd2(String hdd2) {
		this.hdd2 = hdd2;
	}

	public String getHdd3() {
		return hdd3;
	}

	public void setHdd3(String hdd3) {
		this.hdd3 = hdd3;
	}

	public String getHdd4() {
		return hdd4;
	}

	public void setHdd4(String hdd4) {
		this.hdd4 = hdd4;
	}

	public String getLaufwerk1() {
		return laufwerk1;
	}

	public void setLaufwerk1(String laufwerk1) {
		this.laufwerk1 = laufwerk1;
	}

	public String getLaufwerk2() {
		return laufwerk2;
	}

	public void setLaufwerk2(String laufwerk2) {
		this.laufwerk2 = laufwerk2;
	}

	public List<Software> getSoftware() {
		return software;
	}

	public void setSoftware(List<Software> software) {
		this.software = software;
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

	public String getGarantie() {
		return garantie;
	}

	public void setGarantie(String garantie) {
		this.garantie = garantie;
	}

	public boolean isAusrangiert() {
		return ausrangiert;
	}

	public void setAusrangiert(boolean ausrangiert) {
		this.ausrangiert = ausrangiert;
	}

	public String getComputername() {
		return computername;
	}

	public void setComputername(String computername) {
		this.computername = computername;
	}

	public String getArbeitsgruppe() {
		return arbeitsgruppe;
	}

	public void setArbeitsgruppe(String arbeitsgruppe) {
		this.arbeitsgruppe = arbeitsgruppe;
	}

	public String getDomäne() {
		return domäne;
	}

	public void setDomäne(String domäne) {
		this.domäne = domäne;
	}

	public String getIp1() {
		return ip1;
	}

	public void setIp1(String ip1) {
		this.ip1 = ip1;
	}

	public String getIp2() {
		return ip2;
	}

	public void setIp2(String ip2) {
		this.ip2 = ip2;
	}

	public String getSubnet1() {
		return subnet1;
	}

	public void setSubnet1(String subnet1) {
		this.subnet1 = subnet1;
	}

	public String getSubnet2() {
		return subnet2;
	}

	public void setSubnet2(String subnet2) {
		this.subnet2 = subnet2;
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

	public String getAnmerkungen() {
		return anmerkungen;
	}

	public void setAnmerkungen(String anmerkungen) {
		this.anmerkungen = anmerkungen;
	}

	public String getWartung() {
		return wartung;
	}

	public void setWartung(String wartung) {
		this.wartung = wartung;
	}

	public boolean isInitWartung() {
		return initWartung;
	}

	public void setInitWartung(boolean initWartung) {
		this.initWartung = initWartung;
	}
}
