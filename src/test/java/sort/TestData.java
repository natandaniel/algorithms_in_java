package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestData {
  public static final double[] INPUT = new Random().doubles(-500, 500).limit(50000).toArray();
  public static final double[] INPUT_IN_ASCENDING_ORDER = Arrays.stream(INPUT).sorted().toArray();
  public static final double[] INPUT_IN_DESCENDING_ORDER = Arrays.stream(INPUT).boxed().sorted(Collections.reverseOrder()).mapToDouble(d -> d).toArray();
}
