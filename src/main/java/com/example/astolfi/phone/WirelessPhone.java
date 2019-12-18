package com.example.astolfi.phone;

// PRINCIPIO DI SOSTITUZIONE DI LISKOV
// Se posso dire CordlessPhone ogni volta che dico Phone, allora
// posso scrivere la class CordlessPhone che extends (eredita da) Phone
// Nella pratica significa che NON ho bisogno di scrivere i metodi dentro CordlessPhone
// perché li ho già scritti nella class Phone.
// Inoltre, sempre "a gratis", corollario del PRINICIPIO DI SOSTITUZIONE DI LISKOV
// POSSO assegnare un oggetto della class CordlessPhone a una variabile di tipo Phone.
// Phone variabile = new CordlessPhone();
/**
 * Rinominata da CordlessPhone a WirelessPhone
 * 
 * @author Achille Astolfi
 * @version 1.2
 * @since 1.1
 */
public abstract class WirelessPhone extends Phone {
	// quando un metodo ereditato non ha body e noi lo scriviamo (quello che succede quando implementiamo
	// un'interface) l'operazione si chiama "implement method";
	// quando un metodo ereditato ha già un body ma noi lo sovrascriviamo (come in questo caso quando
	// si estende una class) l'operazione si chiama "override method";
	// Eclipse raggruppa entrambe le operazioni nel menù Source -> Override/Implement Methods...
	// Anche Java usa la stessa annotation: @Override

	@Override
	protected boolean incomingCall(Phone caller) {
		System.out.printf("Il telefono di %s squilla; sul display il numero è %s.\n", this.getOwner(), 
				caller.getNumber());
		// sempre per semplificarmi la vita, rispondo sempre
		return true;
	}
	
}
