package csvsplitter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import csvsplitter.*;
// I think this is redundant, because we already specified this file is also in the same csvsplitter package.

import csvsplitter.Student;
// to ensure the POJO class Student is available for use. 
// TODO: when the ReadingCSV function works correctly, I can comment out the import of the Student POJO to see if it is still available or not.

public class ReadingCSV 
{

//			String[] array = new String[] {"bla", "blurp", "blguh"};
//			the above works to populate an array with the above data.


//	troubleshoot the reading of the file into the array (Right now the array is populated with null null null??) 
//	Or does it mean, that the array is populated and the variable name is just null? I would try to print one student.
//	TODO: Test printing one student to see if the array is populated OK.

	public Student[] readCSV() throws IOException
	{
					BufferedReader bufferedReader = null;
					Student[] students = null;
//					Student[] students = new Student[9];
//						This is creating an array, so I can use it later, but - it is not needed??? let me try...
//					needed to create the POJO? Already there, tried to import it to see if it helps.
						

					try
					{
						bufferedReader = new BufferedReader(new FileReader("student-master-list.csv"));
						String row;
						int counter = 0;
					    bufferedReader.readLine(); // this will skip the first line
						while ((row = bufferedReader.readLine()) != null)
							{
								++counter;
							}
//						This will create the Array that matches the size of the file we want to add to the array (skipping the first header line)
						students = new Student[counter];
						bufferedReader = new BufferedReader(new FileReader("student-master-list.csv"));
				        counter = 0;
				        bufferedReader.readLine(); // this will skip the first line
				        while ((row = bufferedReader.readLine()) != null) {
				            String[] values = row.split(",");
				            students[counter++] = new Student(values[0], values[1], values[2], values[3]);
				        }
//				        This populates the Array with all the lines in the file, skipping the first header line.
					} catch (FileNotFoundException e) {
						System.out.println("The file student-master-list.csv is not found.");
						e.printStackTrace();					
					} catch (IOException e) {
					        e.printStackTrace();
					} finally
					{
						if (bufferedReader != null)
							bufferedReader.close();
					}
					System.out.println(students[3].toString());
					return students;
					
				
					
					
	}
		


}





