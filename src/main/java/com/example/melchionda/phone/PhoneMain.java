package com.example.melchionda.phone;

public class PhoneMain {
	private static PhoneDirectory createAndInitDir() {
		// per poter usare una phone directory devo creare un oggetto PhoneDirectory
		// e invocare un metodo loadDirectory() prima di mettere in esercizio l'oggetto creato
		PhoneDirectory pd = new PhoneDirectory();
		pd.loadDirectory();
		// adesso posso usare l'oggetto pd
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
	}
}

