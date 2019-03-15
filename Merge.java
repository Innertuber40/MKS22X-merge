public class Merge {
	public static void mergesort(int[] data) {
		int[] fraud = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			fraud[i] = data[i];
		}
		for (int i = 0; i < fraud.length; i++) {
			System.out.print(fraud[i] + " ");
		}
	}
}
