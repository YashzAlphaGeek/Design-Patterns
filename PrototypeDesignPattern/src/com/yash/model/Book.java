/**
 * 
 */
package com.yash.model;

/**
 * @author Yashwanth
 *
 */
public class Book {
	
	private int bookId;
	private String bookName;
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	

}
