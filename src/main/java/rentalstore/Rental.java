package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public int getMoviePriceCode(){
        return this.getMovie().getPriceCode();
    }
    public String getMovieTitle(){
        return this.movie.getTitle();
    }
}
