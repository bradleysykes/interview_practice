package solutions;

import java.util.LinkedList;
import java.util.List;

import util.*;

public class TreeLevelConversion {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleTree tree = new SimpleTree();
		List<List<Integer>> myConvertedTree = convert(tree.getRoot(),0,new LinkedList<LinkedList<Integer>>());
		int level = 0;
		for(List<Integer> subList:myConvertedTree){
			for(int x:subList){
				System.out.println(x);
			}
			System.out.println("LEVEL= "+level);
			level++;
		}
	}
	
	public static List convert(Node n, int level, LinkedList<LinkedList<Integer>> master){
		if(n==null){
			return master;
		}
		LinkedList<Integer> subList;
		if(level==master.size()){
			subList = new LinkedList<Integer>();
		}
		else{
			subList = master.get(level);
		}
		subList.add(n.getValue());
		master.add(subList);
		level++;
		convert(n.getLeft(),level,master);
		convert(n.getRight(),level,master);
		return master;
	}

}
