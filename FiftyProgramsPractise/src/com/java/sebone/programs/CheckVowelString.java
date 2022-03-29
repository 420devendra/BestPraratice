/**
 * 
 */
package com.java.sebone.programs;

import java.lang.reflect.Array;

/** Class : CheckVowelString
 * @author DevendraMalve
 * objective : To check vowels in given string
 * 
 */
public class CheckVowelString {

	/**Method : checkVowel
	 * @param args : given string using as parameter
	 */
	
	public void checkVowel(String string) {
		string = string.toLowerCase();
		for(int i =0; i<string.length(); i++) {
			if(string.charAt(i)=='a'|| string.charAt(i)=='e' ||string.charAt(i)=='i'
				||string.charAt(i)=='o'|| string.charAt(i)=='u') {
				System.out.println("present vowel in string :" + string.charAt(i) );
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "devendramalvehukumsirjika";
		CheckVowelString checkVowelString = new CheckVowelString();
		checkVowelString.checkVowel(string);
	}

}
