package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class IOfileManager {
	
	
	
	public IOfileManager() {
		super();
	}

	public static void readFromFile(String fileName) throws IOException{
		String line;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
				 fileReader = new FileReader(fileName);
		         bufferedReader = new BufferedReader(fileReader);
		           
		        while ((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		        }

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }finally {
	        	try {
	                if (bufferedReader != null) {
	                    bufferedReader.close();
	                }
	                if (fileReader != null) {
	                    fileReader.close();
	                }
	        	} catch (IOException e) {
	                System.out.println("Error : " + e.getMessage());
	            }
	        }
		
	}
	
	public static int lineCharacterCount(String line) {
		
		if (line == null || line.isEmpty()) {
            return 0;
        }
		line = line.trim();

        return line.trim().replaceAll("\\s", "").length();
	}
	
	public static int totalCharacterCount(String fileName) {
		String line;
		int totalCountChar = 0;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
				 fileReader = new FileReader(fileName);
		         bufferedReader = new BufferedReader(fileReader);
		           int i=0;
		        while ((line = bufferedReader.readLine()) != null) {
		        	i++;
		        	System.out.println("No. of char in line "+i+" : "+ lineCharacterCount(line));
		        	totalCountChar = totalCountChar + lineCharacterCount(line);
		        }

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }finally {
	        	try {
	                if (bufferedReader != null) {
	                    bufferedReader.close();
	                }
	                if (fileReader != null) {
	                    fileReader.close();
	                }
	        	} catch (IOException e) {
	                System.out.println("Error : " + e.getMessage());
	            }
	        }
		return totalCountChar;
	}
	
	public static void writeToFile(String fileName, ArrayList<String> textlist) throws IOException{
		PrintWriter pw = null;
		
		try {
			
			pw = new PrintWriter(new FileOutputStream(fileName));
			
		}catch(FileNotFoundException e) {
			System.out.println("the fileis not exist ");
		
		}
		
		//print on the file
		 for(String x : textlist) {
	           pw.println(x);
	        }
		 
		 pw.close();
		
	}
	
	public static void appendToFile(String fileName, ArrayList<String> textlist) {
		PrintWriter pw = null;
		try {
			 pw = new PrintWriter(new FileOutputStream(fileName, true));
			
		} catch (FileNotFoundException e) {
			System.out.println("Error : "+e.getMessage());
		}
		
		for(String x : textlist) {
	           pw.println(x);
	        }
		 
		 pw.close();
	}
	
	public static void writeToFileWithoutBuffer(String filename, String str) {
        try  {
        	FileWriter fw = new FileWriter(filename);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
       
    }

}
