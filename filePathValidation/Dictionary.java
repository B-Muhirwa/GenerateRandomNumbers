package filePathValidation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
	String filePath = "src\\filePathValidation\\dictionary.txt";
	String filePath2 = "src\\filePathValidation\\dictionary2.txt";
	String path; 
	File file ;
	public static void main(String[] args) {
		
		Dictionary dc = new Dictionary();
		
		dc.doesFileExist("");
		dc.fileReader("");

	}
	public void pathInPut() { //method to take the input file path from the user 
		System.out.println("enter the File path: ");
		Scanner scan = new Scanner(System.in);
		path = scan.nextLine();
		scan.close();
		
	}
	public boolean doesFileExist(String path1) {
		path1 = path;
		pathInPut();
		
		file = new File(path);
		if (path.equalsIgnoreCase(filePath) || path.equalsIgnoreCase(filePath2)) {
			System.out.println(path + " this file path exist");
			}
		else { 
					System.out.println(path + ":this path does not exist");
					
			
			}
		//System.out.println(file.exists());
		return file.exists();
		
	}

	public void fileReader(String path) { //the method to read the file located at the file path provided by the user

			try {
				Scanner reader = new Scanner(file);
				while (reader.hasNextLine()) {
					String line = reader.nextLine();
					String[] parts = line.split("-");
					String word = parts[0];
					String[] meaning = parts[1].split(",");
					System.out.println(word);
					for (String meanings : meaning) {
						System.out.println(meanings);
					
					}

				}	
				reader.close();	
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

		}

	
}
