package rentalstore;

public abstract class Price {
    public abstract  int getPriceCode();
    public abstract double getPrice( int daysRented);
    public int getFrequentRenterPoints( int day ){
        return 1;
    }
}
