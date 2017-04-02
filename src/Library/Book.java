package Library;

import java.io.Serializable;
import java.util.*;

public class Book implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bookName;
	private String author;
	private String isbn;
	private Date lastRented; //update when rent
	private Date AddedDate;
	private boolean isRented; //update when rent
	private int ownerId; //update when rent
	private Category category;
	
	Book(){
		
		isRented = false;
		ownerId = Library.LIBRARY_OWNER_ID;
		
	}
	
	//getters & setters
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getLastRented() {
		return lastRented;
	}
	public void setLastRented(Date lastRented) {
		this.lastRented = lastRented;
	}
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public Date getAddedDate() {
		return AddedDate;
	}
	public void setAddedDate(Date addedDate) {
		AddedDate = addedDate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public Object[] createBookTableRowData() {
		Object[] row = new Object[8];
		row[0] = getBookName();
		row[1] = getAuthor();
		row[2] = getIsbn();
		row[3] = getLastRented();
		row[4] = getAddedDate();
		row[5] = isRented();
		row[6] = getOwnerId();
		row[7] = getCategory();
		return row;
	}
	
	
	
	
}
