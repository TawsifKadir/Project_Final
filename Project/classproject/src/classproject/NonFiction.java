package classproject;

public class NonFiction implements Genre{
	private String GENRE = "NonFiction";
	private String subGenre;
	private double genreDiscount;
	
	public NonFiction(String subGenre) {
		this.subGenre = subGenre;
		//this.genreDiscount = 0.1;
	}
	
	@Override
	public String toString() {
		return "NonFiction [subGenre=" + subGenre + ", genreDiscount=" + genreDiscount + "]";
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
