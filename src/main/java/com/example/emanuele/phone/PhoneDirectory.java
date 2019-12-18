package com.example.emanuele.phone;

/**
 * @author Emanuele
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
	
	private Map<String, Phone> directory=new HashMap<>();
	
	public void loadDirectory() {
		directory.put("a", new VintagePhone("a","1"));
		
		directory.put("b", new VintagePhone("b","2"));
		
		directory.put("c", new CordlessPhone("c","3"));
	}
	
	public Phone getPhoneByName(String n) {
		return directory.get(n);
	}
}
