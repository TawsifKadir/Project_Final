package classproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.*;

public class Invoice {
	private LocalDateTime date;
	private Book[] books;
	private int numberOfBooks;
	
	public Invoice() {
		numberOfBooks = 0;
		books = new Book[10000];
	}
	
	public void addBook(Book book) {
		try {
			books[this.numberOfBooks++] = book;
		}
		catch(Exception e) {
			System.out.println("An error occured: "+e);
		}
	}
	
	public String getDateTime() {
		this.date = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String now = this.date.format(format);
		return now;
	}
	
	public boolean ifAuthorDiscountEligible() {
		//boolean eligible = false;
		int count;
		for(int i=0;i<this.numberOfBooks;i++) {
			count = 1;
			for(int j=i+1;j<this.numberOfBooks;j++) {
				if(this.books[i].getWriter() == this.books[j].getWriter()) {
					count++;
				}
			}
			if(count >= 3)
			{
				return true;
			}
		}
		return false;
	}
	
	public double calculatePrice() {
		double totalPrice = 0;
		for(int i=0;i<this.numberOfBooks;i++) {
			totalPrice+= this.books[i].getPrice();
		}
		return totalPrice;
	}
	
	public double calculateBookDiscountPrice() {
		double discount = 0;
		double totalPrice = calculatePrice();
		for(int i=0;i<this.numberOfBooks;i++) {
			discount+= this.books[i].getPercentageDiscount();
			//totalPrice += this.books[i].getPrice();
		}
		return totalPrice * (1-(discount/100));
	}
	
	public double calculateAuthorDiscountPrice() {
		double totalPrice = calculatePrice();
		if(ifAuthorDiscountEligible()) {
			totalPrice *= (1-0.45);
		}
		return totalPrice;
	}
	
	public double calculateGenreDiscount() {
		double totalPrice = calculatePrice();
		double discount = 0;
		for(int i=0;i<this.numberOfBooks;i++) {
			if(books[i].getGenre().equals("Fiction")) {
				discount+=9;
			}
			else {
				discount+=10;
			}
		}
		return totalPrice * (1-(discount/100));
	}
	
	public float getFinalPrice() {
		float p1 = (float)calculateGenreDiscount();
		float p2 = (float)calculateAuthorDiscountPrice();
		float p3 = (float)calculateBookDiscountPrice();
		if(Float.compare(p1, p2) < 0 && Float.compare(p1, p3)<0) {
			return p1;
		}
		else if(Float.compare(p2, p1)<0 && Float.compare(p2, p3)<0) {
			return p2;
		}
		else {
			return p3;
		}
	}
	
	@Override
	public String toString() {
		String s = String.format("purchase date: %s\n",getDateTime());
		for(int i=0;i<this.numberOfBooks;i++) {
			s = String.format(s+"%d. %s : %.1f\n",i+1,this.books[i].getName(),this.books[i].getPrice());
		}
		s = String.format(s+"price: %.1f\n"
				+ "price after discount: %.1f",calculatePrice(),getFinalPrice());
		
		return s;
	}
	
	public void showBooks() {
		for(int i=0;i<this.numberOfBooks;i++) {
			System.out.println(books[i].toString());
		}
	}
}
