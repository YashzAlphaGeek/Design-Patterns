/**
 * 
 */
package com.yash.computer;

/**
 * @author Yashwanth
 *
 */
public class Leaf implements Component{

	int price;
	String name;
	
	/**
	 * @param price
	 * @param name
	 */
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println("Name:"+name+";"+"Price:"+price);
	}
	
}
