package solutions;

import util.Node;

public class TreeHeightFinder {

	public int findHeight(Node root){
		return calcHeight(root);
	}

	private int calcHeight(Node node) {
		if(node==null) return 0;
		return 1+Math.max(calcHeight(node.getLeft()),calcHeight(node.getRight()));
	}

}
