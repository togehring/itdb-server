package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Dvm.findAll", query="SELECT d FROM Dvm d")
@XmlRootElement
public class Dvm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=true)
	private String tonerbezeichnung;
	
	@Column(nullable=true)
	private String schwarzgross;
	
	@Column(nullable=true)
	private String schwarz;
	
	@Column(nullable=true)
	private String colorpack;
	
	@Column(nullable=true)
	private String cyan;
	
	@Column(nullable=true)
	private String magenta;
	
	@Column(nullable=true)
	private String yellow;
	
	@Column(nullable=true)
	private String leitereinheit;
	
	public Dvm() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTonerbezeichnung() {
		return tonerbezeichnung;
	}
	
	public void setTonerbezeichnung(String tonerbezeichnung) {
		this.tonerbezeichnung = tonerbezeichnung;
	}
	
	public String getSchwarzgross() {
		return schwarzgross;
	}
	
	public void setSchwarzgross(String schwarzgross) {
		this.schwarzgross = schwarzgross;
	}
	
	public String getSchwarz() {
		return schwarz;
	}
	
	public void setSchwarz(String schwarz) {
		this.schwarz = schwarz;
	}
	
	public String getColorpack() {
		return colorpack;
	}
	
	public void setColorpack(String colorpack) {
		this.colorpack = colorpack;
	}
	
	public String getCyan() {
		return cyan;
	}
	
	public void setCyan(String cyan) {
		this.cyan = cyan;
	}
	
	public String getMagenta() {
		return magenta;
	}
	
	public void setMagenta(String magenta) {
		this.magenta = magenta;
	}
	
	public String getYellow() {
		return yellow;
	}
	
	public void setYellow(String yellow) {
		this.yellow = yellow;
	}
	
	public String getLeitereinheit() {
		return leitereinheit;
	}
	
	public void setLeitereinheit(String leitereinheit) {
		this.leitereinheit = leitereinheit;
	}
}
