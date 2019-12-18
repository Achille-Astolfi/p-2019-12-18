package com.example.phone;

public class Phone {
	private String number;
	private String Owner;
	
	/**
	 * Questo Phone  chiama il phone passato come argomento 
	 * @param other
	 */
	
	public void call(Phone other) {
		System.out.printf(this.getOwner() + " chiama " + other.getOwner() + ", si intrattengono un po' e la conversazione finisce");
		
		// ci sono due scuole di pensiero: La prima (come sopra) usa sempre i getter/setter. La seconda invece usa direttamente i nomi dei campi perché ci troviamo denro la class Phone
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
	
	
}
