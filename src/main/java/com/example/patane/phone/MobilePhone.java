package com.example.patane.phone;

import java.util.HashMap;
import java.util.Map;

public class MobilePhone  extends WirelessPhone {
	
	public Map<String, String> phoneBook= new HashMap<>();
	public void addNumberToPhoneBook(String number, String nickname) {
		this.phoneBook.put(number, nickname);
	}
	@Override
	protected boolean incomingCall(Phone caller) {
		// TODO Auto-generated method stub
		String callingNumber= caller.getNumber();
		String nick= this.phoneBook.get(callingNumber);
		if (nick != null) {
			System.out.println("il telefono di " + this.getOwner() + " squilla; sul display in nome è " + nick);
			return true;
		}else {
			return super.incomingCall(caller);
		}
	}
}
