package com.yash.main;

import com.yash.phone.OS;
import com.yash.phone.OperatingSystemFactory;

/**
 * @author Yashwanth
 *
 */
public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSystemFactory osf= new OperatingSystemFactory();
		OS osObject= osf.getInstance("");
		osObject.spec();
	}
	
}
