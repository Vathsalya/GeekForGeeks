package com.strings.geeksforgeeks;

public class RecursiveDuplicateRemover {

	/**Recursively remove all adjacent duplicates
Given a string, recursively remove adjacent duplicate characters from string. The output string should not have any adjacent duplicates. See following examples.

Input:  azxxzy
Output: ay
First "azxxzy" is reduced to "azzy". The string "azzy" contains duplicates, 
so it is further reduced to "ay".

Input: geeksforgeeg
Output: gksfor
First "geeksforgeeg" is reduced to "gksforgg". The string "gksforgg" contains 
duplicates, so it is further reduced to "gksfor".

Input: caaabbbaacdddd
Output: Empty String

Input: acaaabbbacdddd
Output: acac
A simple approach would be to run the input string through multiple passes. In every pass remove all adjacent duplicates from left to right. Stop running passes when there are no duplicates. The worst time complexity of this method would be O(n^2).

We can remove all duplicates in O(n) time.
1) Start from the leftmost character and remove duplicates at left corner if there are any.
2) The first character must be different from its adjacent now. Recur for string of length n-1 (string without first character).
3) Let the string obtained after reducing right substring of length n-1 be rem_str. There are three possible cases
……..a) If first character of rem_str matches with the first character of original string, remove the first character from rem_str.
……..b) Else if the last removed character in recursive calls is same as the first character of the original string. Ignore the first character of original string and return rem_str.
……..c) Else, append the first character of the original string at the beginning of rem_str.
4) Return rem_str.
	 * @param args
	 */
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeAdjDuplicates("geeksforgeeks"));

	}
	private static String removeAdjDuplicates(String OriginalString) {
		// TODO Auto-generated method stub
		String RemainingString = "";
		for(int i = 0;i<OriginalString.length()-1;i++){
			if(OriginalString.charAt(i) == OriginalString.charAt(i+1)){
				int j = i+1;				
				RemainingString = RemainingString + OriginalString.substring(++j);
				return removeAdjDuplicates(RemainingString);			
			}
			RemainingString = RemainingString + OriginalString.charAt(i);
		}
		return RemainingString;		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeAdjDuplicates("acaaabbbacdddd"));

	}
	private static String removeAdjDuplicates(String OriginalString) {
		// TODO Auto-generated method stub
		
		 if(OriginalString == null || OriginalString.length() <= 1)
		        return OriginalString;
		     else if( OriginalString.charAt(0) == OriginalString.charAt(1) )
		        return removeAdjDuplicates(OriginalString.substring(2));
		     else
		        return OriginalString.charAt(0) + 
		            removeAdjDuplicates(OriginalString.substring(1));
	}
}
