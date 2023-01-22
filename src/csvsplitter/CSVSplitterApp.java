package csvsplitter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

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
    
//	ArraySplitter arraySplitter = new ArraySplitter();
//	arraySplitter.
		
		
		

System.out.println("pause at end");
System.out.println("pause at end");
System.out.println("pause at end");


	}


}
		    
		

		
		
		
		
		

