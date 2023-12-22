package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//1. ArrayList Operations:
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.addAll(Arrays.asList("apple", "banana", "orange", "grape", "kiwi"));
		System.out.println("The original list:\n"+ wordList);   
		
		//2. ArrayList Manipulation:
		wordList.add(0,"pear");
		wordList.remove(2);
		System.out.println("The list contains the word (orange) :"+ wordList.contains("orange"));
		System.out.println("The updated list");
		System.out.println(wordList); 
		System.out.println();
		
		//3. Generic Class:
		Pair<Integer,String> pair1 = new Pair<Integer,String>(21,"pair1");
		System.out.println(pair1);
			   
		//4. Using Generic Class:
		Pair<Double,Double> pair2 = new Pair<Double,Double>(100.95,66.5);
		System.out.println(pair2);  
		
		//5. ArrayList with Generics:
		ArrayList<Pair> pList = new ArrayList<Pair>();
		pList.addAll(Arrays.asList(pair1,pair2));
		System.out.println("List of pair is:\n"+ pList);
		
		//6. Challenge:
		System.out.println("\nPrint using generic method");
		genericPrinter(wordList);
		genericPrinter(pList);
//			   - Write a method that takes an ArrayList of any type and prints its elements.
//			   - Test this method with both `wordList` and the ArrayList of `Pair` instances.


	}
	
	//Generic method
	public static <T> void genericPrinter(ArrayList<T> list) {
		System.out.println("The list is:\n"+ list);
	}

}
