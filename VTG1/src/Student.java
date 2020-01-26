public class Student {

	private String studentID;
	private String firstName;
	private String lastName;
	private String eMail;
	private int studentAge;
	private int[] grades;

	// Constructor Method//
	public Student(String studentID, String firstName, String lastName, String eMail, int studentAge, int[] grades) {
		setstudentID(studentID);
		setfirstName(firstName);
		setlastName(lastName);
		seteMail(eMail);
		setstudentAge(studentAge);
		setgrades(grades);
	}

	// Assessor Methods (getter methods)//
	// Mutator Methods (setter methods)//
	public String getstudentID() {
		return studentID;
	}

	public void setstudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getstudentAge() {
		return studentAge;
	}

	public void setstudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int[] getgrades() {
		return grades;
	}

	public void setgrades(int[] grades) {
		this.grades = grades;
	}

	// Print Method. Prints full Student Roster using assessor.//
	// Please note that tabs "\t" could not be used due to my short email address.//
	public void print() {
		System.out.printf("StudentID: %-3s", getstudentID());
		System.out.printf("First Name: %-9s", getfirstName());
		System.out.printf("Last Name: %-10s", getlastName());
		System.out.printf("E-mail: %-24s", geteMail());
		System.out.printf("Student Age: %-15s\n", getstudentAge());
	}
}
