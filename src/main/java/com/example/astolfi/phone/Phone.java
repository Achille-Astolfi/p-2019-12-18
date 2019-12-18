package com.example.astolfi.phone;

/**
 * 
 * @author James Gosling
 * @author Achille Astolfi
 *
 * @version 1.1
 * @since 1.0
 */
// la parola chiave abstract va tra public e class
// NOTA: solo le class possono essere abstract
public abstract class Phone {
	private String number;
	private String owner;
	
	// ogni tanto può essere utile aggiungere dei metodi anche ai JavaBean
	/**
	 * Questo Phone chiama il Phone passato come argomento.
	 * 
	 * @param other
	 */
	// per convenzione, i metodi senza @since nel JavaDoc si considerano presenti 
	// dalla versione @since della class
	public void call(Phone other) {
		// Questa era la versione 1.0
//		System.out.printf("%s chiama %s, si intrattengono un po' e la conversazione termina.\n", 
//				this.getOwner(), other.getOwner());
		// Adesso rivedo l'algoritmo.
		System.out.printf("%s chiama %s.\n", this.getOwner(), other.getOwner());
		// ATTENZIONE: this diventa caller e other diventa this nel metodo incomingCall
		other.incomingCall(this);
		System.out.printf("Si intrattengono un po' e la conversazione termina.\n");
		// NOTA: ci sono due scuole di pensiero. La prima (come sopra) che usa sempre i getter/setter
		// l'altra scuola di pensiero usa direttamente i nomi dei campi perché ci troviamo dentro la class Phone
//		System.out.printf("%s chiama %s, si intrattengono un po' e la conversazione termina.\n", 
//				this.owner, other.owner);
	}
	
	// i membri protected sono visibili solamente all'interno del tipo che li definisce e
	// all'interno di tutti i tipi che estendono il tipo che li definisce.
	// Nel nostro caso sono visibili dentro Phone e dentro CordlessPhone
	/**
	 * @since 1.1
	 * @param caller
	 * @return
	 */
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
