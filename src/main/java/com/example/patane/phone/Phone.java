package com.example.patane.phone;

public abstract class Phone {
	private String number;
	private String owner;
	/**
	 * 
	 * @param other
	 */
	public void call(Phone other) {
		System.out.println(this.getOwner() + " chiama " + other.getOwner());
		other.incomingCall(this);
	}
	
	protected boolean incomingCall(Phone caller) {
		System.out.println(" il telefono di " + this.owner + " squilla" );
		return true;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
