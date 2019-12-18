package com.example.patane.phone;
import java.util.HashMap;
import java.util.Map;
public class PhoneDirectory {
	
	private Map<String, Phone> direcroty= new HashMap<>();
	
	public void loadDirectory() {
		Phone astolfi= new VintagePhone();
		astolfi.setOwner("Astolfi");
		astolfi.setNumber("1");
		
		this.direcroty.put(astolfi.getOwner(), astolfi);
		
		Phone diStefano= new VintagePhone();
		diStefano.setOwner("Di Stefano");
		diStefano.setNumber("4");
		this.direcroty.put(diStefano.getOwner(), diStefano);
		
		CordlessPhone grimaldi= new CordlessPhone();
		grimaldi.setOwner("Grimaldi");
		grimaldi.setNumber("8");
		this.direcroty.put(grimaldi.getNumber(), grimaldi);
		
	}

	public Phone getPhoneByOwner(String owner) {
		return this.direcroty.get(owner);
	}
	
}
