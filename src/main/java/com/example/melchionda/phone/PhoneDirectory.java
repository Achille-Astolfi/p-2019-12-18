package com.example.melchionda.phone;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Achille Astolfi
 *
 * @version 1.0 // la versione è riferita al software
 */

//creare la classe phonedirectory, invocare il metodo loadDirectory; dopo ciò l'elenco è funzionale
// dopo ciò il phoneDirectory è utilizzabile
public class PhoneDirectory {
	// creazione di un dizionario
	// i campi, di solito, non si inizializzano (non significa che accade sempre)
	// HashMap è implementazione di riferimento non solleva eccezione ma restituisce null nel caso
	// in cui il contatto richiesto non è trovato nel dizionario
	private Map<String, Phone> directory = new HashMap<>();   //inizializzazione nel directory
	
	// siccome non abbiamo un vero database, dobbiamo simulare la creazione dei nostri dati
	public void loadDirectory() {
		// in alternativa, si sarebbe potuto inzializzare il campo directory in questo metodo
		Phone astolfi = new Phone();
		astolfi.setOwner("Astolfi");
		astolfi.setNumber("1");
		// per inserire il phone nel dizionario si usa il metodo put
		this.directory.put(astolfi.getOwner(), astolfi);
		// 
		Phone diStefano = new Phone();
		diStefano.setOwner("Di Stefano");
		diStefano.setNumber("4");
		this.directory.put(diStefano.getOwner(), diStefano); //istruzione candidata a diventare un nanoservizio
	}
	
	public Phone getPhoneByOwner(String owner) {
		// per ottenere un phone dal dizionario si usa il metodo get
		// HashMap (impl. di riferimento) se non trova la chiave nel proprio dizionario
		// restitusce NULL
		// se la chiave che passo è null restituisce null
		// questo comportamento è comune a praticamente tutte le implementazioni di Map
		return this.directory.get(owner);
		
	}
}
