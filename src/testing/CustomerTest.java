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
		String name = "xy";
		Customer customer = new Customer(name);
		
		assertThat("name should be 'xy'.", customer.getName(), is("xy"));
	}

	@Test
	public void testAddRental() {
		//creates a Movie with name TestMovie and the setting Regular (0)
		Movie movie = new Movie("TestMovie", 0); 
		//creates a rental with movie "movie" and days rented "2"
		Rental rental = new Rental(movie, 2); 
		 //creates a new Customer with the name "xy"
		Customer customer = new Customer("xy"); //creates a new Customer with the name "xy"
		
		assertFalse(customer.rentals.contains(rental));
		
		customer.addRental(rental);
		
		assertTrue(customer.rentals.contains(rental));
	}

	@Test
	public void testGetName() {
		String result = "xy";
		Customer customer = new Customer(result);
		result = customer.getName();
		
		assertThat("result should be 'xy'.", result, is("xy"));
	}

	@Test
	public void testStatement() {
		Movie movie = new Movie("TestMovie", 0); //creates a Movie with name TestMovie and the setting Regular (0)
		Rental rental = new Rental(movie, 2); //creates a rental with movie "movie" and days rented "2"
		Customer customer = new Customer("xy"); //creates a new Customer with the name "xy"
		customer.addRental(rental);
		
		assertThat("Rental Record for xy\n\tTitle\t\tDays\tAmount\n\tTestMovie\t\t2\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points", customer.statement(), is("Rental Record for xy\n\tTitle\t\tDays\tAmount\n\tTestMovie\t\t2\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points"));
	}

}