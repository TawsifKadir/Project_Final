package classproject;
import helpers.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a4 = new Author("Rick Riordan","riordan@example.com",55,"male");
		Author a2 = new Author("JK Rowling","rowling@example.com",54,"female");
		
		Book b0 = new Book("The Burning Maze",250,a4,10.6,new Fiction("fantasy"),"9123567891201",2018);
		Book b2 = new Book("The Philosopher's Dome",550,a2,10.3,new Fiction("fantasy"),"9124567891202",1990);
		Book b1 = new Book("The Philosopher's Stone",550,a2,10.3,new Fiction("fantasy"),"9124567891202",1997);
		Book b4 = new Book("The Philosopher's Stone",550,a2,10.3,new Fiction("fantasy"),"9124567891202",1997);
		//int a = b1.getWriter().CompareTo(b0.getWriter());
		//System.out.println(b1.getWriter() == b2.getWriter());
		//System.out.print(b0.CompareTo(b1));
		//System.out.print(b0.toString());
		//Compare h1 = new Compare();
		//Sort s1 = new Sort();
		//String arr[] = {"aBsa","dasdc","bAAsd","zsdadsa","s2222"};

		//s1.sortArr(arr);
		//for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
		//}
		
		Invoice i = new Invoice();
		i.addBook(b0);
		i.addBook(b0);
		i.addBook(b0);
		//i.addBook(b2);
		//i.addBook(b1);
		//i.addBook(b0);
		//i.addBook(b2);
		//i.addBook(b1);
		System.out.println(i.toString());
		
		//System.out.println(i.calculatePrice());
		//System.out.println(i.calculateAuthorDiscountPrice());
		//System.out.println(i.calculateBookDiscountPrice());
		//System.out.println(i.calculateGenreDiscount());
		
		//i.addBook(b4);
		//i.addBook(b4);
		//i.addBook(b4);
		//i.showBooks();
		//System.out.println(i.ifAuthorDiscountEligible());
		//System.out.print(i.getDateTime());
		BookCollection b = new BookCollection();
		b.addBook(b1);
		b.addBook(b0);
		b.addBook(b2);
		b.addBook(b4);
		b.addBook(b4);
		b.addBook(b4);
		//System.out.print(b.printBookInfo(b1));
		//b.showBook();
		//System.out.println(b.getBook(b1));
		//System.out.println(b.removeBook(0));
		//b.showBook();
		b.sortByPrice();
		//b.showBook();
		//b.resetBooks();
		//b.showBook();
	}

}
