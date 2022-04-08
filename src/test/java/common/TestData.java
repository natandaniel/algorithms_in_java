package common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestData {
  public static final double[] INPUT_5K_NUMBERS = new Random().doubles(-500, 500).limit(5000).toArray();
  public static final double[] INPUT_5K_NUMBERS_ASCENDING = Arrays.stream(INPUT_5K_NUMBERS).sorted().toArray();
  public static final double[] INPUT_5K_NUMBERS_DESCENDING = Arrays.stream(INPUT_5K_NUMBERS).boxed().sorted(Collections.reverseOrder()).mapToDouble(d -> d).toArray();
}
