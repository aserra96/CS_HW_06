package hw06;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This is a parent class Book that takes the data from item and uses it to create an object book
 * Implementation to keep note of personally is compareTo, Hard Copy method, and equals method 
 */
public class Book extends Item implements Comparable <Book>{
	private int numPages;
	private String publisher;
	//default constructor for Book with default data that takes the default data from Item parent class
	public Book() {
		super();
		this.numPages = 1;
		this.publisher = "Default Publishing";
	}
	/*Constructor for Book that takes input data from item transfers it here through Super and take input
	 *for the number of pages and publisher
	 */
	public Book(String lastName, String firstName, int year, String title, double price, int numPages, String publisher) {
		super(lastName, firstName, year, title, price);
		this.numPages = numPages;
		this.publisher = publisher; 
	}
	/* Copy Constructor for Book objected created to Inventory to be stored
	 */
	public Book(Book book) {
		super(book.getfirstName(), book.getlastName(), book.getyear(), book.gettitle(), book.getprice());
		this.numPages = book.numPages;
		this.publisher = book.publisher;
	}
	// Getters and Setters
	public int getnumPages() {
		return numPages;
	}
	
	public String getpublisher() {
		return publisher;
	}
	
	public void setnumPages(int numPages) {
		this.numPages = numPages;
	}
	
	public void setpublisher(String publisher) {
		this.publisher = publisher;
	}
	//toString method to print out the objects data 
	@Override
	public String toString() {
		return("Book: " + "Title: " + gettitle() + ", " 
				+ "Author: " + getfirstName() + " " + getlastName() + ", "
				+ "Publisher: " + getpublisher() + ", "
				+ "Year: " + getyear() + ", "
				+ "Number of pages: " + getnumPages() + ", "
				+ "Price: " + getprice());
	}
	/*An equals method implemented to check between two book created whether or not
	 * both objects hold the same data and returns a boolean if they are or not similar
	*/
	@Override
    public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
			if (getfirstName() == null) {
			if (other.getfirstName() != null)
				return false;
			} 
			else if (!getfirstName().equals(other.getfirstName()))
				return false;
			if (getlastName() == null) {
				if (other.getlastName() != null)
					return false;
			} 
			else if (!getlastName().equals(other.getlastName()))
				return false;
			if (Double.doubleToLongBits(getprice()) != Double.doubleToLongBits(other.getprice()))
				return false;
			if (gettitle() == null) {
				if (other.gettitle() != null)
					return false;
			} 
			else if (!gettitle().equals(other.gettitle()))
				return false;
			if (getyear() != other.getyear())
				return false;
			if (numPages != other.numPages)
				return false;
			if (publisher == null) {
				if (other.publisher != null)
					return false;
			} 
			else if (!publisher.equals(other.publisher))
				return false;
			return true;
    }
	/* CompareTo method to check if Book data last name is different, first name and title of book
	 * is different
	 */
	@Override
	public int compareTo(Book o) {
	if(getlastName().compareTo(o.getlastName()) < 0)
		return -1;
		else if(getlastName().compareTo(o.getlastName()) == 0) {
			// if last name is same, compare by first name
			if(getfirstName().compareTo(o.getfirstName()) < 0)
				return -1;
			else if(getfirstName().compareTo(o.getfirstName()) < 0)	{
				// if first name is same, compare by book title
				if(gettitle().compareTo(o.gettitle()) < 0)
					return -1;
				else if(gettitle().compareTo(o.gettitle()) == 0)
					return 0;
				else
					return 1;
			}
			else
				return 1;
		}
		else
			return 1;
	}

}
