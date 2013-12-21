package solutions;

import java.util.Arrays;

public class FindString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindString finder = new FindString();
		String[] data = {"at","","","","ball","",""};
		System.out.println(finder.findString("ball", data, 0));
	}
	
	
	/**
	 * Questions: 
	 * What happens if user searching for empty string?
	 * @param String target
	 * @param String[] data
	 * @param int accumulated: Accumulated index from previous recursive calls.
	 * @return
	 */
	public int findString(String target, String[] data, int accumulated){
		if(data.length==0) return -1;
		if(data.length==1){
			if(data[0].equals(target)) return accumulated;
			return -1;
		}
		int pivot = data.length/2;
		int tempPivot = pivot;
		int change = 1;
		while(data[tempPivot].equals("")){
			//search for non-empty string pivot
			if(tempPivot==data.length-1){
				change = -1;
				tempPivot = pivot;
			}
			if(tempPivot==0)
				return -1; //array contains only empty strings.
			else{
				tempPivot += change;
			}
		}
		 int comparison = data[tempPivot].compareTo(target);
		 if(comparison==0) return accumulated+tempPivot; //string found
		 if(comparison>0) return findString(target, Arrays.copyOfRange(data, 0, tempPivot), accumulated);
		 accumulated+=tempPivot;
		 return findString(target, Arrays.copyOfRange(data, tempPivot, data.length-1),accumulated );
	}

}
