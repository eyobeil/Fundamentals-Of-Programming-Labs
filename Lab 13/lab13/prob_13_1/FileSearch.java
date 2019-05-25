package prob_13_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
//PSEUDO-CODE
boolean searchForFile(Object file, Object startDir) {
	Object[] fileSystemObjects =
						startDir.getContents();
	for(Object o: fileSystemObjects) {
		//base case
		if(isFile(o) && isSameFile(o,f)) {
			return true;
		}

		if(isDirectory(o)) {
			searchForFile(file, o);
		}
	}
	//file not found in startDir
	return false;
}
*/
public class FileSearch {
	static boolean found = false;
	//Store the text that is found in the
	//file that is found in this String variable
	static String discoveredText = null;
	
	public static void main(String[] args){
	   System.out.println(searchForFile("Customer.java","C:\\"));	
	}
	
	public static boolean searchForFile(String filename, String startDir) {
		File file = new File(filename);
		File startDirectory = new File(startDir);
		return searchForFile(file,startDirectory);	
	}
	
	static boolean searchForFile(File file, File startDir) {
		File[] fileSystemObjects =
							startDir.listFiles();
		boolean exists = false;
		int counter =0;
		while(!exists && counter < fileSystemObjects.length) {
			//base case
			if(fileSystemObjects[counter].isFile() && fileSystemObjects[counter].getName().equals(file.getName())) {
				exists =  true;
			}

			if(!exists && fileSystemObjects[counter].isDirectory()) {
				exists =  searchForFile(file, fileSystemObjects[counter]);
			}
			counter ++;
		}
		//file not found in startDir
		return exists;
	}
	
	

}
