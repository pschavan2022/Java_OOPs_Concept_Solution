package Arrays_in_Java;

public class Array_sort {

	public static void main(String[] args) {

		int[] index = new int[] { 23, 65, 1, 8, 99, 56 };

		// System.out.println(index[4]);

		int length = index.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (index[i] < index[j]) {
					int temp = index[j];
					index[j] = index[i];
					index[i] = temp;
				}
			}

			System.out.println(index[i]);
		}

	}

}
