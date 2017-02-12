package Main;

import java.util.Arrays;

public class BubbleSort {
	/**
	 * √∞≈›≈≈–ÚÀ„∑®£¨¥”–°µΩ¥Û≈≈–Ú
	 * @param arrays
	 */
	private void bubbleSort(int[] arrays) {
		if (arrays == null || arrays.length == 0) {
			return;
		}
		boolean flag = false;
		for (int i = 0; i < arrays.length; i++) {
			flag = false;
			for (int j = 0; j < arrays.length - i - 1; j++) {
				if (arrays[j] > arrays[j + 1]) {
					int a = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = a;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

	/**
	 * ≤‚ ‘”√¿˝1
	 */
	private void testBubbleSort_1() {
		int[] arrays = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
		int[] copy = Arrays.copyOf(arrays, arrays.length);
		bubbleSort(arrays);
		Utils.println(arrays);
		assert (Utils.equals(arrays, copy));
	}

	/**
	 * ≤‚ ‘”√¿˝2
	 */
	private void testBubbleSort_2() { 	
		int[] arrays = { 234, -1, 8, 9, -3, 0, 7, 12, 8 };
		int[] copy = { -3, -1, 0, 7, 8, 8, 9, 12, 234 };
		bubbleSort(arrays);
		Utils.println(arrays);
		assert (Utils.equals(arrays, copy));
	}

	/**
	 * ≤‚ ‘”√¿˝3
	 */
	private void testBubbleSort_3() {
		int[] arrays = null;
		bubbleSort(arrays);
		assert (Utils.equals(arrays, null));
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		sort.testBubbleSort_1();
		sort.testBubbleSort_2();
		sort.testBubbleSort_3();
		System.out.println("over");
	}

}
