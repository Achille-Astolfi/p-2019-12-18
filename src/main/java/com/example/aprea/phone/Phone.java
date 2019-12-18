package com.example.aprea.phone;

// se c'è già un autore e io faccio modifiche mi aggiungo sotto. (l'autore c'è solo del sorgente, quindi della classe o altro,
// quindi anche se modifico un metodo mi devo inserire come autore della class)
// posso scrivere anche una @version, che si riferisce alla versione del software!
// posso scrivere @since per dire che esiste dalla versione 1.0. Per convenzione tutti i metodi senza @since nel JavaDoc si considerano presenti dalla versione @since della class
/**
 * 
 * @author James Gosling
 * @author Vincenzo Aprea
 * 
 * @version 1.1
 * @since 1.0
 */
// la parola chiave abstract va tra public e class (solo le class possono essere abstract, le enumeration hanno sempre gli oggetti,
// annotation ed interface non possono già creare oggetti)
public abstract class Phone {
	private String number;
	private String owner;
	
	// ogni tanto può essere utile aggiungere dei metodi anche ai JavaBean
	// con "Questo Phone" ci si riferisce all'oggetto su cui viene invocato il metodo
	/**
	 * Questo Phone chiama il Phone passato come argomento.
	 * @param other
	 */
	public void call(Phone other) {
		// versione 1.0
//		System.out.printf("%s chiama %s, si intrattengono un po' e la conversazione termina.\n", this.getOwner(), other.getOwner());
		// nota bene: ci sono due scuole di pensiero. La prima (come sopra) che usa sempre i getter/setter
		// l'altra scuola di pensiero usa direttamente i nomi dei campi, perchè ci troviamo dentro a class Phone
//		System.out.printf("%s chiama %s, si intrattengono un po' e la conversazione termina.\n", this.owner, other.owner);
		
		// rivedo l'algoritmo
		System.out.printf("%s chiama %s\n", this.getOwner(), other.getOwner());
		// ATTENZIONE: this diventa caller e other diventa this nel metodo incomingCall
		other.incomingCall(this);
		System.out.printf("Si intrattengono un po' e la conversazione termina.\n");
	}
	
	// i membri protected sono visibili solamente all'interno del tipo che li definisce e all'interno di tutti i tipi che estendono il tipo che li definisce.
	// nel nostro caso sono visibili dentro Phone e CordlessPhone
	// usato soprattutto sui membri non static
	// posso aggiungere un JavaDoc per indicare da che versione è stato aggiunto tale metodo con @since
	/**
	 * @since 1.1
	 * @param caller
	 * @return
	 */
	protected boolean incomingCall(Phone caller) {
		// caller per ora non lo uso,
		// ma con un cordless potrei usarlo per poter stampare il numero di telefono (o il nome in rubrica) sul display del cordless)
		// per semplificarci la vita chi riceve la chiamata risponde sempre
		System.out.printf("Il telefono di %s squilla.\n", this.getOwner());
		return true;
	}

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
