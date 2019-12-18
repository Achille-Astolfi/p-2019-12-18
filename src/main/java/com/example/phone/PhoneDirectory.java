package com.example.phone;

import java.util.Map;
import java.util.HashMap;

public class PhoneDirectory {
	// Dichiarazione di un Dizionario con Map ed HasMap
	private Map <String, Phone> directory = new HashMap<>();
	
	public void loadDirectory() {
		// in alternativa si poteva utilizzare il campo direcotry in questo modo
	
		Phone astolfi = new Phone();
		astolfi.setOwner("Astolfi");
		astolfi.setNumber("1");
		// per inserire il Phone nel dizionario si usa il metodo put
		this.directory.put(astolfi.getOwner(), astolfi);
		
		Phone diStefano = new Phone();
		diStefano.setOwner("Di Stefano");
		diStefano.setNumber("4");
		this.directory.put(diStefano.getOwner(), diStefano);

	}
	
	public Phone getPhoneByOwner(String owner) {
		// per ottenere un phone dal dizionario si utilizza il metodo get

		return this.directory.get(owner);
	}
}
