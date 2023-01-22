package test.java;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


import csvsplitter.ReadingCSV;
import csvsplitter.Student;

import org.junit.*;
@SuppressWarnings("unused")
// can try taking out when the junit test works.

public class ReadingCSVTest {

    @Test
    public void testReadCSV() throws Exception {
        ReadingCSV readingCSV = new ReadingCSV();
        Student[] students = readingCSV.readCSV();
        assertNotNull(students); // confirm that the array is not null
        assertTrue(students.length > 0); // confirm that at least one element is present in the array
        assertNotNull(students[0]); // confirm that the first element is not null (at least one student POJO created)
    }
}
