package hw06;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: Main method that starts the creation of the Book's and CD's placing them
 * into a inventory array and separate arrays
 */
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("Method 1");
		testMethod1();
		System.out.println("---------------------------------------------");
		System.out.println("Method 2");
		testMethod2();
	}
	public static void testMethod1() {
		//Book Data (good memories of reading)
		Book b1 = new Book("Snicket", "Lemony", 1999, "A Bad Beginning", 7.99, 162, "HarperCollins");
		Book b2 = new Book("Snicket", "Lemony", 2006, "The End", 12.99, 324, "HarperCollins");
		Book b3 = new Book("Rowling", "J.K", 1998, "Harry Potter and the Chamber of Secrets", 8.99, 328, "Bloomsbury Publishing");
		Book b4 = new Book("Riordan", "Rick", 2005, "Percy Jackson & the Olympians: The Lightning Thief", 7.99, 377, "Disney Hyperion");
		Book b5 = new Book("John", "Tolkein", 1954, "The Lord of the Rings", 9.95, 1197, "Allen & Unwin");
		//CD Data (its been so long since i've seen an actual CD)
		CD c1 = new CD("Black Sabbath", "", 1973, "Sabbath Bloody Sabbath", 11.23, 42.35, "Vertigo");
		CD c2 = new CD("Black Sabbath", "", 1971, "Master of Reality", 9.99, 34.29, "Warner Records");
		CD c3 = new CD("Ousborne", "Ozzy", 1980, "Blizzard of Ozz", 7.46, 39.31, "Jet");
		CD c4 = new CD("Gojira", "", 2016, "Magma", 1.99, 43.36, "Roadrunner Records");
		CD c5 = new CD("Three Days Grace", "", 2003, "Three Days Grace", 4.99, 44.02, "Jive");
		//starts up the storing of data for Books and CD's and ads them to the array list inventory
		Inventory inventory = new Inventory();
		inventory.add(b1);
		inventory.add(b2);
		inventory.add(b3);
		inventory.add(b4);
		inventory.add(b5);
		inventory.add(c1);
		inventory.add(c2);
		inventory.add(c3);
		inventory.add(c4);
		inventory.add(c5);
		//Prints Book's and CD's Individually
		System.out.println("All Books");
		inventory.displayAllBooks();
		System.out.println("All CDs");
		inventory.displayAllCDs();
		//Prints all items in a list
		System.out.println("All items");
		inventory.displayAllItems();
		//Prints the number of books and CD's and total cost
		System.out.println("Total Book: " + inventory.numBook());
		System.out.println("Total Book: " + inventory.numCD());
		System.out.println(inventory.totalCost());
	}
		
	public static void testMethod2() {
		//Book Data
		Book b1 = new Book("Snicket", "Lemony", 1999, "A Bad Beginning", 7.99, 162, "HarperCollins");
		Book b2 = new Book("Snicket", "Lemony", 2006, "The End", 12.99, 324, "HarperCollins");
		Book b3 = new Book("Rowling", "J.K", 1998, "Harry Potter and the Chamber of Secrets", 8.99, 328, "Bloomsbury Publishing");
		Book b4 = new Book("Riordan", "Rick", 2005, "Percy Jackson & the Olympians: The Lightning Thief", 7.99, 377, "Disney Hyperion");
		Book b5 = new Book("John", "Tolkein", 1954, "The Lord of the Rings", 9.95, 1197, "Allen & Unwin");
		//CD dara
		CD c1 = new CD("Black Sabbath", "", 1973, "Sabbath Bloody Sabbath", 11.23, 42.35, "Vertigo");
		CD c2 = new CD("Black Sabbath", "", 1971, "Master of Reality", 9.99, 34.29, "Warner Records");
		CD c3 = new CD("Ousborne", "Ozzy", 1980, "Blizzard of Ozz", 7.46, 39.31, "Jet");
		CD c4 = new CD("Gojira", "", 2016, "Magma", 1.99, 43.36, "Roadrunner Records");
		CD c5 = new CD("Three Days Grace", "", 2003, "Three Days Grace", 4.99, 44.02, "Jive");
		//places each category in it's own array list
		ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        ArrayList<CD> cds = new ArrayList<>();
        cds.add(c1);
        cds.add(c2);
        cds.add(c3);
        cds.add(c4);
        cds.add(c5);
        //Collection Shuffle so its just a randomizer?
        Collections.shuffle(books);
        Collections.shuffle(cds);

        System.out.println(books);
        System.out.println(cds);
        // Collection Sort, sorts in ascending order(i believe)
        Collections.sort(books);
        Collections.sort(cds);

        System.out.println(books);
        System.out.println(cds);
	}
}
