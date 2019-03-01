import java.util.*;

/**
 * Coding Exercise : 02 <br/>
 * Title : Super Stack Implementation
 * 
 * @author Dwarakesh T P
 *
 */

class SuperStack {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		int stackSize;

		do {
			System.out.println("Specify the size of stack (size should be > 0)");
			stackSize = in.nextInt();
		} while (stackSize <= 0);
		Stack stack = new Stack(stackSize);

		do {
			System.out.println("\n" + "Select the operation to be performed");
			System.out.println("1.Push" + "\n" + "2.Pop" + "\n" + "3.Increment stack elements");
			int option = in.nextInt();

			switch (option) {
			case 1:
				System.out.println("\n" + "Enter push value:");
				int pushValue = in.nextInt();
				stack.push(pushValue);
				System.out.println("\n" + "Do you want to continue?" + "\n" + "1.Yes" + "\n" + "2.No");
				break;

			case 2:
				stack.pop();
				System.out.println("\n" + "Do you want to continue?" + "\n" + "1.Yes" + "\n" + "2.No");
				break;

			case 3:
				System.out.println("\n" + "Enter number of bottom 'n' elements to increment");
				int numberOfElements = in.nextInt();
				System.out.println("Enter the increment value");
				int incrementValue = in.nextInt();
				stack.increment(numberOfElements, incrementValue);
				System.out.println("\n" + "Do you want to continue?" + "\n" + "1.Yes" + "\n" + "2.No");
				break;

			default:
				System.out.println("\n" + "Do you want to continue?" + "\n" + "1.Yes" + "\n" + "2.No");
				break;
			}
		} while (in.nextInt() == 1);
		in.close();
	}
}

class Stack {
	int top = -1;
	Object stack[];
	int stackSize;

	Stack(int size) {
		stack = new Object[size];
		stackSize = size;
	}

	public void push(int pushValue) {
		if (top < stackSize - 1) {
			stack[++top] = pushValue;
			System.out.println("TOP=" + stack[top]);
		} else {
			System.out.println("STACK FULL - INSERT FAILED");
		}
	}

	public void pop() {
		if (top >= 0) {
			System.out.println("TOP=" + stack[top]);
			stack[top] = null;
			top--;
		} else {
			System.out.println("STACK EMPTY");
		}
	}

	public void increment(int numberOfElements, int incrementValue) {
		for (int i = 0; i < numberOfElements && i <= top; i++) {
			if (stack[i] != null) {
				int val = (int) stack[i];
				val += incrementValue;
				stack[i] = val;
			}
		}
		if (top != -1) {
			System.out.println("TOP=" + stack[top]);
		} else {
			System.out.println("EMPTY");
		}
	}
}
