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
		if (low >= high) {
			return;
		}
		int breaker = (high - low) / 2;
		merge(fraud, data, low, breaker);
		merge(fraud, data, breaker + 1, high);
	}
}
