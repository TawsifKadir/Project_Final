package classproject;
import java.lang.*;

public class BookCollection {
	public Book books[];
	private int numberOfBooks;
	private int MAX_SIZE = 10000;
	
	public BookCollection() {
		this.books = new Book[this.MAX_SIZE];
		this.numberOfBooks = 0;
	}
	
	public int getnumberOfBooks() {
		return this.numberOfBooks;
	}
	public boolean addBook(Book book) {
		boolean success = false;
		
		try {
			this.books[this.numberOfBooks++] = book;
			success = true;
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
		return success;
	}
	public boolean removeBook(int index) {
		boolean success = false;
		
		try {
			if(index > this.numberOfBooks) {
				return false;
			}
			this.books[index-1] = null;
			if(index-1 != this.numberOfBooks) {
				for(int i=index-1;i<this.numberOfBooks-1;i++) {
					Book temp = this.books[i];
					this.books[i] = this.books[i+1];
					this.books[i+1] = temp;
				}
			}	
			success = true;
		}
		catch(Exception e){
			System.out.println("Error: "+e);
			return success;
		}
		this.numberOfBooks--;
		return success;
	}
	
	public Book getBook(Book book) {
		Book b = null;
		int index = 0;
		boolean found = false;
		for(int i=0;i<this.numberOfBooks;i++) {
			if(this.books[i].CompareTo(book) == 0) {
				found = true;
				index = i+1;
				b = book;
				break;
			}
		}
		if(!found) {
			System.out.println("Book not found");
			return null;
		}
		removeBook(index);
		return b;
	}
	
	public String printBookInfo(Book book) {
		Book b = null;
		//int index = 0;
		boolean found = false;
		for(int i=0;i<this.numberOfBooks;i++) {
			if(this.books[i].CompareTo(book) == 0) {
				found = true;
				//index = i+1;
				b = book;
				break;
			}
		}
		if(!found) {
			System.out.println("Book not found");
			return null;
		}
		return b.toString();
	}
	
	public void sortByIsbnBooks() {
		int min_index = 0;
		boolean found = false;
		Book min = null;
		for(int i=0;i<this.numberOfBooks-1;i++) {
			min = books[i];
			found = false;
			for(int j=i;j<this.numberOfBooks;j++) {
				if(books[j].CompareTo(min) < 0) {
					found = true;
					min = books[j];
					min_index = j;
				}
			}
			if(found) {
				Book temp;
				temp = books[i];
				books[i] = books[min_index];
				books[min_index] = temp;
			}
		}
	}
	
	public void sortByYears() {
		int min_index = 0;
		boolean found = false;
		int min = 0;
		for(int i=0;i<this.numberOfBooks-1;i++) {
			min = books[i].getYearOfPublish();
			found = false;
			for(int j=i;j<this.numberOfBooks;j++) {
				if(books[j].getYearOfPublish() < min) {
					found = true;
					min = books[j].getYearOfPublish();
					min_index = j;
				}
			}
			if(found) {
				Book temp;
				temp = books[i];
				books[i] = books[min_index];
				books[min_index] = temp;
			}
		}
	}
	
	public void sortByPrice() {
		int min_index = 0;
		boolean found = false;
		double min = 0;
		for(int i=0;i<this.numberOfBooks-1;i++) {
			min = books[i].getPrice();
			found = false;
			for(int j=i;j<this.numberOfBooks;j++) {
				if(Float.compare((float)books[j].getPrice(), (float)min) < 0) {
					found = true;
					min = books[j].getPrice();
					min_index = j;
				}
			}
			if(found) {
				Book temp;
				temp = books[i];
				books[i] = books[min_index];
				books[min_index] = temp;
			}
		}
	}
	
	public void resetBooks() {
		this.numberOfBooks = 0;
	}
	public void showBook() {
		for(int i=0;i<this.numberOfBooks;i++) {
			System.out.println(books[i].getName());
		}
	}
}
