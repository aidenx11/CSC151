//package was removed to allow program to run independently

/**
 * Program to calculate weighted grade in CSC151
 * 
 * @author schroeder
 */
import java.util.Scanner;
public class GradeCalculator {
	
	/**
	 * Starts program, asks for section grades, then calculates and prints final grade
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		/**
		 * Creates a Scanner object named input
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Prompts user to enter grades/averages as percentages and stores them as integer variables
		 */
		System.out.println("Enter Labs average in percent, e.g. 95: ");
		int labsGrade = input.nextInt();
		System.out.println("Enter Reading Quizzes average in percent: ");
		int quizzesGrade = input.nextInt();
		System.out.println("Enter REVEL average in percent: ");
		int revelGrade = input.nextInt();
		System.out.println("Enter Midterm grade in percent: ");
		int midtermGrade = input.nextInt();
		System.out.println("Enter Projects average in percent: ");
		int projectsGrade = input.nextInt();
		System.out.println("Enter Final Exam grade in percent: ");
		int finalExamGrade = input.nextInt();
		
		/**
		 * Converts grade value integers to weighted averages and stores as doubles
		 * This step and the previous step could be combined, but are left separate for clarity
		 */
		double labsGradeWeighted = (labsGrade * 0.20);
		double quizzesGradeWeighted = (quizzesGrade * 0.10);
		double revelGradeWeighted = (revelGrade * 0.15);
		double midtermGradeWeighted = (midtermGrade * 0.20);
		double projectsGradeWeighted = (projectsGrade * 0.15);
		double finalExamGradeWeighted = (finalExamGrade * 0.20);
		
		/**
		 * Combines weighted grades and rounds to two decimals
		 */
		double finalGrade = (labsGradeWeighted + quizzesGradeWeighted + revelGradeWeighted + midtermGradeWeighted + projectsGradeWeighted + finalExamGradeWeighted);
		finalGrade = finalGrade * 100 / 100;
		
		/**
		 * Displays result
		 */
		System.out.println("Your weighted average (rounded to two decimals) is " + finalGrade + "%.");
		
		/**
		 * Closes the Scanner object named input
		 */
		input.close();
	}
}
