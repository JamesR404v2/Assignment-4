package csvsplitter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CSVFileWriter 
{
	public void csvFileWriting(Map<String, ArrayList<Student>> courseStudents)
	{
		BufferedWriter writer = null;
		
//		TODO: before the loop I can write a file header to each file.
		
//		use a for loop to cover all students in the entire Map.
        for (Map.Entry<String, ArrayList<Student>> entry : courseStudents.entrySet()) 
        {
            String course = entry.getKey();
            // Get the list of students for the current course
            ArrayList<Student> students = entry.getValue();
//          use try for safety while writing files. (in case of write errors).
//          start writing a file for the given course.
            try (FileWriter fw = new FileWriter(course + ".csv");
            	// Wrap the FileWriter in a BufferedWriter for better performance
                 BufferedWriter bw = new BufferedWriter(fw)) {
            	
            	// Add the header row to the file
                bw.write("Student ID,Student Name,Course,Grade");
                bw.newLine();
            	
            	// Iterate over the students in the current course
                for (Student student : students) {
                	 // Write the student's name and grade to the file, separated by a comma
                    bw.write(student.getStudentID()+ "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade());
                    // Add a new line after each student to separate them
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                // If there is an error writing to the file, print the stack trace
            }
		
		
		
				
		
        }
	}
	
}	
