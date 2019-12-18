package com.example.melchionda.phone;
// l'autore è del sorgente (della class), non esiste autore del metodo
/**
 * 
 * @author James Gosling
 * @author Achille Astolfi
 *
 * @version 1.0
 */
public class Phone {
	private String number;
	private String owner;
	
	// ogni tanto può essere utile aggiungere dei metodi anche ai JavaBean
	// creo un Java Doc
	/**
	 *  Questo Phone chiama il Phone passato come argomento
	 *  
	 * @param other
	 */
	public void call(Phone other) {
		System.out.printf("%s chiama %s, si intrattengono un pò e la conversazione termina.\n", 
				this.getOwner(), other.getOwner());
		// ci sono due scuole di pensiero. La prima (come sopra) che usa sempre i getter/setter
		// L'altra usa direttamente i nomi dei campi perchè ci troviamo nella class Phone
		
		// System.out.printf("%s chiama %s, si intrattengono un pò e la conversazione termina.\n", 
		// 		this.owner, other.owner);
	}
	// i getter e i setter li lascio in fondo
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
