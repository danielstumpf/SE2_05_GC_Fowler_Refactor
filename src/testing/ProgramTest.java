package testing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import program.Customer;
import program.Movie;
import program.Rental;

public class ProgramTest {

	@Test
	public void testMain() {
		
		// Get the value from the main method, store in result string
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);   
        System.out.println("Let's get the Statement");
        result = c1.statement();
		
		// build the string which should be returned by the main method
		StringBuilder builder = new StringBuilder();
		builder.append("Rental Record for ");
		builder.append("joe");
		builder.append("\n");
		builder.append("\t");
		builder.append("Title");
		builder.append("\t");
		builder.append("\t");
		builder.append("Days");
		builder.append("\t");
		builder.append("Amount");
		builder.append("\n");
		
		builder.append("\t");
		builder.append("movie1");
		builder.append("\t");
		builder.append("\t");
		builder.append("10");
		builder.append("\t");
		builder.append("30.0");
		builder.append("\n");
		
		builder.append("\t");
		builder.append("movie2");
		builder.append("\t");
		builder.append("\t");
		builder.append("5");
		builder.append("\t");
		builder.append("3.0");
		builder.append("\n");
		
		builder.append("Amount owed is ");
		builder.append("33.0");		
		builder.append("\n");
		
		builder.append("You earned ");
		builder.append("3");
		builder.append(" frequent renter points");
		
		// Assert the values
		assertThat("Should return a String", result, is(builder.toString()));
	}

}
