package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import solutions.TreeHeightFinder;
import util.SimpleTree;

public class TestTreeHeightFinder {

	@Test
	public void testFindHeight() {
		TreeHeightFinder finder = new TreeHeightFinder();
		SimpleTree tree = new SimpleTree();
		tree.print();
		assertEquals(finder.findHeight(tree.getRoot()),2);
	}

}
