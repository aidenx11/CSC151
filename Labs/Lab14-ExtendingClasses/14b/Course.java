import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}

	/**
	 * Convert students to an array and return the array
	 * @return students as a string array
	 */
	public String[] getStudents() {
		String[] studentsToReturn = new String[this.students.size()];
		for (int i = 0; i < this.students.size(); i++) {
			studentsToReturn[i] = students.get(i);
		}
		return studentsToReturn;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Exercise 9.9
	}
}
