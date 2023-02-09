package karenAssignment4;

public class Student implements Comparable <Student> {
	private int studentID;
	private String name;
	private String courseName;
	private int grade;

	public Student(int studentID, String name, String courseName, int grade) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.courseName = courseName;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", courseName=" + courseName + ", grade=" + grade
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public int compareTo(Student that) {
		
	if (that == null) {
		return 1;
		
	}
		if (this.grade > that.grade) {
			return 1;

		} else if (this.grade < that.grade) {
			return -1;
		}

		return 0;
	}

}
