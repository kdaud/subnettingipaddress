package com.network.mask;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Inet {
	
	public static void mySubnet() throws UnknownHostException {
		Inet4Address obj = (Inet4Address) Inet4Address.getLocalHost();
		String myipaddres = obj.getCanonicalHostName();
		String myHostAddress = obj.getHostAddress();
		String myHostName = obj.getHostName();
		
		System.out.println("Ip Address: " + obj.getHostAddress().trim());
		System.out.println(myipaddres.toString() + " " + myHostAddress + " " + myHostName);
		
	}
	
	public static void main(String[] args) {
		try {
			mySubnet();
		}
		catch (UnknownHostException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}
	
}
