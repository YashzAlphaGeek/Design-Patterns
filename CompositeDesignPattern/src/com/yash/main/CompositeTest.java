/**
 * 
 */
package com.yash.main;

import com.yash.computer.Component;
import com.yash.computer.Composite;
import com.yash.computer.Leaf;

/**
 * @author Yashwanth
 *
 */
public class CompositeTest {

	public static void main(String[] args) {
		Component hd = new Leaf(5000,"HDD");
		Component mouse = new Leaf(4000,"Mouse");
		Component monitor = new Leaf(8000,"Monitor");
		Component ram = new Leaf(5000,"RAM");
		Component cpu = new Leaf(15000,"CPU");
		
		Composite peripheral = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(peripheral);
		computer.addComponent(cabinet);
		
		computer.showPrice();

	}
	
}
