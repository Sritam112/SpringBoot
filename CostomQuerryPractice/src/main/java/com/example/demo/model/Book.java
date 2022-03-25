package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_tab")
public class Book {
	@Id
	@Column(name="bid")
	private Integer bookId;
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", bookType=" + bookType
				+ ", bookCost=" + bookCost + "]";
	}

	@Column(name="bname")
	private String bookName;
	
	@Column(name="bauthor")
	private String author;
	
	@Column(name="btype")
	private String bookType;
	
	@Column(name="bcost")
	private Double bookCost;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String bookName, String author, String bookType, Double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookType = bookType;
		this.bookCost = bookCost;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

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

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
}
