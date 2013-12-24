package solutions;

import java.util.Stack;

import util.Node;
import util.SimpleTree;

public class InOrderNoRecursion {
	
	public static void main(String[] args){
		SimpleTree tree = new SimpleTree();
		printTree(tree.getRoot());
	}

	public static void printTree(Node root){
		Stack<Node> remaining = new Stack<Node>();
		remaining.push(root);
		while(!remaining.isEmpty()){
			Node top = remaining.pop();
			System.out.println(top.getValue());
			Node left = top.getLeft();
			Node right = top.getRight();
			if(right!=null) remaining.push(right);
			if(left!=null) remaining.push(left);
		}
	}

}
