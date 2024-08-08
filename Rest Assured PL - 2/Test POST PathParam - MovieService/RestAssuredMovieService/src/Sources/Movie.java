//PLEASE DO NOT CHANGE THIS CLASS.

package Sources;

public class Movie {

    private int movieId, durationInMins;
    private String movieTitle, language, genre, releaseDate;
    private String country;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public int getDurationInMins() {
		return durationInMins;
	}
	public void setDurationInMins(int durationInMins) {
		this.durationInMins = durationInMins;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Movie(int movieId, String movieTitle, int durationInMins, String language, String genre,
			String releaseDate, String country) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.durationInMins = durationInMins;
		this.language = language;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.country = country;
	}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

    

}