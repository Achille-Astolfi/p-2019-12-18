package com.example.asantinato.phone;

// estendo la classe CordlessPhone con la classe Phone utilizzando il Principio si Sostituzione di Liskov
// in questo modo CordlessPhone eredità tutti gli oggetti e tutti i metodi della classe Phone

public class WirelessPhone extends Phone {
	
	@Override
	protected boolean incomingCall(Phone caller) {
		System.out.println("Il telefono di " + this.getOwner() + " squilla, sul display il numero è: " + caller.getNumber()); 
		
		return true;
	}
}
