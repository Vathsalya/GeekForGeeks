package com.strings.geeksforgeeks;

public class StringReverser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//original string
        String str = "Vathsalya";//"Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        String reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

	}
	
	public static String reverseRecursively(String str) {
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        System.out.println("1 "+str.substring(1));
        System.out.println("2 "+str.charAt(0));
      
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
