package testing;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import program.Movie;

public class MovieTest {

	@Test
	public void testMovie() {
		Movie movie0 = new Movie("gnilkreb", 0);
		assertThat("Compare the movie values", movie0.getTitle(), is("gnilkreb"));

		Movie movie1 = new Movie("didelideli", 1);
		assertThat("Compare the movie values", movie1.getTitle(), is("didelideli"));

		Movie movie2 = new Movie("software", 2);
		assertThat("Compare the movie values", movie2.getTitle(), is("software"));
	}

	@Test
	public void testGetPriceCode_0() {
		Movie movie = new Movie("software", 0);
		int priceCode = movie.getPriceCode();
		assertThat("Should return the value 0", priceCode, is(0));
	}

	@Test
	public void testGetPriceCode_1() {
		Movie movie = new Movie("software", 1);
		int priceCode = movie.getPriceCode();
		assertThat("Should return the value 1", priceCode, is(1));
	}

	@Test
	public void testGetPriceCode_2() {
		Movie movie = new Movie("software", 2);
		int priceCode = movie.getPriceCode();
		assertThat("Should return the value 2", priceCode, is(2));
	}

	@Test
	public void testSetPriceCode_2() {
		Movie movie = new Movie("lala", 0);
		movie.setPriceCode(2);
		assertThat("Should return the value 2", movie.getPriceCode(), is(2));
	}

	@Test
	public void testSetPriceCode_1() {
		Movie movie = new Movie("lala", 0);
		movie.setPriceCode(1);
		assertThat("Should return the value 1", movie.getPriceCode(), is(1));
	}

	@Test
	public void testSetPriceCode_0() {
		Movie movie = new Movie("lala", 1);
		movie.setPriceCode(0);
		assertThat("Should return the value 0", movie.getPriceCode(), is(0));
	}

	@Test
	public void testGetTitle() {
		Movie movie = new Movie("gnilkreb", 0);
		assertThat("Compare the movie values", movie.getTitle(), is("gnilkreb"));
	}
}
