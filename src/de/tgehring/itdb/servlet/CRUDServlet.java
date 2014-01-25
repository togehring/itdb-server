package de.tgehring.itdb.servlet;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

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
import de.tgehring.itdb.server.entities.dao.GenericDao;
import de.tgehring.itdb.server.service.CRUDService;

@Path("/crud")
public class CRUDServlet {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/abteilung")
	public Response addAbteilung(JAXBElement<Abteilung> abteilung) {
		GenericDao<Abteilung> abteilungDao = new GenericDao<>(em);
		CRUDService.getInstance().addAbteilung(abteilung.getValue());
		String result = "Abteilung saved : " + abteilung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/abteilung")
	public Response editAbteilung(JAXBElement<Abteilung> abteilung) {
		CRUDService.getInstance().editAbteilung(abteilung.getValue());
		String result = "Abteilung edited : " + abteilung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/abteilung/{id}")
	public Response deleteAbteilung(@PathParam("id") long id) {
		CRUDService.getInstance().deleteAbteilung(id);
		String result = "Abteilung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/abteilung/{id}")
	public Abteilung getAbteilung(@PathParam("id") long id) {
		return CRUDService.getInstance().getAbteilung(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/abteilung")
	public List<Abteilung> getAllAbteilung() {
		return CRUDService.getInstance().getAllAbteilung();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/benutzer")
	public Response addBenutzer(JAXBElement<Benutzer> benutzer) {
		CRUDService.getInstance().addBenutzer(benutzer.getValue());
		String result = "Benutzer saved : " + benutzer.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/benutzer")
	public Response editBenutzer(JAXBElement<Benutzer> benutzer) {
		CRUDService.getInstance().editBenutzer(benutzer.getValue());
		String result = "Benutzer edited : " + benutzer.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/benutzer/{id}")
	public Response deleteBenutzer(@PathParam("id") long id) {
		CRUDService.getInstance().deleteBenutzer(id);
		String result = "Benutzer deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/benutzer/{id}")
	public Benutzer getBenutzer(@PathParam("id") long id) {
		return CRUDService.getInstance().getBenutzer(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/benutzer")
	public List<Benutzer> getAllBenutzer() {
		return CRUDService.getInstance().getAllBenutzer();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cpu")
	public Response addCpu(JAXBElement<Cpu> cpu) {
		CRUDService.getInstance().addCpu(cpu.getValue());
		String result = "Cpu saved : " + cpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cpu")
	public Response editCpu(JAXBElement<Cpu> cpu) {
		CRUDService.getInstance().editCpu(cpu.getValue());
		String result = "Cpu edited : " + cpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/cpu/{id}")
	public Response deleteCpu(@PathParam("id") long id) {
		CRUDService.getInstance().deleteAbteilung(id);
		String result = "Abteilung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/cpu/{id}")
	public Cpu getCpu(@PathParam("id") long id) {
		return CRUDService.getInstance().getCpu(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/cpu")
	public List<Cpu> getAllCpu() {
		return CRUDService.getInstance().getAllCpu();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/drucker")
	public Response addDrucker(JAXBElement<Drucker> drucker) {
		CRUDService.getInstance().addDrucker(drucker.getValue());
		String result = "Drucker saved : " + drucker.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/drucker")
	public Response editDrucker(JAXBElement<Drucker> drucker) {
		CRUDService.getInstance().editDrucker(drucker.getValue());
		String result = "Drucker edited : " + drucker.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/drucker/{id}")
	public Response deleteDrucker(@PathParam("id") long id) {
		CRUDService.getInstance().deleteDrucker(id);
		String result = "Drucker deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/drucker/{id}")
	public Drucker getDrucker(@PathParam("id") long id) {
		return CRUDService.getInstance().getDrucker(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/drucker")
	public List<Drucker> getAllDrucker() {
		return CRUDService.getInstance().getAllDrucker();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/dvm")
	public Response addDvm(JAXBElement<Dvm> dvm) {
		CRUDService.getInstance().addDvm(dvm.getValue());
		String result = "Dvm saved : " + dvm.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/dvm")
	public Response editDvm(JAXBElement<Dvm> dvm) {
		CRUDService.getInstance().editDvm(dvm.getValue());
		String result = "Abteilung edited : " + dvm.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/dvm/{id}")
	public Response deleteDvm(@PathParam("id") long id) {
		CRUDService.getInstance().deleteDvm(id);
		String result = "Dvm deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/dvm/{id}")
	public Dvm getDvm(@PathParam("id") long id) {
		return CRUDService.getInstance().getDvm(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/dvm")
	public List<Dvm> getAllDvm() {
		return CRUDService.getInstance().getAllDvm();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/gebaeude")
	public Response addGebäude(JAXBElement<Gebäude> gebäude) {
		CRUDService.getInstance().addGebäude(gebäude.getValue());
		String result = "Gebäude saved : " + gebäude.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/gebaeude")
	public Response editGebäude(JAXBElement<Gebäude> gebäude) {
		CRUDService.getInstance().editGebäude(gebäude.getValue());
		String result = "Gebäude edited : " + gebäude.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/gebaeude/{id}")
	public Response deleteGebäude(@PathParam("id") long id) {
		CRUDService.getInstance().deleteGebäude(id);
		String result = "Gebäude deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/gebaeude/{id}")
	public Gebäude getGebäude(@PathParam("id") long id) {
		return CRUDService.getInstance().getGebäude(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/gebaeude")
	public List<Gebäude> getAllGebäude() {
		return CRUDService.getInstance().getAllGebäude();
	}
	
	@POST
	@Produces("application/json")
	@Path("/gpu")
	public Response addGpu(JAXBElement<Gpu> gpu) {
		CRUDService.getInstance().addGpu(gpu.getValue());
		String result = "Gpu saved : " + gpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/gpu")
	public Response editGpu(JAXBElement<Gpu> gpu) {
		CRUDService.getInstance().editGpu(gpu.getValue());
		String result = "Gpu edited : " + gpu.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/gpu/{id}")
	public Response deleteGpu(@PathParam("id") long id) {
		CRUDService.getInstance().deleteGpu(id);
		String result = "Abteilung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/gpu/{id}")
	public Gpu getGpu(@PathParam("id") long id) {
		return CRUDService.getInstance().getGpu(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/gpu")
	public List<Gpu> getAllGpu() {
		return CRUDService.getInstance().getAllGpu();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/hersteller")
	public Response addHersteller(JAXBElement<Hersteller> hersteller) {
		CRUDService.getInstance().addHersteller(hersteller.getValue());
		String result = "Hersteller saved : " + hersteller.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/hersteller")
	public Response editHersteller(JAXBElement<Hersteller> hersteller) {
		CRUDService.getInstance().editHersteller(hersteller.getValue());
		String result = "Hersteller edited : " + hersteller.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/hersteller/{id}")
	public Response deleteHersteller(@PathParam("id") long id) {
		CRUDService.getInstance().deleteHersteller(id);
		String result = "Hersteller deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/hersteller/{id}")
	public Hersteller getHersteller(@PathParam("id") long id) {
		return CRUDService.getInstance().getHersteller(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/hersteller")
	public List<Hersteller> getAllHersteller() {
		return CRUDService.getInstance().getAllHersteller();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/lieferant")
	public Response addLieferant(JAXBElement<Lieferant> lieferant) {
		CRUDService.getInstance().addLieferant(lieferant.getValue());
		String result = "Lieferant saved : " + lieferant.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/lieferant")
	public Response editLieferant(JAXBElement<Lieferant> lieferant) {
		CRUDService.getInstance().editLieferant(lieferant.getValue());
		String result = "Lieferant edited : " + lieferant.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/lieferant/{id}")
	public Response deleteLieferant(@PathParam("id") long id) {
		CRUDService.getInstance().deleteLieferant(id);
		String result = "Lieferant deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/lieferant/{id}")
	public Lieferant getLieferant(@PathParam("id") long id) {
		return CRUDService.getInstance().getLieferant(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/lieferant")
	public List<Lieferant> getAllLieferant() {
		return CRUDService.getInstance().getAllLieferant();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/monitor")
	public Response addMonitor(JAXBElement<Monitor> monitor) {
		CRUDService.getInstance().addMonitor(monitor.getValue());
		String result = "Monitor saved : " + monitor.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/monitor")
	public Response editMonitor(JAXBElement<Monitor> monitor) {
		CRUDService.getInstance().editMonitor(monitor.getValue());
		String result = "Monitor edited : " + monitor.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/monitor/{id}")
	public Response deleteMonitor(@PathParam("id") long id) {
		CRUDService.getInstance().deleteMonitor(id);
		String result = "Monitor deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/monitor/{id}")
	public Monitor getMonitor(@PathParam("id") long id) {
		return CRUDService.getInstance().getMonitor(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/monitor")
	public List<Monitor> getAllMonitor() {
		return CRUDService.getInstance().getAllMonitor();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechner")
	public Response addRechner(JAXBElement<Rechner> rechner) {
		CRUDService.getInstance().addRechner(rechner.getValue());
		String result = "Rechner saved : " + rechner.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechner")
	public Response editRechner(JAXBElement<Rechner> rechner) {
		CRUDService.getInstance().editRechner(rechner.getValue());
		String result = "Rechner edited : " + rechner.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/rechner/{id}")
	public Response deleteRechner(@PathParam("id") long id) {
		CRUDService.getInstance().deleteRechner(id);
		String result = "Rechner deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/rechner/{id}")
	public Rechner getRechner(@PathParam("id") long id) {
		return CRUDService.getInstance().getRechner(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/rechner/i/{iNummer}")
	public Rechner getRechner(@PathParam("iNummer") String iNummer) {
		List<Rechner> list = CRUDService.getInstance().getAllRechner();
		for(Rechner rechner: list) {
			if(rechner.getInventarnummer().equals(iNummer)) {
				return rechner;
			}
		}
		return null;
	}
	
	@GET
	@Produces("application/json")
	@Path("/rechner")
	public List<Rechner> getAllRechner() {
		return CRUDService.getInstance().getAllRechner();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechnung")
	public Response addRechnung(JAXBElement<Rechnung> rechnung) {
		CRUDService.getInstance().addRechnung(rechnung.getValue());
		String result = "Rechnung saved : " + rechnung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rechnung")
	public Response editRechnung(JAXBElement<Rechnung> rechnung) {
		CRUDService.getInstance().editRechnung(rechnung.getValue());
		String result = "Rechnung edited : " + rechnung.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/rechnung/{id}")
	public Response deleteRechnung(@PathParam("id") long id) {
		CRUDService.getInstance().deleteRechnung(id);
		String result = "Rechnung deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/rechnung/{id}")
	public Rechnung getRechnung(@PathParam("id") long id) {
		return CRUDService.getInstance().getRechnung(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/rechnung")
	public List<Rechnung> getAllRechnung() {
		return CRUDService.getInstance().getAllRechnung();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/software")
	public Response addSoftware(JAXBElement<Software> software) {
		CRUDService.getInstance().addSoftware(software.getValue());
		String result = "Software saved : " + software.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/software")
	public Response editSoftware(JAXBElement<Software> software) {
		CRUDService.getInstance().editSoftware(software.getValue());
		String result = "Software edited : " + software.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/software/{id}")
	public Response deleteSoftware(@PathParam("id") long id) {
		CRUDService.getInstance().deleteSoftware(id);
		String result = "Software deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/software/{id}")
	public Software getSoftware(@PathParam("id") long id) {
		return CRUDService.getInstance().getSoftware(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/software")
	public List<Software> getAllSoftware() {
		return CRUDService.getInstance().getAllSoftware();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/tablet")
	public Response addTablet(JAXBElement<Tablet> tablet) {
		CRUDService.getInstance().addTablet(tablet.getValue());
		String result = "Tablet saved : " + tablet.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/tablet")
	public Response editTablet(JAXBElement<Tablet> tablet) {
		CRUDService.getInstance().editTablet(tablet.getValue());
		String result = "Tablet edited : " + tablet.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/tablet/{id}")
	public Response deleteTablet(@PathParam("id") long id) {
		CRUDService.getInstance().deleteTablet(id);
		String result = "Tablet deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/tablet/{id}")
	public Tablet getTablet(@PathParam("id") long id) {
		return CRUDService.getInstance().getTablet(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/tablet")
	public List<Tablet> getAllTablet() {
		return CRUDService.getInstance().getAllTablet();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/todo")
	public Response addTodo(JAXBElement<Todo> todo) {
		CRUDService.getInstance().addTodo(todo.getValue());
		String result = "Todo saved : " + todo.getValue();
		return Response.status(201).entity(result).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/todo")
	public Response editTodo(JAXBElement<Todo> todo) {
		CRUDService.getInstance().editTodo(todo.getValue());
		String result = "Todo edited : " + todo.getValue().toString();
		return Response.status(201).entity(result).build();
	}
	
	@DELETE
	@Path("/todo/{id}")
	public Response deleteTodo(@PathParam("id") long id) {
		CRUDService.getInstance().deleteTodo(id);
		String result = "Todo deleted : ID=" + id;
		return Response.status(201).entity(result).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/todo/{id}")
	public Todo getTodo(@PathParam("id") long id) {
		return CRUDService.getInstance().getTodo(id);
	}
	
	@GET
	@Produces("application/json")
	@Path("/todo")
	public List<Todo> getAllTodo() {
		return CRUDService.getInstance().getAllTodo();
	}
	
	@GET
	@Produces("application/json")
	@Path("/iNummer")
	public Inventarnummer getLastInventarnummer() {
		return CRUDService.getInstance().getLastInventarnummer();
	}
}
