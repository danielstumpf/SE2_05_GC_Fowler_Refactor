package program;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Price price;

	public Movie(String newtitle, int priceCode) {
		title = newtitle;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		if (REGULAR == arg) {
			price = new RegularPrice();
		} else if (CHILDRENS == arg) {
			price = new ChildrensPrice();
		} else if (NEW_RELEASE == arg) {
			price = new NewReleasePrice();
		} else {
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}