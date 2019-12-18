package com.example.melchionda.phone;

import java.util.HashMap;
import java.util.Map;

public class MobilePhone extends WirelessPhone {
	// Il Mobile mi permette di gestire una rubrica personalizzata per cui
	// a fronte del numero chiamante mi permette di decodificare chi mi sta chiamando
	// la rubrica è un dizionario
	// rubrica locale
	// Chiave: numero chiamante; valore: nome/soprannome da legare al numero
	private Map<String, String> phoneBook = new HashMap<>();
	
	// inserisce il numero in rubrica
	public void addNumberToPhoneBook(String number, String nickname) {
		this.phoneBook.put(number, nickname);  //numero aggiunto
	}
	
	//sul display mostro il nickname, se esiste
	@Override
	protected boolean incomingCall(Phone caller) {
		// Mi prendo il numero del caller 
		// verifico se c'è un nick associato nel phoneBook
		// se c'è il nick scrivo "Il telefono di Xxx squilla; sul display il nome è Yyy"
		String callingNumber = caller.getNumber();
		String nick = this.phoneBook.get(callingNumber);
		if (nick != null) {
			System.out.printf("Il telefono di %s squilla; sul display il nome è %s.\n", this.getOwner(), nick);
			return true;
		} else {
			// se non c'è il nick può venirmi utile la riga che inserisce automaticamente Eclipse:
			return super.incomingCall(caller);	
		}
}
}
