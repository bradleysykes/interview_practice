package util;

public class SimpleTree {
	
	private Node myRoot;
	
	public SimpleTree(){
		myRoot = new Node(1);
		buildTree(myRoot, 0);
	}
	
	public void buildTree(Node n, int level){
		if(level>2){
			return;
		}
		Node leftChild = new Node(n.getValue()*2);
		Node rightChild = new Node(n.getValue()*2+1);
		n.setLeft(leftChild);
		n.setRight(rightChild);
		level++;
		buildTree(leftChild, level);
		buildTree(rightChild,level);
	}
	
	public Node getRoot(){
		return myRoot;
	}
	
	

}
