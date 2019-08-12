package rentalstore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.setPriceCode(priceCode);
    }

    public int getPriceCode(){
        return price.getPriceCode();
    }


    public void setPriceCode(int priceCode) {
       switch(priceCode){
           case CHILDRENS :
               price = new ChildrenPrice();
               break;
           case REGULAR :
               price = new RegularPrice();
               break;
           case  NEW_RELEASE :
               price = new NewRelease();
               break;
       }
    }

    public double getPrice( int day ) {
        return price.getPrice( day );

    }

    public double getFrequentRenterPoints( int day ) {
        return price.getFrequentRenterPoints( day );

    }
    public String getTitle() {
        return title;
    }
}
