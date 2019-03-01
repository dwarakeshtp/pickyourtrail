import java.util.*;

/**
 * Coding Exercise : 03 <br/>
 * Title : Counting Pairs
 * 
 * @author Dwarakesh T P
 *
 */

class CountingPairs {

	public static void main(String[] args) throws java.lang.Exception {
		ArrayList<Pair> pairList = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int startPointer = 0;
		int loopPointer = startPointer + 1;
		int delta;
		int numberOfElements;

		do {
			System.out.println("Enter the number of input elements (>1) :");
			numberOfElements = in.nextInt();
		} while (numberOfElements <= 1);

		int[] inputElements = new int[numberOfElements];
		System.out.println("Enter the input elements one by one [Press Enter after keying each number]");
		for (int i = 0; i < numberOfElements; i++) {
			inputElements[i] = in.nextInt();
		}

		Arrays.sort(inputElements);
		System.out.println("Enter the delta value :");
		delta = in.nextInt();
		in.close();

		while (startPointer < numberOfElements - 1) {
			int a = inputElements[startPointer];
			int b = inputElements[loopPointer];
			if ((a + delta == b) && (a <= b)) {
				Pair p = new Pair(a, b);
				if (!pairList.contains(p))
					pairList.add(p);
			}
			if (loopPointer < numberOfElements - 1)
				loopPointer++;
			else {
				startPointer++;
				loopPointer = startPointer + 1;
			}
		}

		/* UnComment the block to print the pairs */

		// Iterator<Pair> iter = pairList.iterator();
		// while (iter.hasNext()) {
		// System.out.println(iter.next().toString());
		// }

		System.out.println("Result Pair Count=" + pairList.size());
	}
}

class Pair {

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	int x, y;

	Pair(int a, int b) {
		this.x = a;
		this.y = b;
	}
}