package com.strings.geeksforgeeks;

public class PatternSearcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naivePatternSearch("AABAACAADAABA","AABA");
	}

	private static void naivePatternSearch(String text, String pattern) {
		// TODO Auto-generated method stub
		for(int i = 0;i<=(text.length());i++){
			int j;
			for(j = 0;j<pattern.length();j++){
				if(text.charAt(i+j)!=pattern.charAt(j)){
					break;
				}
			}
			if(j == pattern.length()){
				System.out.println("Found at "+i);
			}
		}
	}

}
