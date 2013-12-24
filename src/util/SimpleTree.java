package util;

public class SimpleTree {
	
	private Node myRoot;
	private int mySize;
	
	public SimpleTree(){
		myRoot = new Node(1);
		mySize = 2; //default
		buildTree(myRoot, 1);
	}
	
	public SimpleTree(int numLevels){
		myRoot = new Node(1);
		mySize = numLevels;
		buildTree(myRoot, 1);
	}
	
	public void buildTree(Node n, int level){
		if(level<=mySize){
			Node leftChild = new Node(n.getValue()*2);
			Node rightChild = new Node(n.getValue()*2+1);
			n.setLeft(leftChild);
			n.setRight(rightChild);
			level++;
			buildTree(leftChild, level);
			buildTree(rightChild,level);
		}
	}
	
	public Node getRoot(){
		return myRoot;
	}
	
	public void print(){
		print(myRoot);
	}
	
	private void print(Node node){
		if(node!=null){
			print(node.getLeft());
			System.out.println(node.getValue());
			print(node.getRight());
		}
	}
	
	

}
