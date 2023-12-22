package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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

		//Part2
//		try {
//			PrintWriter pw = new PrintWriter(new FileOutputStream("input.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//1. Read File:
		System.out.println("\nFile content: ");
		try {
			IOfileManager.readFromFile("input.txt");
		} catch (IOException e) {
			
			System.out.println("\nError: "+ e.getMessage());
		}
		
		//2.
		System.out.println("Total no. of characters: "+IOfileManager.totalCharacterCount("input.txt"));
		
		//3.
		ArrayList<String> myList = new ArrayList<String>();
		myList.addAll(Arrays.asList("Hello, this is line 1.","Java File I/O is interesting!","End of the assignment."));
		
		try {
			IOfileManager.writeToFile("output.txt", myList);
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		//4. Append to File:
		
		ArrayList<String> appendList = new ArrayList<String>();
		appendList.addAll(Arrays.asList("Appending new line.","File I/O without buffers."));
		IOfileManager.appendToFile("output.txt", appendList); 
		System.out.println("\nList appended to the file.");
		
		//5.
		IOfileManager.writeToFileWithoutBuffer("custom.txt", "Kawthar");
	}
	
	//Generic method
	public static <T> void genericPrinter(ArrayList<T> list) {
		try {
            for (T element : list) {
                System.out.println(element);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
