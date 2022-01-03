/**
 * 
 */
package com.yash.main;

import com.yash.model.BookShop;

/**
 * @author Yashwanth
 *
 */
public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop firstbookShop= new BookShop();
		firstbookShop.setShopName("Cheran");
		firstbookShop.loadData();
		
		
		BookShop secondBookShop = (BookShop) firstbookShop.clone();
		secondBookShop.setShopName("Historic");
		firstbookShop.getListOfBooks().remove(2);

		System.out.println(firstbookShop);
		System.out.println(secondBookShop);
	}

}
