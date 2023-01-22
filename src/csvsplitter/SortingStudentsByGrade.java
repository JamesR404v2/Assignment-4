package csvsplitter;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGrade
{


void sortStudents(Student[] students) 
		{
			Arrays.sort(students, new Comparator<Student>() 
	        {
	            @Override
	            public int compare(Student s1, Student s2) 
	            {
	                return s2.getGrade() - s1.getGrade();
//	                by swapping s2 & s1 we sort on descending order instead of ascending order.		            }
	                
	                
	            }
	        });
		}

}