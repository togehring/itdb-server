package de.tgehring.itdb.server.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries(value = { 
@NamedQuery(name="Inventarnummer.findAll", query="SELECT i FROM Inventarnummer i"),
@NamedQuery(name="Inventarnummer.last", query="SELECT i FROM Inventarnummer i WHERE i.id" +
		" = (SELECT MAX(i.id) FROM Inventarnummer i)")
})
@XmlRootElement
public class Inventarnummer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique=true, nullable=false)
	private String nummer;
	
	public Inventarnummer() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	@Override
	public String toString() {
		return nummer;
	}
}
