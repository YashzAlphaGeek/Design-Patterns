/**
 * 
 */
package com.yash.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yashwanth
 *
 */
public class Composite implements Component
{
	String name;
	List<Component> listOfComponent= new ArrayList<>();
	
	/**
	 * @param name
	 * @param listOfComponent
	 */
	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(Component comp)
	{
		listOfComponent.add(comp);
	}
	
	@Override
	public void showPrice() {
		System.out.println("Name:"+name);
		for(Component comp: listOfComponent)
		{
			comp.showPrice();
		}
	}
}
