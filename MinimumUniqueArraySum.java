import java.util.*;

/**
 * Coding Exercise : 01 <br/>
 * Title : Minimum Unique Array Sum
 * 
 * @author Dwarakesh T P
 *
 */

class MinimumUniqueArraySum {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner in = new Scanner(System.in);
		int sum = 0;
		int numberOfElements;

		do {
			System.out.println("Enter the number of input elements (>0) :");
			numberOfElements = in.nextInt();
		} while (numberOfElements <= 0);

		int[] inputElements = new int[numberOfElements];
		System.out.println("Enter the input elements one by one [Press Enter after keying each number]");
		for (int i = 0; i < numberOfElements; i++) {
			inputElements[i] = in.nextInt();
		}
		in.close();

		Arrays.sort(inputElements);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numberOfElements; i++) {
			if (!list.contains(inputElements[i])) {
				list.add(inputElements[i]);
				sum += inputElements[i];
			} else {
				while (true) {
					if (list.contains(inputElements[i])) {
						inputElements[i]++;
					} else {
						list.add(inputElements[i]);
						sum += inputElements[i];
						break;
					}
				}
			}
		}
		System.out.println("Result=" + sum);
	}
}
