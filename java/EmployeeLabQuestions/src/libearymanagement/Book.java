package libearymanagement;

import java.util.Objects;

public class Book {
	
	private String isbn;
	private String title;
	private String auther;
	private Genre genre;
	private boolean isBorrowed = false;
	
	
	public Book(String isbn, String title, String auther, Genre genre, boolean isBorrowed) {
		
		this.isbn = isbn;
		this.title = title;
		this.auther = auther;
		this.genre = genre;
		this.isBorrowed = isBorrowed;
	}


	public String getIsbn() {
		return isbn;
	}


	public String getTitle() {
		return title;
	}


	public String getAuther() {
		return auther;
	}


	public Genre getGenre() {
		return genre;
	}


	public boolean isBorrowed() {
		return isBorrowed;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setAuther(String auther) {
		this.auther = auther;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}


	@Override
	public String toString() {
		 return String.format("Book{ISBN='%s', title='%s', author='%s'}",isbn, title, auther);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		return Objects.equals(isbn, book.isbn);
	}
		
}