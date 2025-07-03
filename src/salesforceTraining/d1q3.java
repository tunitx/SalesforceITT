package salesforceTraining;

import java.util.HashSet;

public class d1q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two ways to find duplicate chars in a string
		//1 : use a char array of size 26 or accordingly
		//2 : use a hashset
		
		
		String str = "anand";
		
		// hashset approach
		
//		HashSet<Character> set = new HashSet<Character>();
//		
//		for(char c : str.toCharArray()) {
//			if(set.contains(c)) System.out.println("Duplicate character found: " + c);
//			set.add(c);
//		}
		
		//character array approach
		
		int charArray [] = new int[26];
		
		for(char c : str.toCharArray()) {
			charArray[c - 'a'] ++;
		}
		
		for(int i =0; i<26; i++) {
			if(charArray[i] > 1) {
				char curr = (char)('a' + i);
				System.out.println("duplicate found: " + (curr));
			}
		}
		
		
	
	}

}
