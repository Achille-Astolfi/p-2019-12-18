package com.example.asantinato.phone;

public class PhoneMain {
	private static PhoneDirectory createAndInizialize() {
		PhoneDirectory phoneDir = new PhoneDirectory();
		phoneDir.loadDirectory();
		
		return phoneDir;
	}
	
	public static void main(String[] args) {
		// uso il metodo createAndInizialize() per ottenere il mio elenco telefonico
		
		PhoneDirectory phoneDir = createAndInizialize();
		Phone astolfi = phoneDir.getPhoneByOwner("Astolfi");
		// Voglio chiamare Di Stefano per sapere come va
		Phone diStefano = phoneDir.getPhoneByOwner("Di Stefano");
		
		astolfi.call(diStefano);
		
		Phone grimaldi = phoneDir.getPhoneByOwner("Grimaldi");
		// Di Stefano vuole chiamare Grimaldi per sapere come va
				
		diStefano.call(grimaldi);
	}
}
