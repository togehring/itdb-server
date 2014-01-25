package de.tgehring.itdb.server.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Hersteller.findAll", query="SELECT h FROM Hersteller h")
@XmlRootElement
public class Hersteller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	private HerstellerTyp typ;
	
	private String bezeichnung;
	
	public Hersteller() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public HerstellerTyp getTyp() {
		return typ;
	}
	
	public void setTyp(HerstellerTyp typ) {
		this.typ = typ;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}
