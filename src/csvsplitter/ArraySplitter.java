package csvsplitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import csvsplitter.CSVSplitterApp;

public class ArraySplitter 
{
	Map<String, ArrayList<Student>> courseStudents = splitStudentsByCourse(CSVSplitterApp.students);
	        for (Map.Entry<String, ArrayList<Student>> entry : courseStudents.entrySet()) {
	            String course = entry.getKey();
	            ArrayList<Student> courseStudentList = entry.getValue();
	            System.out.println(course + "Students: " + courseStudentList.size());
	        }
	    

	    public static Map<String, ArrayList<Student>> splitStudentsByCourse(Student[] students) {
	        Map<String, ArrayList<Student>> courseStudents = new HashMap<>();
	        for (Student student : students) {
	            String course = student.getCourse();
//	            This will add the student to the existing array for their course.
//	            If no array exists yet for that course, we'll create the array.
	            if (!courseStudents.containsKey(course)) {
	                courseStudents.put(course, new ArrayList<Student>());
	            }
	            courseStudents.get(course).add(student);
	        }
	        return courseStudents;
	    }
}

	
	

