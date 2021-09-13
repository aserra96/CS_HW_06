package hw06;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This is an abstract parent class inaccessible in main but data fields are usable to Book and CD
 * subclasses
 */
public abstract class Item {
	private String lastName;
	private String firstName;
	private int year;
	private String title;
	private double price;
	//default constructor with default data
	public Item() {
		this.lastName = "Doe";
		this.firstName = "John";
		this.year = 9999;
		this.title = "Test Title";
		this.price = 1.00;
	}
	//Constructor for items used in Book and CD and contains the basic data needed to use the Book and CD constructors 
	public Item(String lastName, String firstName, int year, String title, double price) {
		this.title = title;
		this.lastName = lastName;
		this.firstName = firstName;
		this.year = year;
		this.title = title;
		this.price = price;
	}
	//Copy constructor creates a deep copy sent to the inventory class if properly implemented
	public Item(Item item) {
		this.firstName = item.firstName;
		this.lastName = item.lastName;
		this.year = item.year;
		this.title = item.title;
		this.price = item.price;
	}
	//getters
	public String getlastName() {
		return lastName;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public int getyear() {
		return year;
	}
	
	public String gettitle() {
		return title; 
	}
	
	public double getprice() {
		return price;
	}
	//setters
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setyear(int year) {
		this.year = year;
	}
	
	public void settitle(String title) {
		this.title = title;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	//equals method for parent class
	//note: i dont know if this is done properly, research more ask in class(RIP) 
	@Override
	public abstract boolean equals(Object obj);
	//toString for item class used to return basic item data, inaccessible either way
	@Override
	public String toString() {
		return("Book: " + "Title: " + gettitle() + ", " 
				+ "Author: " + getfirstName() + " " + getlastName()
				+ "Year: " + getyear() + ", "
				+ "Price: " + getprice());
	}
}


