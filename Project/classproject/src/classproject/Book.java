package classproject;
import helpers.Compare;
public class Book implements Comparable{
	
	private String name;
	private double price;
	private Author writer;
	private double percentageDiscount;
	private Genre genre;
	private String isbn;
	private int yearOfPublish;
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", writer=" + writer + ", percentageDiscount="
				+ percentageDiscount + ", genre=" + genre + ", isbn=" + isbn + ", yearOfPublish=" + yearOfPublish + "]";
	}

	public Book(String name, double price, Author writer, double percentageDiscount, Genre genre, String isbn,
			int yearOfPublish) {
		super();
		this.name = name;
		this.price = price;
		this.writer = writer;
		this.percentageDiscount = percentageDiscount;
		this.genre = genre;
		this.isbn = isbn;
		this.yearOfPublish = yearOfPublish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getWriter() {
		return writer;
	}

	public void setWriter(Author writer) {
		this.writer = writer;
	}

	public double getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public int CompareTo(Book book) {
		Compare c = new Compare();
		int i = 0;
		try {
			i = c.compare(this.isbn, book.isbn);
		}
		catch(Exception e) {
			System.out.println("An error ocucured");
		}
		return i;
	}
}
