package com.general;

public final class LibraryImmutable { // class is final and so it cannot be extended. and so its called immutable class
	final String books; //  instance variable of the class is final i.e. we cannot change the value of it after creating an object.
	//books = "fiction";
	public LibraryImmutable(String b)
	{
		this.books=b;
	}
	
	public String getbooks()// only getters no setters .. 
	{//There is no setter methods i.e. we have no option to change the value of the instance variable using setters methods.
				return books;
	}
	public static void main(String[] args) {
		LibraryImmutable l = new LibraryImmutable("fiction");
		LibraryImmutable l1= new LibraryImmutable("non-fiction");
		System.out.println(l.getbooks());
		System.out.println(l1.getbooks());
	}

}
