package rentalstore;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode(){
        return Movie.REGULAR;
    }

    public double getPrice( int day){
        double result = 2;
        if(day > 2)
            result += (day-2)*1.5;
        return result;
    }
}
