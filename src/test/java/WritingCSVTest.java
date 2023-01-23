package test.java;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.Test;

import csvsplitter.ArraySplitter;
import csvsplitter.CSVFileWriter;
import csvsplitter.Student;

public class WritingCSVTest {

    @Test
    public void testWriteToCSV() {
        // Prepare test data
        Student student1 = new Student("1", "John Smith", "Math 101", "78");
        Student student2 = new Student("2", "Jane Doe", "Math 101", "45");
        Student student3 = new Student("3", "Bob Johnson", "Science 101", "1337");
        Student[] students = new Student[] { student1, student2, student3 };
        ArraySplitter arraysplitter = new ArraySplitter();
        Map<String, ArrayList<Student>> courseStudents = arraysplitter.splitStudentsByDivider(students);


       
		// Call the method to be tested
        CSVFileWriter csvFileWriter = new CSVFileWriter();
        csvFileWriter.csvFileWriting(courseStudents);

        // Check that the files were created
        File mathFile = new File("Math.csv");
        File scienceFile = new File("Science.csv");
        assertTrue(mathFile.exists());
        assertTrue(scienceFile.exists());

        // Clean up test files
        mathFile.delete();
        scienceFile.delete();
    }
}
