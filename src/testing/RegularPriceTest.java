package testing;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import program.RegularPrice;

public class RegularPriceTest {

	@Test
	public void testGetPriceCode() {
		RegularPrice regularPrice = new RegularPrice();
		int getRegularPrice = regularPrice.getPriceCode();
		
		assertThat("Should return the value 0", getRegularPrice, is(0));
	}

	@Test
	public void testGetCharge_mitEins() {
		RegularPrice RegularPrice = new RegularPrice();
		double getRegularPrice = RegularPrice.getCharge(1);
		
		assertThat("Should return the value 2", getRegularPrice, is(2.0));
	}

	@Test
	public void testGetCharge_mitVier() {
		RegularPrice RegularPrice = new RegularPrice();
		double getRegularPrice = RegularPrice.getCharge(4);
		
		assertThat("Should return the value 3", getRegularPrice, is(3.0));
	}
	
	@Test
	public void testGetFrequentRenterPoints() {
		RegularPrice RegularPrice = new RegularPrice();
		int getRegularPrice = RegularPrice.getFrequentRenterPoints(7);
		
		assertThat("Should return the value 1", getRegularPrice, is(1));
	}
}