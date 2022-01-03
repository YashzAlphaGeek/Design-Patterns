/**
 * 
 */
package com.yash.builder;

import com.yash.phone.Phone;

/**
 * @author Yashwanth
 *
 */
public class PhoneBuilder {
	
	private String os;
	private String processor;
	private double screenSize;
	private int battery;
	private int camera;
	/**
	 * @param os the os to set
	 */
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	/**
	 * @param processor the processor to set
	 */
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	/**
	 * @param battery the battery to set
	 */
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	/**
	 * @param camera the camera to set
	 */
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(os, processor, screenSize, battery, camera);
	}
	

}
