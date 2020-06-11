/*
 *  Author:       Adrian E. Berdecia
 *  Date:         6/2/2020
 *  Description:  This program utilizes the course class in a 3 element
 *				  array to populate the course number, name and credit
 *				  hours.
 *
 */
import java.util.*;

public class homeWork3Class {

	public static final Scanner console = new Scanner(System.in);

	/* This is the total number of courses the user will enter. */
	static final int maxCourses = 3;

	public static void main(String[] args) {
		/*
		 * These variables will be used to populate the course number,
		 * name and credit hours.
		 */
		String  tempString;
		int 	tempInt;

		/* Initializing the array using courseClass. */
		courseClass[] courseObjects;
		courseObjects = new courseClass[maxCourses];

		/*
		 * This loop is used to populate the 3 elements in the
		 * array using the corresponding set functions in the
		 * Mutator Methods.
		 */
		for (int counter = 0; counter < maxCourses; counter++) {

			/*
			 * Need to initialize each element individually in the
			 * array.
			 */
			courseObjects[counter] = new courseClass();

			System.out.print("Enter Course Number [" + (counter + 1)
							 + "]: ");
			tempString = console.nextLine();
			courseObjects[counter].setCourseNumber(tempString);

			System.out.print("Enter Course Name [" + (counter + 1)
						     + "]: ");
			tempString = console.nextLine();
			courseObjects[counter].setCourseName(tempString);

			/*
			 * Making sure that the input is an integer. Otherwise
			 * course hours will default to zero per the class
			 * definition.
			 */
			System.out.print("Enter Course Credit Hours [" + (counter + 1)
							 + "]: ");
			if (console.hasNextInt()) {
				tempString = console.nextLine();
				tempInt = Integer.parseInt(tempString);
				courseObjects[counter].setCourseCreditHours(tempInt);
			}else{
				System.out.println("Is not a number....");
				console.nextLine();
			}
		}

		/*
		 *  Using the toString function in the course class to print the
		 *  course number, name and credit hours.
		 */
		for (int counter = 0; counter < maxCourses; counter++) {
			System.out.println(courseObjects[counter].toString());
		}
	}
}
