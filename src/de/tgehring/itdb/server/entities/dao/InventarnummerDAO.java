package de.tgehring.itdb.server.entities.dao;

import javax.persistence.EntityManager;

import de.tgehring.itdb.server.entities.Inventarnummer;

public class InventarnummerDAO {

	private EntityManager em;
	
	public InventarnummerDAO(EntityManager em) {
		this.em = em;
	}
	
	public Inventarnummer getLastInventarnummer() {
		em.getTransaction().begin();
		Inventarnummer inummer = (Inventarnummer) em.createNamedQuery("Inventarnummer.last").getResultList().get(0);
		em.getTransaction().commit();
		em.close();
		return inummer;
	}
	
}
