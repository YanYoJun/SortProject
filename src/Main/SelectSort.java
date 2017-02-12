package Main;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		SelectSort sort = new SelectSort();
		sort.testSelectSort_1();
		sort.testSelectSort_2();
		sort.testSelectSort_3();
		System.out.print("choose sort over");
	}

	/**
	 * —°‘Ò≈≈–Ú∑®
	 * @param arrays
	 */
	public void selectSort(int[] arrays) {
		if (arrays == null || arrays.length == 0) {
			return;
		}
		for (int i = 0; i < arrays.length; i++) {
			int maxLoc = arrays.length - i - 1;
			for (int j = 0; j < arrays.length - i - 1; j++) {
				if (arrays[j] > arrays[maxLoc]) {
					maxLoc = j;
				}
			}
			int temp = arrays[arrays.length - i - 1];
			arrays[arrays.length - i - 1] = arrays[maxLoc];
			arrays[maxLoc] = temp;
		}
	}

	/**
	 * ≤‚ ‘”√¿˝1
	 */
	public void testSelectSort_1() {
		int[] arrays = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
		int[] copy = Arrays.copyOf(arrays, arrays.length);
		selectSort(arrays);
		Utils.println(arrays);
		assert (Utils.equals(arrays, copy));
	}

	/**
	 * ≤‚ ‘”√¿˝2
	 */
	public void testSelectSort_2() {
		int[] arrays = { 234, -1, 8, 9, -3, 0, 7, 12, 8 };
		int[] copy = { -3, -1, 0, 7, 8, 8, 9, 12, 234 };
		selectSort(arrays);
		Utils.println(arrays);
		assert (Utils.equals(arrays, copy));
	}

	/**
	 * ≤‚ ‘”√¿˝3
	 */
	public void testSelectSort_3() {
		int[] arrays = null;
		selectSort(arrays);
		assert (Utils.equals(arrays, null));
	}

}
