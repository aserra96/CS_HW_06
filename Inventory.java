package hw06;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This is the inventory subclass with an array list as its parent 
 * that stores the Book and CD objects created and displays all of them or individually 
 * by class i.e. all books created and all CD's created
 */
import java.util.ArrayList;
//Inventory extends to ArrayList idk if this is how its supposed to be implemented
public class Inventory extends ArrayList<Item> {
	//no data as per instructed
	public Inventory() {
	}
	/*how does this logically work if there is no data or is that irrelevant
	 *This method looks at all the data created and checks what class they 
	 *came from and if its verified they will be added to the array list 
	 */
	public Inventory(Inventory inv) {
		for (Item i : inv) {
			if (i instanceof Book) {
				this.add(new Book((Book) i));
			} 
			else if (i instanceof CD) {
				this.add(new CD((CD) i));
			}
		}
	}
	/*These 3 displays methods work as to to a count of how many total
	 * objects were created and how many of each object class were created
	 */
	public void displayAllItems(){
		for(Item i: this) {
			System.out.println(i);
		}
	}
	
	public void displayAllCDs() {
		for(Item i: this) {
			if(i instanceof CD)
				System.out.println(i);
		}
	}
	
	public void displayAllBooks() {
		for(Item i: this) {
			if(i instanceof Book)
				System.out.println(i);
		}
	}
	/*these 2 methods counts each object created that are from their respective
	 *class
	 */
	public int numBook() {
		int count = 0;
		for(Item i: this) {
			if(i instanceof Book)
				count++;
		}
		return count;
	}
	
	public int numCD() {
		int count = 0;
		for(Item i: this) {
			if(i instanceof Book)
				count++;
		}
		return count;
	}
	/*takes the cost of each book and CD and totals them
	 */
	public double totalCost() {
		double sum = 0;
		for(Item i: this) {
			sum = sum + i.getprice();
		}
		return sum;
	}
}
