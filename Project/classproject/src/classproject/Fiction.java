package classproject;

public class Fiction implements Genre{
	private String GENRE = "Fiction";
	private String subGenre;
	private double genreDiscount;
	
	public Fiction(String subGenre) {
		this.subGenre = subGenre;
		//this.genreDiscount = 0.09;
	}
	
	public String getSubGenre() {
		return subGenre;
	}
	public void setSubGenre(String subGenre) {
		this.subGenre = subGenre;
	}
	public double getGenreDiscount() {
		return genreDiscount;
	}
	public void setGenreDiscount(double genreDiscount) {
		this.genreDiscount = genreDiscount;
	}
	public String getGenre() {
		return this.GENRE;
	}
}
