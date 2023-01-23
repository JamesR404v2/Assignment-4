package csvsplitter;

public class Student 
{
	
	private String studentName;
	private int studentID;
	private String course;
	private int grade;
	String stringStudentID;
	String stringGrade;
	String courseName;
	
	
	public Student(String stringStudentID, String studentName, String course, String stringGrade) 
		{
//		from the input, first and last field to be converted to int.
		
			this.studentID = Integer.parseInt(stringStudentID);
			this.studentName = studentName;
			this.course = course;			
			this.grade = Integer.parseInt(stringGrade);
			
//			add Divider based on Course. (tempted to call it Class, but that'll be too confusing)
			// Extract the first word of the course name
	        int index = course.indexOf(" ");
	        String courseName = course.substring(0, index);
	        // Set the divider to the student's object
	        this.courseName = courseName;
			
			
		}
		
		




	String getStudentName() {
		return studentName;
	}
	void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	int getStudentID() {
		return studentID;
	}
	void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	String getCourse() {
		return course;
	}
	void setCourse(String course) {
		this.course = course;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}

	void setDivider(String divider)
	{
	this.courseName = divider;
	}
	
	String getDivider()
	{
		return courseName; 
	}
	
	
}
