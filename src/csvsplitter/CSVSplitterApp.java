package csvsplitter;

import java.util.Arrays;

public class CSVSplitterApp 
{

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

	public void csvSplitterOrchestrator() {
		// TODO from here write the entire program logic as explained in 
//		obsidian://open?vault=PersonalWiki&file=1.%20Projects%2FCodersCampus%20Java%20Mastery%2FAssignment%204%20-%20Split%20CSV%20file%20on%20criteria%2FAssignment%204
		
//		Load CSV file into Array in memory.
//		instantiate the class that holds the method
		


		
		ReadingCSV readingCSV = new ReadingCSV();
		
		String students;
		String[] studentsFromInputfile = readingCSV.readCSV();
//		so far I see csvsplitter.ReadingCSV@64f6106c
		
		System.out.println(Arrays.toString(studentsFromInputfile));
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}

}
