package testing;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ProgramTest {

	@Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Test
	public void testMain() {
		
		
		// build the string which should be returned by the main method
		StringBuilder builder = new StringBuilder();
		builder.append("Welcome to the Movie Store");
		builder.append("\n");
		builder.append("Let's get the Statement");
		builder.append("\n");
		builder.append("Rental Record for ");
		builder.append("joe");
		builder.append("\n");
		builder.append("\t");
		builder.append("Title");
		builder.append("\t");
		builder.append("\t");
		builder.append("Days");
		builder.append("\t");
		builder.append("Amount");
		builder.append("\n");
		
		builder.append("\t");
		builder.append("movie1");
		builder.append("\t");
		builder.append("\t");
		builder.append("10");
		builder.append("\t");
		builder.append("30.0");
		builder.append("\n");
		
		builder.append("\t");
		builder.append("movie2");
		builder.append("\t");
		builder.append("\t");
		builder.append("5");
		builder.append("\t");
		builder.append("3.0");
		builder.append("\n");
		
		builder.append("Amount owed is ");
		builder.append("33.0");		
		builder.append("\n");
		
		builder.append("You earned ");
		builder.append("3");
		builder.append(" frequent renter points");
		builder.append("\n");
		program.Program.main(null);
		
		// Assert the values
		assertEquals(builder.toString(), systemOutRule.getLogWithNormalizedLineSeparator());
	}
}
