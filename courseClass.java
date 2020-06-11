/*
 *  Author:       Adrian E. Berdecia
 *  Date:         6/10/2020
 *  Description:  This is a class that will be used to record the
 *                course number, name and credit hours.
 */
public class courseClass {
	String courseNumber;
	String courseName;
	int courseCreditHours;

	/* Accessor methods for variables */
	public String getCourseNumber () {
		return this.courseNumber;
	}

	public String getCourseName () {
		return this.courseName;
	}

	public int getCourseCreditHours () {
		return this.courseCreditHours;
	}

	/* Mutator methods for variables */
	public void setCourseNumber (String newCourseNumber) {
		this.courseNumber = newCourseNumber;
	}

	public void setCourseName (String newCourseName) {
		this.courseName = newCourseName;
	}

	public void setCourseCreditHours (int newCourseCreditHours) {
		this.courseCreditHours = newCourseCreditHours;
	}

	/* Constructors for variables */
	public courseClass () {
		this.courseNumber = "N/A";
		this.courseName = "N/A";
		this.courseCreditHours = 0;
	}

	/* To String Method */
	public String toString() {
	    return "Course Number: " + this.courseNumber
			+ ", Course Name: " + this.courseName
			+ ", Course Credit Hours: "
			+ this.courseCreditHours;
	}
}