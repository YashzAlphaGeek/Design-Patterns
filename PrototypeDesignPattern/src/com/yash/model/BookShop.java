/**
 * 
 */
package com.yash.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yashwanth
 *
 */
public class BookShop implements Cloneable{
	
	private String shopName;
	private List<Book> listOfBooks = new ArrayList<>();
	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @return the listOfBooks
	 */
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}
	/**
	 * @param listOfBooks the listOfBooks to set
	 */
	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Book book= new Book();
			book.setBookId(i);
			book.setBookName("Book "+i);
			getListOfBooks().add(book);
		}
	}
	
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", listOfBooks=" + listOfBooks + "]";
	}
	@Override
	public BookShop clone() throws CloneNotSupportedException {
		BookShop bookshop= new BookShop();
		for(Book book: this.getListOfBooks())
		{
			bookshop.getListOfBooks().add(book);
		}
		return bookshop;
	}
	
	

}
