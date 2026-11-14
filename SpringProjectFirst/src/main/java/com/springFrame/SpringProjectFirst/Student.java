package com.springFrame.SpringProjectFirst;

public class Student {
	
	
	public Student()
	{
		System.out.println("Object created for Student Class");
	}
	
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}

	private Books books;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void study() {
		System.out.println("Studying");
		books.read();
	}
}
