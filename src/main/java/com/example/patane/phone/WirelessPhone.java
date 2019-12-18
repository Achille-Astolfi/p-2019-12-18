package com.example.patane.phone;

public abstract class WirelessPhone extends Phone  {

	@Override
	protected boolean incomingCall(Phone caller) {
		// TODO Auto-generated method stub
		System.out.println("il telefono di " + this.getOwner() + " squilla. sul display il numero è " + caller.getNumber());
		return super.incomingCall(caller);
	}
	
}