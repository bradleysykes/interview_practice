package util;

public class Node {
	private int myValue;
	private Node myLeft;
	private Node myRight;
	
	public Node(int value, Node left, Node right){
		myValue = value;
		myLeft = left;
		myRight = right;
	}
	
	public Node(int value){
		myValue = value;
	}
	
	public void setValue(int value){
		myValue = value;
	}
	
	public void setLeft(Node left){
		myLeft = left;
	}
	
	public void setRight(Node right){
		myRight = right;
	}
	
	public int getValue(){
		return myValue;
	}
	
	public Node getLeft(){
		return myLeft;
	}
	
	public Node getRight(){
		return myRight;
	}
}
