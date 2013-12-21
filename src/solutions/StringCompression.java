package solutions;

public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringCompression compression = new StringCompression();
		System.out.println(compression.compress("aabcccccaaa"));
	}
	
	public String compress(String input){
		if(input.length()==0 || input == null) return input;
		int[] freqs = new int[256];
		for(int i=0;i<input.length();i++){
			int freqIndex = input.charAt(i);
			freqs[freqIndex]++;
		}
		StringBuilder compressed = new StringBuilder();
		for(int i = 0;i<freqs.length;i++){
			if(freqs[i]>0){
				char c = (char)i;
				int count = freqs[i];
				compressed.append(c+""+count);
			}
		}
		System.out.println(compressed.toString());
		if(compressed.length()<input.length()) return compressed.toString();
		return input;
	}

}
