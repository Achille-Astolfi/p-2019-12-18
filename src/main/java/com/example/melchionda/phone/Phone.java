package com.example.melchionda.phone;
// l'autore è del sorgente (della class), non esiste autore del metodo
/**
 * 
 * @author James Gosling
 * @author Achille Astolfi
 *
 * @version 1.2
 * @since 1.0
 */
// abstract va tra public e class
// NOTA: solo le class possono essere abstract
public abstract class Phone {
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
		// System.out.printf("%s chiama %s, si intrattengono un pò e la conversazione termina.\n", 
		//		this.getOwner(), other.getOwner());
		// Rivedo l'algoritmo
		// 1 chiamata
		System.out.printf("%s chiama %s.\n", this.getOwner(), other.getOwner());
		// ATTENZIONE: this diventa caller e other diventa this nel metodo incomingCall
		other.incomingCall(this);
		System.out.printf("Si intrattengono un pò e termina la conversazione.\n");
		// ci sono due scuole di pensiero. La prima (come sopra) che usa sempre i getter/setter
		// L'altra usa direttamente i nomi dei campi perchè ci troviamo nella class Phone
		
		// System.out.printf("%s chiama %s, si intrattengono un pò e la conversazione termina.\n", 
		// 		this.owner, other.owner);
	}
	
	// i membri protected sono visibili solo all'interno del tipo sorgente che li definisce e
	// all'interno di tutti i tipi che estendono il tipo che li definisce
	// Nel nostro caso sono visibili dentro Phone e dentro CordlessPhone
	/**
	 * @since 1.1 // questo metodo esiste dalla versione 1.1 del software
	 * @param caller
	 * @return
	 */
	// per convenzione, i metodi senza @since nel Javadoc si considerano presenti 
	// dalla versione @since della class
	protected boolean incomingCall(Phone caller) {
		// per semplificarci la vita, chi riceve la chiamata risponde sempre
		System.out.printf("Il telefono di %s squilla.\n", this.getOwner());
		return true;
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
