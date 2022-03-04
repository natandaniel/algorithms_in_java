package addition.binary;

class BinaryAddition {

  private BinaryAddition() {}

  public static int[] add(int[] a, int[] b) {
    if (a == null || b == null || a.length != b.length) throw new IllegalArgumentException("a and b must not be null and should contain the same amount of binary coefficients");

    int length = a.length;
    int[] result = new int[length + 1];

    for (int i = 0; i < length; i++) {
      int coeff = a[i] + b[i] + result[i];

      switch (coeff) {
        case 0: // result[i] necessarily contains 0
          break;
        case 1:
          result[i] = 1;
          break;
        case 2:
          result[i] = 0;
          result[i + 1] = 1;
          break;
        case 3:
          result[i + 1] = 1; // result[i] necessarily contains 1
          break;
        default:
          throw new IllegalArgumentException("unexpected coefficient value : " + coeff + "; a and b should contain 0 or 1 values only; read a[i] = " + a[i] + "; read b[i] = " + b[i]);
      }
    }

    return result;
  }

}
