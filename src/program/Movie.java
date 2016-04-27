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

	public void setPriceCode(int priceCode) {
		if (REGULAR == priceCode) {
			price = new RegularPrice();
		} else if (CHILDRENS == priceCode) {
			price = new ChildrensPrice();
		} else if (NEW_RELEASE == priceCode) {
			price = new NewReleasePrice();
		} else {
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public String getTitle() {
		return title;
	}

	public double getAmount(int daysRented) {
		return price.getAmount(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}