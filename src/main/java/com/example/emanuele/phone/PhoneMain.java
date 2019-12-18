package com.example.emanuele.phone;

public class PhoneMain {

	public static PhoneDirectory createDirectory() {
		PhoneDirectory pd=new PhoneDirectory();
		pd.loadDirectory();
		return pd;
	}
	
	public static void main(String[] args) {
		PhoneDirectory pd=createDirectory();
		Phone pa= pd.getPhoneByName("a");
		Phone pb= pd.getPhoneByName("b");
		Phone pc= pd.getPhoneByName("c");
		pa.call(pb);
		pb.call(pc);
		pc.incomingCall(pc);
	}
}
