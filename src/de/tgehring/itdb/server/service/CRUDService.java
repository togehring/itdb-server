/*
 * @author: Tobias Gehring
 */
package de.tgehring.itdb.server.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.tgehring.itdb.server.entities.Abteilung;
import de.tgehring.itdb.server.entities.Benutzer;
import de.tgehring.itdb.server.entities.Cpu;
import de.tgehring.itdb.server.entities.Drucker;
import de.tgehring.itdb.server.entities.Dvm;
import de.tgehring.itdb.server.entities.Gebäude;
import de.tgehring.itdb.server.entities.Gpu;
import de.tgehring.itdb.server.entities.Hersteller;
import de.tgehring.itdb.server.entities.Inventarnummer;
import de.tgehring.itdb.server.entities.Lieferant;
import de.tgehring.itdb.server.entities.Monitor;
import de.tgehring.itdb.server.entities.Rechner;
import de.tgehring.itdb.server.entities.Rechnung;
import de.tgehring.itdb.server.entities.Software;
import de.tgehring.itdb.server.entities.Tablet;
import de.tgehring.itdb.server.entities.Todo;
import de.tgehring.itdb.server.entities.dao.AbteilungDAO;
import de.tgehring.itdb.server.entities.dao.BenutzerDAO;
import de.tgehring.itdb.server.entities.dao.CpuDAO;
import de.tgehring.itdb.server.entities.dao.DruckerDAO;
import de.tgehring.itdb.server.entities.dao.DvmDAO;
import de.tgehring.itdb.server.entities.dao.GebäudeDAO;
import de.tgehring.itdb.server.entities.dao.GenericDao;
import de.tgehring.itdb.server.entities.dao.GpuDAO;
import de.tgehring.itdb.server.entities.dao.HerstellerDAO;
import de.tgehring.itdb.server.entities.dao.InventarnummerDAO;
import de.tgehring.itdb.server.entities.dao.LieferantDAO;
import de.tgehring.itdb.server.entities.dao.MonitorDAO;
import de.tgehring.itdb.server.entities.dao.RechnerDAO;
import de.tgehring.itdb.server.entities.dao.RechnungDAO;
import de.tgehring.itdb.server.entities.dao.SoftwareDAO;
import de.tgehring.itdb.server.entities.dao.TabletDAO;
import de.tgehring.itdb.server.entities.dao.TodoDAO;

public class CRUDService {
	
	private static CRUDService instance = null;
	
	private static final String PERSISTENCE_UNIT_NAME = "ITDB";
	
	private static EntityManagerFactory factory;
	
	private EntityManager em;
	
	private CRUDService() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
	}
	
	public static CRUDService getInstance() {
		if(instance == null) {
			instance = new CRUDService();
			
		}
		return instance;
	}
	
	public void addAbteilung(Abteilung abteilung) {
		new GenericDao<Abteilung>(em).create(abteilung);
	}
	
	public void editAbteilung(Abteilung abteilung) {
		new GenericDao<Abteilung>(em).update(abteilung);
	}
	
	public void deleteAbteilung(long id) {
		new GenericDao<Abteilung>(em).delete(id);
	}
	
	public Abteilung getAbteilung(long id) {
		return new GenericDao<Abteilung>(em).findOne(id);
	}
	
	public List<Abteilung> getAllAbteilung() {
		return new GenericDao<Abteilung>(em).findAll();
	}
	
	public void addBenutzer(Benutzer benutzer) {
		new GenericDao<Benutzer>(em).create(benutzer);
	}
	
	public void editBenutzer(Benutzer benutzer) {
		new GenericDao<Benutzer>(em).update(benutzer);
	}
	
	public void deleteBenutzer(long id) {
		new GenericDao<Benutzer>(em).delete(id);
	}
	
	public Benutzer getBenutzer(long id) {
		return new GenericDao<Benutzer>(em).findOne(id);
	}
	
	public List<Benutzer> getAllBenutzer() {
		return new GenericDao<Benutzer>(em).findAll();
	}
	
	public void addCpu(Cpu cpu) {
		new GenericDao<Cpu>(em).create(cpu);
	}
	
	public void editCpu(Cpu cpu) {
		new GenericDao<Cpu>(em).update(cpu);
	}
	
	public void deleteCpu(long id) {
		new GenericDao<Cpu>(em).delete(id);
	}
	
	public Cpu getCpu(long id) {
		return new GenericDao<Cpu>(em).findOne(id);
	}
	
	public List<Cpu> getAllCpu() {
		return new GenericDao<Cpu>(em).findAll();
	}
	
	public void addDrucker(Drucker drucker) {
		new GenericDao<Drucker>(em).create(drucker);
	}
	
	public void editDrucker(Drucker drucker) {
		new GenericDao<Drucker>(em).update(drucker);
	}
	
	public void deleteDrucker(long id) {
		new GenericDao<Drucker>(em).delete(id);
	}
	
	public Drucker getDrucker(long id) {
		return new GenericDao<Drucker>(em).findOne(id);
	}
	
	public List<Drucker> getAllDrucker() {
		return new GenericDao<Drucker>(em).findAll();
	}
	
	public void addDvm(Dvm dvm) {
		new GenericDao<Dvm>(em).create(dvm);
	}
	
	public void editDvm(Dvm dvm) {
		new GenericDao<Dvm>(em).update(dvm);
	}
	
	public void deleteDvm(long id) {
		new GenericDao<Dvm>(em).delete(id);
	}
	
	public Dvm getDvm(long id) {
		return new GenericDao<Dvm>(em).findOne(id);
	}
	
	public List<Dvm> getAllDvm() {
		return new GenericDao<Dvm>(em).findAll();
	}

	public void addGebäude(Gebäude gebäude) {
		new GenericDao<Gebäude>(em).create(gebäude);
	}
	
	public void editGebäude(Gebäude gebäude) {
		new GenericDao<Gebäude>(em).update(gebäude);
	}
	
	public void deleteGebäude(long id) {
		new GenericDao<Gebäude>(em).delete(id);
	}
	
	public Gebäude getGebäude(long id) {
		return new GenericDao<Gebäude>(em).findOne(id);
	}
	
	public List<Gebäude> getAllGebäude() {
		return new GenericDao<Gebäude>(em).findAll();
	}
	
	public void addGpu(Gpu gpu) {
		new GenericDao<Gpu>(em).create(gpu);
	}
	
	public void editGpu(Gpu gpu) {
		new GenericDao<Gpu>(em).update(gpu);
	}
	
	public void deleteGpu(long id) {
		new GenericDao<Gpu>(em).delete(id);
	}
	
	public Gpu getGpu(long id) {
		return new GenericDao<Gpu>(em).findOne(id);
	}
	
	public List<Gpu> getAllGpu() {
		return new GenericDao<Gpu>(em).findAll();
	}
	
	public void addHersteller(Hersteller hersteller) {
		new GenericDao<Hersteller>(em).create(hersteller);
	}
	
	public void editHersteller(Hersteller hersteller) {
		new GenericDao<Hersteller>(em).update(hersteller);
	}
	
	public void deleteHersteller(long id) {
		new GenericDao<Hersteller>(em).delete(id);
	}
	
	public Hersteller getHersteller(long id) {
		return new GenericDao<Hersteller>(em).findOne(id);
	}
	
	public List<Hersteller> getAllHersteller() {
		return new GenericDao<Hersteller>(em).findAll();
	}
	
	public void addLieferant(Lieferant lieferant) {
		new GenericDao<Lieferant>(em).create(lieferant);
	}
	
	public void editLieferant(Lieferant lieferant) {
		new GenericDao<Lieferant>(em).update(lieferant);
	}
	
	public void deleteLieferant(long id) {
		new GenericDao<Lieferant>(em).delete(id);
	}
	
	public Lieferant getLieferant(long id) {
		return new GenericDao<Lieferant>(em).findOne(id);
	}
	
	public List<Lieferant> getAllLieferant() {
		return new GenericDao<Lieferant>(em).findAll();
	}
	
	public void addMonitor(Monitor monitor) {
		new GenericDao<Monitor>(em).create(monitor);
	}
	
	public void editMonitor(Monitor monitor) {
		new GenericDao<Monitor>(em).update(monitor);
	}
	
	public void deleteMonitor(long id) {
		new GenericDao<Monitor>(em).delete(id);
	}
	
	public Monitor getMonitor(long id) {
		return new GenericDao<Monitor>(em).findOne(id);
	}
	
	public List<Monitor> getAllMonitor() {
		return new GenericDao<Monitor>(em).findAll();
	}
	
	public void addRechner(Rechner rechner) {
		new GenericDao<Rechner>(em).create(rechner);
	}
	
	public void editRechner(Rechner rechner) {
		new GenericDao<Rechner>(em).update(rechner);
	}
	
	public void deleteRechner(long id) {
		new GenericDao<Rechner>(em).delete(id);
	}
	
	public Rechner getRechner(long id) {
		return new GenericDao<Rechner>(em).findOne(id);
	}
	
	public List<Rechner> getAllRechner() {
		return new GenericDao<Rechner>(em).findAll();
	}
	
	public void addRechnung(Rechnung rechnung) {
		new GenericDao<Rechnung>(em).create(rechnung);
	}
	
	public void editRechnung(Rechnung rechnung) {
		new GenericDao<Rechnung>(em).update(rechnung);
	}
	
	public void deleteRechnung(long id) {
		new GenericDao<Rechnung>(em).delete(id);
	}
	
	public Rechnung getRechnung(long id) {
		return new GenericDao<Rechnung>(em).findOne(id);
	}
	
	public List<Rechnung> getAllRechnung() {
		return new GenericDao<Rechnung>(em).findAll();
	}
	
	public void addSoftware(Software software) {
		new GenericDao<Software>(em).create(software);
	}
	
	public void editSoftware(Software software) {
		new GenericDao<Software>(em).update(software);
	}
	
	public void deleteSoftware(long id) {
		new GenericDao<Software>(em).delete(id);
	}
	
	public Software getSoftware(long id) {
		return new GenericDao<Software>(em).findOne(id);
	}
	
	public List<Software> getAllSoftware() {
		return new GenericDao<Software>(em).findAll();
	}
	
	public void addTablet(Tablet tablet) {
		new GenericDao<Tablet>(em).create(tablet);
	}
	
	public void editTablet(Tablet tablet) {
		new GenericDao<Tablet>(em).update(tablet);
	}
	
	public void deleteTablet(long id) {
		new GenericDao<Tablet>(em).delete(id);
	}
	
	public Tablet getTablet(long id) {
		return new GenericDao<Tablet>(em).findOne(id);
	}
	
	public List<Tablet> getAllTablet() {
		return new GenericDao<Tablet>(em).findAll();
	}
	
	public void addTodo(Todo todo) {
		new GenericDao<Todo>(em).create(todo);
	}
	
	public void editTodo(Todo todo) {
		new GenericDao<Todo>(em).update(todo);
	}
	
	public void deleteTodo(long id) {
		new GenericDao<Todo>(em).delete(id);
	}
	
	public Todo getTodo(long id) {
		return new GenericDao<Todo>(em).findOne(id);
	}
	
	public List<Todo> getAllTodo() {
		return new GenericDao<Todo>(em).findAll();
	}

	public Inventarnummer getLastInventarnummer() {
		return new InventarnummerDAO(em).getLastInventarnummer();
	}
}
