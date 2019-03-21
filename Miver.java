public class Miver {
	public static void main(String[] args) {
		int[] test1 = new int[] {0, 1, 1, 5, -3, -6, -3, 4, 8, 2343, 555555, -55555, -47, 1};
		Merge.mergesort(test1);
		for (int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
	}
}