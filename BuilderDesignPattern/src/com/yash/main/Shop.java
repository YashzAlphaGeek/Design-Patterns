/**
 * 
 */
package com.yash.main;

import com.yash.builder.PhoneBuilder;
import com.yash.phone.Phone;

/**
 * Builder Pattern
 * 
 * @author Yashwanth
 *
 */
public class Shop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Phone phone= new Phone("Android","QualComm",5.5,3100,13);
//				System.out.println(phone);
		PhoneBuilder builder= new PhoneBuilder();
		Phone phone =builder.setOs("IOS").setCamera(6).getPhone();
		System.out.println(phone);
		
	}

}
