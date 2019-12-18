package com.example.emanuele.phone;

/**
 * 
 * @author Achille
 * @author Emanuele
 * @version 1.1
 * @since 1.0
 *
 */

public abstract class Phone {
	private String number;
	private String name;
	
	public Phone() {}
	public Phone(String name,String number) {
		this.name=name;
		this.number=number;
	}
	
	public void call(Phone other) {
		System.out.println(name+"> chiamo "+other.getName());
		System.out.println(name+"> chiamato numero "+other.getNumber());
	}
	
	/**
	 * 
	 * #since 1.1
	 */
	protected boolean incomingCall(Phone caller) {
		System.out.println(name+"> il telefono di "+name+" squilla");
		return true;
	}
	
	public void setNumber(String n) { number=n;	}
	public String getNumber() { return number; }
	public void setName(String n) { name=n;	}
	public String getName() { return name; }
}
