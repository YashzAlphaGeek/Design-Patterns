/**
 * 
 */
package com.yash.main;

import com.yash.model.Channel;
import com.yash.model.Subscriber;

/**
 * @author Yashwanth
 *
 */
public class Youtube {
	
	public static void main(String[] args) {
		Channel yashChannel = new Channel();
		Subscriber sub1= new Subscriber("Supriya");
		Subscriber sub2= new Subscriber("PD");
		Subscriber sub3= new Subscriber("Vijay");
		Subscriber sub4= new Subscriber("Jeeva");
		
		yashChannel.subscribe(sub1);
		yashChannel.subscribe(sub2);
		yashChannel.subscribe(sub3);
		yashChannel.subscribe(sub4);
		
		yashChannel.unSubscribe(sub4);
		
		sub1.subscribeChannel(yashChannel);
		sub2.subscribeChannel(yashChannel);
		sub3.subscribeChannel(yashChannel);
		sub4.subscribeChannel(yashChannel);
		
		yashChannel.upload("How to learn Design Pattern");
	}

}
