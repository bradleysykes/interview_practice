package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import solutions.CheckRotation;

public class TestCheckRotation {
	
	private CheckRotation myChecker;
	private String myTemplate;
	private String myCandidate;

	@Before
	public void setUp() throws Exception {
		myChecker = new CheckRotation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsRotated() {
		myTemplate = "waffleiron";
		myCandidate = "ffleironwa";
		assertTrue(myChecker.isRotated(myTemplate, myCandidate));
		assertTrue(myChecker.getSubstringCalls()<2);
		myTemplate = "springer";
		myCandidate = "springer";
		assertTrue(myChecker.isRotated(myTemplate, myCandidate)); //same word, treat as rotation.
		assertTrue(myChecker.getSubstringCalls()<2);
		myTemplate = "jerry seinfeld";
		myCandidate = "rry seinzzfeldje";
		assertFalse(myChecker.isRotated(myTemplate, myCandidate));
		assertTrue(myChecker.getSubstringCalls()<2);
		myTemplate = "papyrus";
		myCandidate = "pyruspa";
		assertTrue(myChecker.isRotated(myTemplate, myCandidate)); // case with repeated letters. 
		assertTrue(myChecker.getSubstringCalls()<2);
	}

}
