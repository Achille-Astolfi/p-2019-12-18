package com.example.emanuele.phone;

/**
 * 
 * @version 1.1
 *
 */

public class CordlessPhone  extends Phone{
	public CordlessPhone() {}
	public CordlessPhone(String name,String number) { super(name,number); }
	@Override
	protected boolean incomingCall(Phone caller) {
		System.out.println(getName()+"> chiamante "+caller.getName()+" numero "+caller.getNumber());

		return super.incomingCall(caller);
	}
	
	
}
