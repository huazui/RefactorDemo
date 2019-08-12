package MyTest;

import org.junit.Assert;
import org.junit.Test;
import rentalstore.Customer;
import rentalstore.Movie;
import rentalstore.Rental;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyCustomerTest {

    private Customer customer = new Customer("Jerry");

    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_1_day() {
        Movie regularMovie = new Movie("Titanic", 0);
        Rental oneDayRental = new Rental(regularMovie, 1);
        customer.addRental(oneDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_3_day() {
        Movie regularMovie = new Movie("Titanic", 0);
        Rental threeDayRental = new Rental(regularMovie, 3);
        customer.addRental(threeDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_1_day() {
        Movie newReleaseMovie = new Movie("Titanic", 1);
        Rental oneDayRental = new Rental(newReleaseMovie, 1);
        customer.addRental(oneDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_2_day() {
        Movie newReleaseMovie = new Movie("Titanic", 1);
        Rental twoDayRental = new Rental(newReleaseMovie, 2);
        customer.addRental(twoDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_1_day() {
        Movie childrenMovie = new Movie("Titanic", 2);
        Rental oneDayRental = new Rental(childrenMovie, 1);
        customer.addRental(oneDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie childrenMovie = new Movie("Titanic", 2);
        Rental fourDayRental = new Rental(childrenMovie, 4);
        customer.addRental(fourDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Jerry\n" +
                "\tTitanic\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_html_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie childrenMovie = new Movie("Titanic", 2);
        Movie newRelaeseMovie = new Movie("Roman Holiday",1);
        Rental fourDayRental = new Rental(childrenMovie, 4);
        Rental fourDayRental2 = new Rental(newRelaeseMovie, 3);
        customer.addRental(fourDayRental);
        customer.addRental(fourDayRental2);
        String statement = customer.htmlStatement();

        System.out.println(statement);

        assertEquals("<H1>Rentals for <EM>Jerry</EM></H1><P>\n" +
                "Titanic: 3.0<BR>\n" +
                "Roman Holiday: 9.0<BR>\n"+
                "<P>You owe<EM>12.0</EM><P>\n" +
                "On this rental you earned <EM>3</EM> frequent renter points<P>", statement);
    }

}