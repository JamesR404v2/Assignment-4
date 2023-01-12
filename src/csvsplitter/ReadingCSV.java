package csvsplitter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import csvsplitter.*;
// I think this is redundant, because we already specified this file is also in the same csvsplitter package.

public class ReadingCSV 
{
// previously I had made this an Abstract Class, however I see no reason why this should be an Abstract Class. We are only going to read the file once. Right? For now, modifying this to be a normal Class.
	
	

	
	

	public String[] readCSV()
	{
			String[] array = new String[] {"bla", "blurp", "blguh"};
			
//			TODO: Now uncomment the below and get it to output the file into the array and test printing that.
//			
//	
//
//				public Student[] getStudentsArray() throws IOException
//				{
//					Student[] students = new Student[9];
//						
//					BufferedReader bufferedReader = null;
//					try
//					{
//						bufferedReader = new BufferedReader(new FileReader("student-master-list.csv"));
//						String row;
//						int counter = 0;
//						while ((row = BufferedReader.readLine()) != null)
//						{
//							Student[counter] = new Student(row.split(","));
////							counter = counter + 1;
////							++counter should do the same, with less code.
//							++counter;
//						}
//					} finally
//					{
//						if (bufferedReader != null)
//							bufferedReader.close();
//					}
//					return students;
//					
//				}
		
			return array;

	}

}


