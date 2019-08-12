package rentalstore;

public class NewRelease extends Price{
    @Override
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    public double getPrice( int day){
        return day * 3;
    }

    public int getFrequentRenterPoints( int day ){
        return ( day > 1 ) ? 2:1;
    }
}
