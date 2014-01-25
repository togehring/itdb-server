package de.tgehring.itdb.server.service;

import java.util.List;

import de.tgehring.itdb.server.entities.Benutzer;
import de.tgehring.itdb.server.service.exception.LoginServiceException;

public class LoginService {
	
	private static LoginService instance = null;
	private Benutzer benutzer = null;
	
	private LoginService() {
		
	}
	
	public static LoginService getInstance() {
		if(instance == null) {
			instance = new LoginService();
		}
		return instance;
	}
	
	public void login(String benutzername, String passwort) throws LoginServiceException {
		if(benutzer == null) {
			List<Benutzer> benutzerList = CRUDService.getInstance().getAllBenutzer();
			for(Benutzer b: benutzerList) {
				if(b.getBenutzername().equals(benutzername)) {
					if(b.getPasswort().equals(passwort)) {
						if(benutzer == null) {
							benutzer = b;
						} else {
							throw new LoginServiceException("Mehrere Benutzer zu den Daten gefunden.");
						}
					}
				}
			}
		} else {
			throw new LoginServiceException("Ein Benutzer ist bereits eingeloggt.");
		}
	}
	
	public void logoff() throws LoginServiceException {
		if(benutzer != null) {
			setBenutzer(null);
		} else {
			throw new LoginServiceException("Ein Benutzer ist bereits eingeloggt.");
		}
	}

	public Benutzer getBenutzer() {
		return benutzer;
	}

	public void setBenutzer(Benutzer benutzer) {
		this.benutzer = benutzer;
	}
}
