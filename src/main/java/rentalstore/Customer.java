package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;

    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }


    public double getAmount(Rental rental){
        Movie movie = rental.getMovie();
        return movie.getPrice(rental.getDayRented());
    }





    public String getButton(){

        String result = "Amount owed is " + String.valueOf(this.getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(this.getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public double getTotalAmount(){
        double totalAmount = 0;
        for (Rental each : this.rentals) {

            double thisAmount = this.getAmount(each);
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    public int getFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        for (Rental each : this.rentals) {
            frequentRenterPoints ++;
            if ((each.getMoviePriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1){
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;

    }

    public String getHeader(){
        return "Rental Record for " + getName() + "\n";
    }

    public String getBodyStatement(Rental rental){
       return "\t" + rental.getMovieTitle()+ "\t" + String.valueOf(this.getAmount(rental)) + "\n";
    }



    public String statement() {

        String result = this.getHeader();

        for (Rental each : this.rentals) {
            result += this.getBodyStatement(each);
        }
        result += this.getButton();
       return result;
    }


    public String getHtmlHeader(){
        return "<H1>Rentals for <EM>" + this.getName() + "</EM></H1><P>\n";
    }

    public String getHtmlButton(){
             String button = "<P>You owe<EM>" + this.getTotalAmount() + "</EM><P>\n";
       button +=  "On this rental you earned <EM>" + this.getFrequentRenterPoints() + "</EM> frequent renter points<P>";
       return button;
    }

    public String getHtmlBody(Rental rental){
        return  rental.getMovieTitle()+ ": " + String.valueOf(this.getAmount(rental)) + "<BR>\n";
    }

    public String htmlStatement(){
        String result = this.getHtmlHeader();
        for (Rental each : this.rentals) {
            result += this.getHtmlBody(each);
        }
        result += this.getHtmlButton();
        return result;
    }

}
