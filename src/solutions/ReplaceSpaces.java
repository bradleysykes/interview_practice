package solutions;

import java.util.Arrays;
import java.util.Collections;

public class ReplaceSpaces {
	
	public static void main(String[] args){
		ReplaceSpaces r = new ReplaceSpaces();
		System.out.println(r.replaceSpaces("bennn "));
	}

	public String replaceSpaces(String input){
		if(!isValid(input)) return input;
		int arrayLength = getResultLength(input);
		char[] result = new char[arrayLength];
		int arrayIndex = 0;
		for(int i = 0;i<input.length();i++){
			char c = input.charAt(i);
			if(c!=' '){
				result[arrayIndex] = c;
				arrayIndex++;
			}
			else{
				result[arrayIndex] = '%';
				result[arrayIndex+1]='2';
				result[arrayIndex+2]='0';
				arrayIndex = arrayIndex+3;
			}
		}
		return String.valueOf(result);
	}
	
	private boolean isValid(String input){
		if(input == null) return false;
		char[] array = input.toCharArray();
		Arrays.sort(array);
		int searchResult = Arrays.binarySearch(array, ' ');
		return searchResult >= -1;
	}
	
	private int getResultLength(String input){
		int spaceCount = 0;
		for(int i = 0;i<input.length();i++){
			if(input.charAt(i)==' ')
				spaceCount++;
		}
		return input.length()+spaceCount*2;
	}

}
