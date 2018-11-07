package com.caps.demo.spring.mix2;

public class Book {
	private String name;
	private int pages;
	private Author author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + ", author=" + author + "]";
	}
	
	
}
