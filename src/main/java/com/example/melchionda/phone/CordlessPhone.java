package com.example.melchionda.phone;

// PRINCIPIO DI SOSTITUZIONE DI LISKOV
// se posso dire CordlessPhone ogni volta che dico Phone, allora
// posso scrivere la class CordlessPhone che extends (eredita da) Phone
// nella pratica significa che NON ho bisogno di scrivere i metodi dentro CordlessPhone
// perchè li ho già scritti nella class Phone
// inoltre, corollario del principio di sost. di Liskov posso
// assegnare un oggetto (area di memoria) della classe CordlessPhone a una variabile di tipo Phone
// Phone variabile = new CordlessPhone();
// una variabile del tipo più generico può essere assegnata ad una variabile del tipo più specifico
/**
 * 
 * @author Achille Astolfi
 * @version 1.1
 */
public class CordlessPhone extends Phone {
	// quando un metodo ereditato non ha body e lo scriviamo (implementazione dell'interface)
	// abbiamo un "implement method"
	// quando un metodo ereditato ha già un body, ma lo sovrascriviamo (come in questo caso quando
	// si estende una class) l'operazione si chiama "override method"
	// Eclipse raggruppa entrambe le operazioni nel menù source -> Override/Implement Methods..
	// anche Java usa la stessa identica annotation: @Override
	
	@Override
	protected boolean incomingCall(Phone caller) {
		System.out.printf("Il telefono di %s squilla; sul display il numero è %s.\n", this.getOwner(), caller.getNumber());
		// per semplificare la vita rispondo sempre
		return true;
	}


}
