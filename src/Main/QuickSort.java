package Main;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		sort.testQuickSort_1();
		sort.testQuickSort_2();
		sort.testQuickSort_3();
		
		System.out.println("quick sort test over");
	}

	/**
	 * 快速排序法
	 * @param args
	 * @param start
	 * @param end
	 */
	public void quickSort(int[] args, int start, int end) {
		if (args == null || args.length < end + 1) {
			return;
		}
		if (start >= end) {
			return;
		}
		int mid = args[end];
		int left = start;
		int right = end - 1;
		while (left < right) {
			while (args[left] < mid && left < right) {
				left++;
			}
			while (args[right] >= mid && left < right) {
				right--;
			}
			Utils.swap(args, left, right);
		}
		if (args[left] > mid) {
			Utils.swap(args, left, end);
		}
		quickSort(args, start, left);
		quickSort(args, left + 1, end);
	}

	/**
	 * 测试用例1
	 */
	public void testQuickSort_1() {
		int[] arrays = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
		int[] copy = Arrays.copyOf(arrays, arrays.length);
		quickSort(arrays, 0, arrays.length - 1);
		Utils.println(arrays);
		assert (Utils.equals(arrays, copy));
	}

	public void testQuickSort_2() {
		int[] arrays = { 234, -1, 8, 9, -3, 0, 7, 12, 8 };
		int[] copy = { -3, -1, 0, 7, 8, 8, 9, 12, 234 };
		quickSort(arrays, 0, arrays.length - 1);
		Utils.println(arrays);
		assert (Utils.equals(arrays, copy));
	}

	public void testQuickSort_3() {
		int[] arrays = null;
		quickSort(arrays, 0, 0);
		assert (Utils.equals(arrays, null));
	}

}
