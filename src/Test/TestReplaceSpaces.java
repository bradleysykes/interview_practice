package Test;

import static org.junit.Assert.*;
import solutions.ReplaceSpaces;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestReplaceSpaces {
	
	private ReplaceSpaces replace;
	

	@Before
	public void setUp() throws Exception {
		replace = new ReplaceSpaces();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReplaceSpaces() {
		assertEquals("Mr%20John%20Smith",replace.replaceSpaces("Mr John Smith"));
		assertEquals(null,replace.replaceSpaces(null)); //null input
		assertEquals("jeff",replace.replaceSpaces("jeff")); //no spaces
		assertEquals("%20bennn",replace.replaceSpaces(" bennn")); //space in front
		assertEquals("bennn%20",replace.replaceSpaces("bennn ")); //space at end
		assertEquals("%20%20%20",replace.replaceSpaces("   ")); //only spaces
	}

}
