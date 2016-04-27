package testing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import program.NewReleasePrice;

public class NewReleasePriceTest {

	@Test
	public void testGetPriceCode() {
		NewReleasePrice newReleasePrice = new NewReleasePrice();
		int priceCode = newReleasePrice.getPriceCode();
		assertThat("Should return the value 1", priceCode, is(1));
	}

	@Test
	public void testGetCharge() {
		NewReleasePrice newReleasePrice = new NewReleasePrice();
		double charge = newReleasePrice.getAmount(8);
		assertThat("Should return the value 24.0", charge, is(24.0));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		NewReleasePrice newReleasePrice = new NewReleasePrice();
		int frequentRenterPoints = newReleasePrice.getFrequentRenterPoints(100);
		assertThat("Should return the value 2", frequentRenterPoints, is(2));
	}
}
