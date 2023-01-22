package csvsplitter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;

public class CSVSplitterApp 
{
	
	public static Student[] students;

	public static void main(String[] args) 
	{
	
			CSVSplitterApp launch = new CSVSplitterApp();
			System.out.println("app launching");
//			Go to non-static Heaven.
			
			launch.csvSplitterOrchestrator();
			
//			((ReadingCSV) launch).readCSV();
//			don't know why I want to do casting here. So, I'll just do what I know instead.
					
			

//			
				
		
	}

	public void csvSplitterOrchestrator() 
	{
		// TODO from here write the entire program logic as explained in 
//		obsidian://open?vault=PersonalWiki&file=1.%20Projects%2FCodersCampus%20Java%20Mastery%2FAssignment%204%20-%20Split%20CSV%20file%20on%20criteria%2FAssignment%204
		
//		Load CSV file into Array in memory.
//		instantiate the class that holds the method
				
		ReadingCSV readingCSV = new ReadingCSV();
		
			

//		Student[] students = null;
//		Variable is now declared 'globally' at the start.
				
		try {
			students = readingCSV.readCSV();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
//		System.out.println(Arrays.toString(students));
// TODO: when the project is finished , remove this redundant print function.
		
		
//		Sorter | Sort by grade in descending order. 
		
//		System.out.println("a student" + students[1]);
		
		SortingStudentsByGrade sortingStudentsByGrade = new SortingStudentsByGrade();
		
		sortingStudentsByGrade.sortStudents(students);
		
//		System.out.println("a student" + students[1]);
		
				

//    ArraySplitter	| split to 3 arrays on criteria (classroom).
    
		ArraySplitter arraySplitter = new ArraySplitter();
		Map<String, ArrayList<Student>> courseStudents = arraySplitter.splitStudentsByClass(students);

		System.out.println(courseStudents);
//		just so it doesn't complain about the unused variable. TODO: to delete these two lines later.

//		TODO: write a unit test for the array splitter.
		
//		for (Map.Entry<String, ArrayList<Student>> entry : courseStudents.entrySet()) {
//		    String course = entry.getKey();
//		    ArrayList<Student> courseStudentList = entry.getValue();
//		    System.out.println(course + "Students: " + courseStudentList.size());
//		}

//		WritingSCV	output to 3 CSV files - this may be where I use Casting.
		

System.out.println("pause at end");
System.out.println("pause at end");
System.out.println("pause at end");


	}


}
		    
		

		
		
		
		
		

