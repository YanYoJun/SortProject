package Main;

public class Utils {
	public static boolean equals(int[] a, int[] b) {
		if (a == null && b == null) {
			return true;
		}
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void println(int[] a) {
		if (a == null) {
			System.out.println("null");
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}

}
