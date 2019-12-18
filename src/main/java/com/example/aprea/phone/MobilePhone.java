package com.example.aprea.phone;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Vincenzo Aprea
 * @version 1.2
 *
 */
public class MobilePhone extends WirelessPhone {
	// il Mobile mi permette di gestire una rubrica personalizzata, per cui a fronte del numero chiamante mi permette di decodificare chi mi sta chiamando
	// la rubrica sarà un dizionario (ad una chiave corrisponde un valore)
	// Chiave: numero chiamante; Valore: nome/soprannome da legare al numero
	private Map<String, String> phoneBook = new HashMap<>();
	
	public void addNumberToPhoneBook(String number, String nickname) {
		this.phoneBook.put(number, nickname);
	}

	@Override
	protected boolean incomingCall(Phone caller) {
		// prendo il numero del caller, controllo se c'è un nick associato a quel numero nel phoneBook, se c'è scrito "Il telefono di Xxx squilla;
		// sul display il nome è Yyy"; se non c'è uso return super. ;
		String callingNumber = caller.getNumber();
		String nick = this.phoneBook.get(callingNumber);
		if (nick!=null) {
			System.out.printf("Il telefono di %s squilla; sul display il nome è %s\n", this.getOwner(), nick);
			
			// sempre per semplificarmi la vita, rispondo sempre
			return true;
		} else {
		// se non c'è il nick svolge ciò che faceva il metodo della super class.
		return super.incomingCall(caller); // ritorna ciò che la classe superiore faceva
		}
	}
}
