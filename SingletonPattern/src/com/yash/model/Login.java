/**
 * 
 */
package com.yash.model;

/**
 * @author Yashwanth
 *
 */
public class Login {

	//public static Login instance = new Login();  //Eager fetching - Everytime object will be getting created without invoking it
	public static Login instance;
	private Login()
	{
		System.out.println("Instance created");
	}
	
	public static Login getInstLogin()
	{
		if(instance == null)
		{
			//Double Checked Locking
			synchronized (Login.class) {
				if(instance == null)
				{
					instance= new Login(); // Lazy fetching	
				}
			}
		}
		else
		{
			System.out.println("Reusing the existing instance");
		}
		return instance;
	}
	
}
