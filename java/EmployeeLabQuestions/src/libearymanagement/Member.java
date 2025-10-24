package libearymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member {
	
	private String memberId;
	private String name;
	private List<Book> borrowedBooks;
	
	public Member(String memberId, String name, List<Book> borrowedBooks) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.borrowedBooks = new ArrayList<Book>();
	}

	public String getMemberId() {
		return memberId;
	}

	public String getName() {
		return name;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
		
	public void borrowBook(Book book) {
		if(book != null && !borrowedBooks.contains(book)) {
			borrowedBooks.add(book);
			book.setBorrowed(true);
		}
	}
	
	public boolean returnBook(Book book) {
		boolean removed = borrowedBooks.remove(book);
		if (removed) {
			book.setBorrowed(false);
		}
		return removed;
	}

	@Override
	public String toString() {
		return String.format("Member ID: %s, Name: %s, Borrowed Books: %d", memberId, name, borrowedBooks.size());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Member member = (Member) o;
		return Objects.equals(memberId, member.memberId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}
}
