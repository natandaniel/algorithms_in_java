package adding.binary;

public class BinaryAdd {

	private BinaryAdd() {
	}

	public static int[] add(int[] a, int[] b, int n) {
		if (a == null || a.length != n || b == null || b.length != n)
			throw new IllegalArgumentException("unexpected input");

		int[] sum = new int[n + 1];

		int carry = 0;
		for (int i = n - 1; 0 <= i; i--) {
			int s = a[i] + b[i] + carry;

			if (s == 3) {
				carry = 1;
				sum[i + 1] = 1;
			} else if (s == 2) {
				carry = 1;
				sum[i + 1] = 0;
			} else if (s == 1 || s == 0) {
				carry = 0;
				sum[i + 1] = s;
			} else
				throw new IllegalArgumentException("wrong input : values must be 1 or 0; found values " + a[i] + " and "
						+ b[i] + " at index " + i);
		}

		sum[0] = carry;

		return sum;
	}

}
