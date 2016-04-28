package program;

import java.util.*;

public class Customer {
	private String name;
	public ArrayList<Rental> rentals = new ArrayList<Rental>();

	public Customer(String newname) {
		name = newname;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public String htmlStatement() {
		StringBuilder builder = new StringBuilder();
		builder.append("<H1>Rentals for <EM>");
		builder.append(getName());
		builder.append("</EM></H1><P>\n");

		for (Rental rental : rentals) {
			// show figures for each rental
			builder.append(rental.getMovie().getTitle());
			builder.append(": ");
			builder.append(String.valueOf(rental.getCharge()));
			builder.append("<BR>\n");
		}
		// add footer lines
		builder.append("<P>You owe <EM>");
		builder.append(String.valueOf(getTotalCharge()));
		builder.append("</EM><P>\n");
		builder.append("On this rental you earned <EM>");
		builder.append(String.valueOf(getTotalFrequentRenterPoints()));
		builder.append("</EM> frequent renter points<P>");
		return builder.toString();
	}

	public String statement() {
		StringBuilder builder = new StringBuilder();

		builder.append("Rental Record for ");
		builder.append(this.getName());
		builder.append("\n");
		builder.append("\t");
		builder.append("Title");
		builder.append("\t");
		builder.append("\t");
		builder.append("Days");
		builder.append("\t");
		builder.append("Amount");
		builder.append("\n");
		for (Rental rental : rentals) {

			// show figures for this rental
			builder.append("\t");
			builder.append(rental.getMovie().getTitle());
			builder.append("\t");
			builder.append("\t");
			builder.append(rental.getDaysRented());
			builder.append("\t");
			builder.append(String.valueOf(rental.getCharge()));
			builder.append("\n");
		}
		// add footer lines
		builder.append("Amount owed is ");
		builder.append(String.valueOf(getTotalCharge()));
		builder.append("\n");
		builder.append("You earned ");
		builder.append(String.valueOf(getTotalFrequentRenterPoints()));
		builder.append(" frequent renter points");
		return builder.toString();
	}

	public double amountFor(Rental aRental) {
		return aRental.getCharge();
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		for (Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}
	
	private double getTotalCharge() {
		double result = 0;
		for (Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
}