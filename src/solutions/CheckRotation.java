package solutions;

public class CheckRotation {
	
	private int mySubstringCalls;
	
	public boolean isRotated(String template, String candidate){
		mySubstringCalls = 0; //for testing.
		if(!isValid(template) || !isValid(candidate)) return false;
		if(template.equals(candidate)) return true; //assume that identical strings are rotations.
		int begin = 0;
		char startChar = template.charAt(begin);
		while(countChar(template,startChar)>1){
			if(begin==template.length()) return false;
			begin++;
			startChar = template.charAt(begin);
		}
		int startIndex = candidate.indexOf(startChar);
		if(startIndex==-1) return false;
		return findRotation(template, candidate, begin, startIndex);
	}

	private boolean findRotation(String template, String candidate, int begin, int startIndex) {
		int pivot = -1;
		int j = startIndex + 1;
		int i = begin+1;
		while(pivot==-1){
			if(j==candidate.length() || template.charAt(i) != candidate.charAt(j))
				pivot = i;
			else{
				i++;
				j++;
			}
		}
		String candidateSubstring = candidate.substring(0,startIndex-begin);
		return template.contains(candidateSubstring) && candidateSubstring.length()>0;
	}
	
	public int getSubstringCalls(){
		return mySubstringCalls;
	}
	
	public int countChar(String string, char ch){
		int count = 0;
		for(int i = 0; i<string.length();i++){
			if(string.charAt(i)==ch)
				count++;
		}
		return count;
	}

	private boolean isValid(String string) {
		return string!=null && string.length()>0; 
	}

}
