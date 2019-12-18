package com.example.aprea.phone;

// principio di sostituzione di Liskov:
// se posso dire Cordlessphone ogni volta che dico Phone, allora posso scrivere la classe CordlessPhone che extends (eredita da) Phone
// nella pratica significa che tutti i membri di Phone sono anche membri di CrodlessPhone, quindi non devo riscriverli all'interno di CordlessPhone
// quindi "aggratis" ho già get.owner, set.owner, get.number, set.number, call
// inoltre, corollario del principio di sostituzione di Liskov, posso assegnare un oggetto della class CordlessPhone a una variabile di tipo Phone!
// l'oggetto quindi sarà sempre del tipo CordlessPhone, ma la variabile che lo punta può essere anche del tipo Phone
// Phone var = new CordlessPhone();
// posso assegnare una variabile del tipo più generico (Phone) ad un oggetto del tipo più specifico (CordlessPhone)
// var potrà quindi utilizzare solo i metodi che Phone riesce a vedere

// il vantaggio nel nostro caso, ad esempio, in questo esercizio, è che non devo fare modifiche al dizionario (Map<String, Phone>) che restituisce un valore Phone,
// che quindi rimane un metodo valido anche per CordlessPhone
/**
 * 
 * @author Vincenzo Aprea
 * @version 1.1
 *
 */
public class CordlessPhone extends Phone {
	// quando un metodo ereditato non ha body e noi lo scriviamo (quello che succede quando implementiamo un'interface) l'operazione si chaima "implement method";
	// quando un metodo ereditato ha già un body ma noi lo sovrascriviamo (come in questo caso quando si estende una class) l'operazione si chiama "override method";
	// eclipse raggruppa entrambe le opzioni nel menù Source -> Override/Implement Methods...
	// Anche java usa la stessa annotation: @Override
	
	@Override
	protected boolean incomingCall(Phone caller) {
		System.out.printf("Il telefono di %s squilla; sul display il numero è %s.\n", this.getOwner(), caller.getNumber());
				
		// sempre per semplificarmi la vita, rispondo sempre
		return true;
	}
	
	
}
