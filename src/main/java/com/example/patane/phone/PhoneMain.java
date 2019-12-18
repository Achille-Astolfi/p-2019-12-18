package com.example.patane.phone;

public class PhoneMain {
	private static PhoneDirectory createAndInitDir() {
		
		PhoneDirectory pd= new PhoneDirectory();
		pd.loadDirectory();
		return pd;
	}
	
	public static void main(String[] args) {
		PhoneDirectory dir= PhoneMain.createAndInitDir();
		Phone astolfi = dir.getPhoneByOwner("Astolfi");
		Phone diStefano= dir.getPhoneByOwner("Di Stefano");
		astolfi.call(diStefano);
		Phone grimaldi= dir.getPhoneByOwner("Grimaldi");
		diStefano.call(grimaldi);
		grimaldi.incomingCall(grimaldi);
	}
}