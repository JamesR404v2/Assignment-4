package csvsplitter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;

public class CSVSplitterApp 
{
	
//	declare student variable here, so it is available throughout the program.
	public static Student[] students;

	public static void main(String[] args) 
	{
	
			CSVSplitterApp launch = new CSVSplitterApp();
			System.out.println("Going to read the student file and write one file per courseName");
//			Go to non-static Heaven.
			
			launch.csvSplitterOrchestrator();

	}

	public void csvSplitterOrchestrator() 
	{

//		Load CSV file into Array in memory.
//		instantiate the class that holds the method
				
		ReadingCSV readingCSV = new ReadingCSV();
		
			
		try {
			students = readingCSV.readCSV();
		} catch (IOException e) {
			e.printStackTrace();
		}

		

//		Sorter | Sort by grade in descending order. 
			
		SortingStudentsByGrade sortingStudentsByGrade = new SortingStudentsByGrade();
		sortingStudentsByGrade.sortStudents(students);
		

//    ArraySplitter	| split to 3 arrays on criteria (courseName).
    
		ArraySplitter arraySplitter = new ArraySplitter();
		Map<String, ArrayList<Student>> courseStudents = arraySplitter.splitStudentsByDivider(students);
		


//		TODO: write a unit test for the array splitter.
		
//		WritingSCV	output to 3 CSV files. (one file per courseName).
		
		CSVFileWriter csvFileWriter = new CSVFileWriter();
		csvFileWriter.csvFileWriting(courseStudents);

		
		System.out.println("Student files written OK");



	}




}
		    
		

		
		
		
		
		

