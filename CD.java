package hw06;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This is a parent class Book that takes the data from item and uses it to create an object CD
 * Implementation to keep note of personally is compareTo, Hard Copy method, and equals method 
 */
public class CD extends Item implements Comparable<CD> {
	private double runningLength;
	private String label; 
	//default constructor for CD with default data that takes the default data from Item parent class
	public CD() {
		super();
		this.runningLength = 1;
		this.label = "Default Records";
	}
	/*Constructor for CD that takes input data from item transfers it here through Super and take input
	 *for the number of pages and publisher
	 */
	public CD(String lastName, String firstName, int year, String title, double price, double runningLength, String label) {
		super(lastName, firstName, year, title, price);
		this.runningLength = runningLength;
		this.label = label;
	}
	/* Copy Constructor for CD objected created to Inventory to be stored
	 */
	public CD(CD cd) {
		super(cd.getlastName(), cd.getfirstName(), cd.getyear(), cd.gettitle(), cd.getprice());
		this.runningLength = cd.runningLength;
		this.label = cd.label;
	}
	// Getters and Setters
	public double getrunningLength() {
		return runningLength;
	}
	
	public String getlabel() {
		return label;
	}
	
	public void setrunningLegth(double runningLength) {
		this.runningLength = runningLength;
	}
	
	public void setlabel(String label) {
		this.label = label;
	}
	//toString method to print out the objects data 
	@Override
	public String toString() {
		return("CD: " + "Title: " + gettitle() + ", " 
				+ "Band: " + getfirstName() + " " + getlastName() + ", "
				+ "Label: " + getlabel() + ", "
				+ "Year: " + getyear() + ", "
				+ "Running Length: " + getrunningLength() + ", "
				+ "Price: " + getprice());
	}
	/*An equals method implemented to check between two CD's created, whether or not
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
		CD other = (CD) obj;
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
		if (runningLength != other.runningLength)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}
	/* CompareTo method to check if Book data last name is different, first name and title of the CD
	 * is different
	 */
	@Override
	public int compareTo(CD o) {
		if(getlastName().compareTo(o.getlastName()) < 0)
			return -1;
		else if(getlastName().compareTo(o.getlastName()) == 0) {
			// if last name is same, compare by first name
			if(getfirstName().compareTo(o.getfirstName()) < 0)
				return -1;
			else if(getfirstName().compareTo(o.getfirstName()) < 0)	{
				// if first name is same, compare by CD title
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
