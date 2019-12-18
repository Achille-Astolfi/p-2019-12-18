package com.example.astolfi.phone;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Achille Astolfi
 * 
 * @version 1.0
 */
public class PhoneDirectory {
	// vedi SLIDE16
	// I campi di solito non si inizializzano, però "di solito" non significa "sempre"
	private Map<String, Phone> directory = new HashMap<>();
	
	// siccome non abbiamo un vero database, dobbiamo simulare la creazione dei nostri dati
	public void loadDirectory() {
		// in alternativa, si sarebbe potuto inizializzare il campo directory in questo metodo
		Phone astolfi = new Phone();
		astolfi.setOwner("Astolfi");
		astolfi.setNumber("1");
		// per inserire il Phone nel dizionario si usa il metodo put
		this.directory.put(astolfi.getOwner(), astolfi);
		//
		Phone diStefano = new Phone();
		diStefano.setOwner("Di Stefano");
		diStefano.setNumber("4");
		this.directory.put(diStefano.getOwner(), diStefano); // istruzione candidata a diventare un nanoservizio
	}
	
	public Phone getPhoneByOwner(String owner) {
		// per ottenere un Phone dal dizionario si usa il metodo get
		// HashMap (implementazione di riferimento) se NON trova la chiave nel dizionario
		// restituisce null; in particolare, se la chiave che passo è null restituisce null.
		// Questo comportamento per quanto ne so è comune a praticamente tutte le implementazioni di Map
		return this.directory.get(owner);
	}
}
