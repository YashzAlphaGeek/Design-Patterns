/**
 * 
 */
package com.yash.phone;

/**
 * @author Yashwanth
 *
 */
public class OperatingSystemFactory {

	public OS getInstance(String typeOfOS)
	{
		if(typeOfOS.equals("Open"))
		{
			return new Android();
		}
		
		else if(typeOfOS.equals("Closed"))
		{
			return new IOS();
		}
		
		else
			return new Windows();
	}
	
}
