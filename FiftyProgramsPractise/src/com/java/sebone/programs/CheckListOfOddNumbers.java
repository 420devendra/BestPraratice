/**
 * 
 */
package com.java.sebone.programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author DevendraMalve
 *
 */
public class CheckListOfOddNumbers {

	/**
	 * @param args
	 */
	static boolean checkOddNumberList(List<Integer> array) {
		for(int i :array) {
			if(i%2==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int arraySize = scanner.nextInt();
		List<Integer > array= new ArrayList<>();
		for(int i = 0; i<arraySize; i++ ) {
			array.add(scanner.nextInt());
			
		}
		System.out.println(array);
		if(checkOddNumberList(array)) {
			System.out.println("This List Contains Only Odd Numbers: "+array);
		}
		else{
			
			System.out.println("List does not contain Only Odd Number : "+array);
		}
	}

}
