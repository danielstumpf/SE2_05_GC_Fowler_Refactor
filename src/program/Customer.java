package program;

import java.lang.*;
import java.util.*;

public class Customer {
	private String name;
	public Vector rentals = new Vector();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration enum_rentals = rentals.elements();
		String result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		while (enum_rentals.hasMoreElements()) {
			Rental each = (Rental) enum_rentals.nextElement();
			// determine amounts for each line
			frequentRenterPoints += each.getFrequentRenterPoints();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rental = rentals.elements();
		while (rental.hasMoreElements()) {
			Rental each = (Rental) rental.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	public double amountFor(Rental aRental) {
		return aRental.getCharge();
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rental = rentals.elements();
		while (rental.hasMoreElements()) {
			Rental each = (Rental) rental.nextElement();
			result += each.getCharge();
		}
		return result;
	}
}
