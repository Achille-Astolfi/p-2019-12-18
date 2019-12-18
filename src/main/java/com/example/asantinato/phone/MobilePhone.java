package com.example.asantinato.phone;

import java.util.HashMap;
import java.util.Map;

public class MobilePhone extends WirelessPhone {
	private Map<String, String> phoneBook = new HashMap();
	
	private void addNumber(String number, String nickname) {
		this.phoneBook.put(number,  nickname);
	}
	
	@Override
	protected boolean incomingCall(Phone caller) {
		String callingNumber = caller.getNumber();
		String nick = this.phoneBook.get(callingNumber);
		if (nick != null) {
			System.out.println("Il telefono di " + this.getOwner() + " squilla, sul display il nome è: " + nick);
			return true;
		} else {
			return super.incomingCall(caller);
		}
	}
}
