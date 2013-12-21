package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import solutions.FindString;

public class TestFindString {
	
	private FindString myFinder;
	private String[] myData;
	private String myTarget;

	@Before
	public void setUp() throws Exception {
		myFinder = new FindString();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindString() {
		myData = new String[]{"","","","","",""};
		myTarget = "jelly"; //all empty strings
		assertEquals(-1,myFinder.findString(myTarget, myData,0));
		myData = new String[]{"harry","igloo","marv","zebra"};
		myTarget = "harry"; //first index
		assertEquals(0,myFinder.findString(myTarget, myData,0));
		myTarget = "kevin"; //last index
		assertEquals(-1,myFinder.findString(myTarget, myData,0));
		myData = new String[]{"","","cheese", "", "dairy","johnson","","krabapple","maxwell coffee","","","","veraldi"};
		assertEquals(-1,myFinder.findString(myTarget, myData,0));
		myTarget = "johnson";
		assertEquals(5,myFinder.findString(myTarget, myData,0));
	}

}
