package rentalstore;

public class ChildrenPrice extends Price{
    @Override
    public int getPriceCode(){
        return Movie.CHILDRENS;
    }

    public double getPrice( int day){
        double result = 1.5;
        if(day > 3)
            result += (day-3)*1.5;
        return result;
    }
}
