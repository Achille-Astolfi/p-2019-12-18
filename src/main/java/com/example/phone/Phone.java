package com.example.phone;

public abstract class Phone {
	private String number;
	private String Owner;
	
	/**
	 * Questo Phone  chiama il phone passato come argomento 
	 * @param other
	 */
	
	public void call(Phone other) {
		// Versione 1.0
		//System.out.printf(this.getOwner() + " chiama " + other.getOwner() + ", si intrattengono un po' e la conversazione finisce");
		
		// Versione 2.0
		System.out.println(this.getOwner() + " chiama " + other.getOwner() + ", si intrattengono un po' e la conversazione finisce");
		other.incomingCall(this);
		System.out.println("Si intrattengono un po e la conversazione finisce.");
		
		// ci sono due scuole di pensiero: La prima (come sopra) usa sempre i getter/setter. La seconda invece usa direttamente i nomi dei campi perché ci troviamo denro la class Phone
	}
	
	protected boolean incomingCall(Phone caller) {
		System.out.println("Il telefono di " + this.getOwner() + " squilla!");
		return true;
	}
	
	// tutti i getter/seter vanno sempre lasciati in fondo, dopo tuti i metodi creati
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}

	protected boolean incomingCall() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
