package com.example.aprea.phone;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Vincenzo Aprea
 * 
 * @version 1.1
 * @since 1.0
 */
public class PhoneDirectory {
	// Map<K, V> è l'interfaceche a fronte di una chiave K, ritorna un valore V
	// l'implementazione di riferimento è HashMap
	// Map e HashMap li trovo in java.util
	
	// creo un campo
	private Map<String, Phone> directory = new HashMap<>(); // di solito non si inizializzano, però di solito non significa sempre
	
	// siccome non abbiamo un vero database dobbiamo simulare la creazione dei nostri dati
	// l'evoluzione dalla versione 1.0 alla versione 1.1 consiste nel cambiare new Phone con new VintagePhone
	public void loadDirectory() {
		// in alternativa si sarebbe potuto inizializzare il campo directory in questo metodo
//		Phone astolfi = new Phone();
		Phone astolfi = new VintagePhone();
		astolfi.setOwner("Astolfi");
		astolfi.setNumber("1");
		// per inserire il Phoone nel dizionario si usa il metodo put
		this.directory.put(astolfi.getOwner(), astolfi);
		//
//		Phone diStefano = new Phone();
		Phone diStefano = new VintagePhone();
		diStefano.setOwner("Di Stefano");
		diStefano.setNumber("4");
		this.directory.put(diStefano.getOwner(), diStefano); // istruzione candidata a diventare un nano servizio
		//
		// Alessia Grimaldi ha un nuovo cordless
		CordlessPhone grimaldi = new CordlessPhone();
		grimaldi.setOwner("Grimaldi");
		grimaldi.setNumber("8");
		// grimaldi è una variabile di tipo CordlessPhone che punta ad un oggetto CordlessPhone
		// ma per il principio di sostituzione di Liskov posso usarlo come argomento per il parametro di tipo Phone del metodo put
		this.directory.put(grimaldi.getOwner(), grimaldi);
	}
	
	
	public Phone getPhoneByOwner(String owner) { // metodo dell'oggetto
		// per ottenere un Phone dal dizionario si usa il metodo get
		// HashMap (implementazione di riferimento) non restituisce eccezioni ma ritorna null se non trova la chiave nel dizionario.
		// in particolare, se la chiave che passo è null restituisce null.
		// questo comportamento è comune a circa tutte le implementazione di Map
		return this.directory.get(owner);
	}
}
