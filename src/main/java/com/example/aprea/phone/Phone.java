package com.example.aprea.phone;

// se c'è già un autore e io faccio modifiche mi aggiungo sotto. (l'autore c'è solo del sorgente, quindi della classe o altro,
// quindi anche se modifico un metodo mi devo inserire come autore della class)
// posso scrivere anche una @version, che si riferisce alla versione del software!
/**
 * 
 * @author James Gosling
 * @author Vincenzo Aprea
 * 
 * @version 1.0
 */
public class Phone {
	private String number;
	private String owner;
	
	// ogni tanto può essere utile aggiungere dei metodi anche ai JavaBean
	// con "Questo Phone" ci si riferisce all'oggetto su cui viene invocato il metodo
	/**
	 * Questo Phone chiama il Phone passato come argomento.
	 * @param other
	 */
	public void call(Phone other) {
		System.out.printf("%s chiama %s, si intrattengono un po' e la conversazione termina.\n", this.getOwner(), other.getOwner());
		// nota bene: ci sono due scuole di pensiero. La prima (come sopra) che usa sempre i getter/setter
		// l'altra scuola di pensiero usa direttamente i nomi dei campi, perchè ci troviamo dentro a class Phone
//		System.out.printf("%s chiama %s, si intrattengono un po' e la conversazione termina.\n", this.owner, other.owner);
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
