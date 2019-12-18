package com.example.astolfi.phone;

public class PhoneMain {
	private static PhoneDirectory createAndInitDir() {
		// per poter usare una PhoneDirectory devo creare un oggetto PhoneDirectory
		// e invocare il metodo loadDirectory() prima di poter "mettere in esercizio" l'oggetto creato
		PhoneDirectory pd = new PhoneDirectory();
		pd.loadDirectory();
		// adesso posso usare l'oggetto
		return pd;
	}
	
	public static void main(String[] args) {
		// uso il metodo createAndInitDir() per ottenere il mio elenco telefonico
		PhoneDirectory dir = PhoneMain.createAndInitDir();
		//
		Phone astolfi = dir.getPhoneByOwner("Astolfi");
		// voglio chiamare Di Stefano per sentire come va
		Phone diStefano = dir.getPhoneByOwner("Di Stefano");
		
		astolfi.call(diStefano);
		
		// adesso Di Stefano chiama Grimaldi
		// a priori non so che Grimaldi ha un cordless, per cui la variabile la dichiaro Phone
		// ringraziamo anche stavolta il principio di sostituzione di Liskov
		Phone grimaldi = dir.getPhoneByOwner("Grimaldi");
		diStefano.call(grimaldi);
	}
}
