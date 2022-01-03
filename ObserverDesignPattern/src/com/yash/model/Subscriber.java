/**
 * 
 */
package com.yash.model;

/**
 * @author Yashwanth
 *
 */
public class Subscriber implements Observer {
	
	private String name;
	private Channel channel = new Channel();
	
	
	/**
	 * @param name
	 */
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update()
	{
		System.out.println("Hey "+ name+"," + " Video Uploaded: "+channel.title);
	}
	
	@Override
	public void subscribeChannel(Channel ch)
	{
		channel = ch;
	}
	
}
