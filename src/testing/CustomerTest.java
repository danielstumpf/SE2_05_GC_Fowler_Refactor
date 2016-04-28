package testing;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import program.Customer;
import program.Movie;
import program.Rental;

public class CustomerTest {

	@Test
	public void testCustomer_withNoString() {
		String name = "";
		Customer customer = new Customer(name);
		
		assertThat("name should be ''.", customer.getName(), is(""));
	}
	
	@Test
	public void testCustomer_withString() {
		String name = "gnilkreb";
		Customer customer = new Customer(name);
		
		assertThat("name should be gnilkreb.", customer.getName(), is("gnilkreb"));
	}

	@Test
	public void testAddRental() {
		//creates a Movie object with name TestMovie and the setting Regular (0)
		Movie movie = new Movie("TestMovie", 0); 
		//creates a rental object with movie "movie" and days rented "2"
		Rental rental = new Rental(movie, 2);
		//creates a new Customer object with the name "gnilkreb"
		Customer customer = new Customer("gnilkreb"); 
		
		assertFalse(customer.rentals.contains(rental));
		
		customer.addRental(rental);
		
		assertTrue(customer.rentals.contains(rental));
	}

	@Test
	public void testGetName() {
		String result = "gnilkreb";
		Customer customer = new Customer(result);
		result = customer.getName();
		
		assertThat("result should be gnilkreb.", result, is("gnilkreb"));
	}

	@Test
	public void testStatement() {
		//creates a Movie with name Fowler and the setting Regular (0)
		Movie movie = new Movie("Fowler", 0); 
		//creates a rental with movie "movie" and days rented "2"
		Rental rental = new Rental(movie, 2); 
		//creates a new Customer with the name "gnilkreb"
		Customer customer = new Customer("gnilkreb"); 
		customer.addRental(rental);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Rental Record for gnilkreb");
		stringBuilder.append("\n");
		stringBuilder.append("\t");
		stringBuilder.append("Title\t\t");
		stringBuilder.append("Days\t");
		stringBuilder.append("Amount");
		stringBuilder.append("\n\t");
		stringBuilder.append("Fowler");
		stringBuilder.append("\t\t");
		stringBuilder.append("2");
		stringBuilder.append("\t");
		stringBuilder.append("2.0");
		stringBuilder.append("\n");
		stringBuilder.append("Amount owed is 2.0");
		stringBuilder.append("\n");
		stringBuilder.append("You earned 1 frequent renter points");
		
		assertThat("Compare the  Strings", customer.statement(), is(stringBuilder.toString()));
	}
	
	@Test
	public void testAmountFor_0() {
		Movie movie = new Movie("gnilkreb", 0);
		Rental rental = new Rental(movie, 2);
		Customer customer = new Customer("Fowler");
		
		assertThat("Should return 2.0", rental.amountFor(), is(2.0));		
	}
	
	@Test
	public void testAmountFor_1() {
		Movie movie = new Movie("gnilkreb", 1);
		Rental rental = new Rental(movie, 2);
		Customer customer = new Customer("Fowler");
		
		assertThat("Should return 6.0", rental.amountFor(), is(6.0));		
	}
	
	@Test
	public void testAmountFor_2() {
		Movie movie = new Movie("gnilkreb", 2);
		Rental rental = new Rental(movie, 2);
		Customer customer = new Customer("Fowler");
		
		assertThat("Should return 1.5", rental.amountFor(), is(1.5));		
	}
}