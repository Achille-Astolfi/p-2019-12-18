package com.example.astolfi.phone;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Achille Astolfi
 * 
 * @version 1.2
 * @since 1.0
 */
public class PhoneDirectory {
	// vedi SLIDE16
	// I campi di solito non si inizializzano, però "di solito" non significa "sempre"
	private Map<String, Phone> directory = new HashMap<>();
	
	// siccome non abbiamo un vero database, dobbiamo simulare la creazione dei nostri dati
	// l'evoluzione dalla versione 1.0 alla versione 1.1 consiste nel cambiare new Phone
	// con new VintagePhone
	public void loadDirectory() {
		// in alternativa, si sarebbe potuto inizializzare il campo directory in questo metodo
//		Phone astolfi = new Phone();
		Phone astolfi = new VintagePhone();
		astolfi.setOwner("Astolfi");
		astolfi.setNumber("1");
		// per inserire il Phone nel dizionario si usa il metodo put
		this.directory.put(astolfi.getOwner(), astolfi);
		//
//		Phone diStefano = new Phone();
		Phone diStefano = new VintagePhone();
		diStefano.setOwner("Di Stefano");
		diStefano.setNumber("4");
		this.directory.put(diStefano.getOwner(), diStefano); // istruzione candidata a diventare un nanoservizio
		//
		// Alessia Grimaldi ha un nuovo cordless
		WirelessPhone grimaldi = new CordlessPhone();
		grimaldi.setOwner("Grimaldi");
		grimaldi.setNumber("8");
		// grimaldi è una variabile di tipo CordlessPhone che punta a un oggetto CordlessPhone
		// ma per il principio di sostituzione di Liskov posso usarlo come argomento per il parametro
		// di tipo Phone del metodo put
		this.directory.put(grimaldi.getOwner(), grimaldi);
		
		MobilePhone crespan = new MobilePhone();
		crespan.setOwner("Crespan");
		crespan.setNumber("2");
		crespan.addNumberToPhoneBook("4", "Fede");
		this.directory.put(crespan.getOwner(), crespan);
	}
	
	public Phone getPhoneByOwner(String owner) {
		// per ottenere un Phone dal dizionario si usa il metodo get
		// HashMap (implementazione di riferimento) se NON trova la chiave nel dizionario
		// restituisce null; in particolare, se la chiave che passo è null restituisce null.
		// Questo comportamento per quanto ne so è comune a praticamente tutte le implementazioni di Map
		return this.directory.get(owner);
	}
}
