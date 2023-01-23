package csvsplitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import csvsplitter.CSVSplitterApp;

public class ArraySplitter {

	

//	
	public Map<String, ArrayList<Student>> splitStudentsByDivider(Student[] students) 
	{
	    Map<String, ArrayList<Student>> dividerStudents = new HashMap<>();
	    for (Student student : students) {
	        String divider = student.getDivider();
	        //Add the student to the existing array for their divider.
	        if (!dividerStudents.containsKey(divider)) {
	            dividerStudents.put(divider, new ArrayList<Student>());
	        }
	        dividerStudents.get(divider).add(student);
	    }
	    return dividerStudents;
	}


  
}

	
	

