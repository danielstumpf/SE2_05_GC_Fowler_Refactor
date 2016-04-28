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

		assertThat("Should return 3", rental.getDaysRented(), is(3));
		assertThat("Should return gnilkreb", rental.getMovie(), is(movieInput));
	}

	@Test
	public void testGetDaysRented() {
		Movie movieInput = new Movie("gnilkreb", 2);
		Rental rental = new Rental(movieInput, 3);
		
		assertThat("Should return 3", rental.getDaysRented(), is(3));
	}

	@Test
	public void testGetMovie() {
		Movie movieInput = new Movie("gnilkreb", 2);
		Rental rental = new Rental(movieInput, 3);

		assertThat("Should return gnilkreb", rental.getMovie(), is(movieInput));
	}
}