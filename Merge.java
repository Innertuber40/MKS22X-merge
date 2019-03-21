public class Merge {
	public static void mergesort(int[] data) {
		int[] fraud = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			fraud[i] = data[i];
		}
		/*for (int i = 0; i < fraud.length; i++) {
			System.out.print(fraud[i] + " ");
		}*/
		merge(data, fraud, 0, data.length - 1);
	}
	private static void merge(int[] data, int[] fraud, int low, int high) {
		if (high - low >= 10) {
			for (int i = 1; i < data.length; i++) {                         // check each value only once      
				int j = i;
				int toInsert = data[j];                                     // save the value we are swapping back
				while (j > 0 && data[j - 1] > toInsert) {                   // occurs until the end or a smaller element
					data[j] = data[j - 1];                                // shift up
					j--;                                                      // move on to the next pair
				}
				data[j] = toInsert;
			}
			return;
		}
		/*for (int i = 0; i < fraud.length; i++) {
			System.out.print(fraud[i] + " ");
		}*/
		int breaker = (high - low) / 2 + low;
		merge(fraud, data, low, breaker);
		merge(fraud, data, breaker + 1, high);
		for (int i = low; i < high; i++) {
			data[i] = fraud[i];
		}
	}
}
