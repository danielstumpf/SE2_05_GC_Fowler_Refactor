package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import program.Movie;
import program.Rental;

public class RentalTest {

	@Test
	public void testRental() {
		Movie movieInput = new Movie("gnilkreb", 2); 
		Rental rental = new Rental(movieInput, 3);
		int daysRented = rental.getDaysRented();
		assertThat("Should return 3", daysRented, is(3));
		
		Movie movie = rental.getMovie();
		assertThat("Should return gnilkreb", movie, is(movieInput));
	}

	@Test
	public void testGetDaysRented() {
		Movie movieInput = new Movie("gnilkreb", 2); 
		Rental rental = new Rental(movieInput, 3);
		int daysRented = rental.getDaysRented();
		assertThat("Should return 3", daysRented, is(3));
		
	}

	@Test
	public void testGetMovie() {
		Movie movieInput = new Movie("gnilkreb", 2); 
		Rental rental = new Rental(movieInput, 3);
				
		Movie movie = rental.getMovie();
		assertThat("Should return gnilkreb", movie, is(movieInput));
	
	}

	@Test
	public void testGetCharge() {
		Movie movieInput = new Movie("gnilkreb", 2); 
		Rental rental = new Rental(movieInput, 3);
		double daysRented = rental.getCharge();
		assertThat("Should return 1.5", daysRented, is(1.5));
		
	
	}

	@Test
	public void testGetFrequentRenterPoints() {
		Movie movieInput = new Movie("gnilkreb", 2); 
		Rental rental = new Rental(movieInput, 3);
		int daysRented = rental.getFrequentRenterPoints();
		assertThat("Should return 1", daysRented, is(1));
		
	}

}