package testing;

import static org.junit.Assert.*;

import java.util.regex.Matcher;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import program.ChildrensPrice;

public class ChildrensPriceTest {

	@Test
	public void testGetPriceCode() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		int priceCode = childrensPrice.getPriceCode();		
		assertThat("Should return the value 2", priceCode, is(2));
	}

	@Test
	public void testGetCharge_value2() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		double charge = childrensPrice.getCharge(2);
		assertThat("Should return the value 1.5", charge, is(1.5));
	}
	
	@Test
	public void testGetCharge_value7() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		double charge = childrensPrice.getCharge(7);
		assertThat("Should return the value 6.0", charge, is(6.0));
	}

	@Test
	public void testGetFrequentRenterPoints() {
		ChildrensPrice childrensPrice = new ChildrensPrice();
		int frequentRenterPoints = childrensPrice.getFrequentRenterPoints(7);		
		assertThat("Should return the value 1", frequentRenterPoints, is(1));
	}

}
