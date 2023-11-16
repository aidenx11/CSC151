

import java.util.Scanner;

/**
 * Class was renamed due to compatibility issues with my GitHub
 */
public class StackTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyStack stack = new MyStack();

		for (int i = 0; i < 5; i++)
			stack.push(input.nextLine());
		System.out.println(stack.getSize() + " strings are: ");
		while (!stack.isEmpty())
			System.out.println(stack.pop());

		input.close();
	}
}
