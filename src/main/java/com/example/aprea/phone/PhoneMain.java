package com.example.aprea.phone;

public class PhoneMain {
	private static PhoneDirectory createAndInitDir() {
		// per poter usare una PhoneDirectory devo creare un oggetto PhoneDirectory
		//ed invocare il metodo loadDirectory() prima di poter mettere in esercizio l'oggetto creato
		PhoneDirectory pd = new PhoneDirectory();
		pd.loadDirectory();
		// lo standard è appunto creare un oggetto ed inizializzarlo con un metodo dell'oggetto
		
		// adesso posso usare l'oggetto identificato dalla variabile pd
		return pd;
	}
	
	public static void main(String[] args) {
		// uso il metodo createAndIntDir() per ottenere il mio elenco telefonico
		PhoneDirectory dir = createAndInitDir();
		Phone astolfi = dir.getPhoneByOwner("Astolfi");
		// voglio chiamare Di Stefano per sintire come va
		Phone diStefano = dir.getPhoneByOwner("Di Stefano");
		astolfi.call(diStefano);
	}
}
