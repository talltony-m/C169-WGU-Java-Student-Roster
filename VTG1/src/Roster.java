//* This program creates an arraylist of students in a Roster.*//
//* The program prints the full Roster, checks for invalid e-mails and prints them,*//
//* averages each students grades and prints them*//
//*removes one student by student ID and prints a statement the second time when*//
//* that same student is not found prints the results.*//

//This program is the completion of the Performance Assessment for WGU C-169//
//@author Anthony Martin WGU Student ID:782327 5 March 2018//

import java.util.ListIterator;
import java.util.ArrayList;

public class Roster {
	private static ArrayList<Student> Roster = new ArrayList<>();

	// Student information to be added to the array list//
	public static void main(String[] args) {
		add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
		add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
		add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
		add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
		add("5", "Anthony", "Martin", "amar446@wgu.edu", 50, 87, 92, 95);

		// prints entire array list//
		print_all();

		// prints only the invalid e-mails//
		print_invalad_emails();

		// loops through the ArrayList and for each element prints average grade//
		print_average_grade(null);

		// removes student ID 3 from the arraylist//
		remove("3");

		// expected: this should print a message saying no student with this ID was
		// found.//
		remove("3");
	}

	// Adds the student information into the arraylist//
	public static void add(String studentID, String firstName, String lastName, String eMail, int studentAge,
			int grades1, int grades2, int grades3) {
		int[] grades = { grades1, grades2, grades3 };
		Student newitem = new Student(studentID, firstName, lastName, eMail, studentAge, grades);
		Roster.add(newitem);
	}

	// prints the array list Roster//
	public static void print_all() {
		System.out.println("Student Roster");
		for (int i = 0; i < Roster.size(); i++) {
			Roster.get(i).print();
		}
	}

	// Checks for invalid e-mails and prints only the invalid ones.//
	public static void print_invalad_emails() {
		System.out.println("\nInvalid e-mails");
		for (Student eachitem : Roster) {
			if (eachitem.geteMail().contains(" ") || !eachitem.geteMail().contains("@")
					|| !eachitem.geteMail().contains(".")) {
				System.out.println(eachitem.geteMail());
			} else
				;
		}
	}

	// Averages each students grades and prints just the average.//
	public static void print_average_grade(String studentID) {
		System.out.println("\nAverage Grades");
		for (Student eachitem : Roster) {
			int average = ((eachitem.getgrades()[0] + eachitem.getgrades()[1] + eachitem.getgrades()[2]) / 3);
			System.out.println("Student ID: " + eachitem.getstudentID() + " Average Grade " + average);
		}
	}

	// Checks for student ID using the input parameter and removes it from the
	// arraylist.//
	public static void remove(String studentID) {
		ListIterator<Student> iter = Roster.listIterator();
		while (iter.hasNext()) {
			if (iter.next().getstudentID().equals(studentID)) {
				iter.remove();
				System.out.println("\nRemove\nStudent " + studentID + " has been deleted.\n");
				if (!iter.next().getstudentID().equals(studentID)) {
					System.out.println("Not Found\nNo Student with that ID found.");
				}

			}
		}
	}
}
