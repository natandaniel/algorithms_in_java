package addition.binary;

import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

public class BinaryAdditionTest {

  @Test
  public void Given_10InBinaryFormat_When_Adding10toItselfInBinaryFormat_Then_ShouldGet20InBinaryFormat() {
    int[] a = new int[] { 0, 1, 0, 1 }; // 10 in decimal
    Assert.assertEquals(10, toBase10Format(a));

    int[] sum = BinaryAddition.add(a, a); // 20 in decimal
    Assert.assertEquals(20, toBase10Format(sum));
    Assert.assertEquals(5, sum.length);
    Assert.assertEquals(0, sum[0]);
    Assert.assertEquals(0, sum[1]);
    Assert.assertEquals(1, sum[2]);
    Assert.assertEquals(0, sum[3]);
    Assert.assertEquals(1, sum[4]);
  }

  private static int toBase10Format(int[] anIntegerInBinaryFormat) {
    Objects.requireNonNull(anIntegerInBinaryFormat);

    int result = 0;

    for (int i = 0; i < anIntegerInBinaryFormat.length; i++)
      result += anIntegerInBinaryFormat[i] * Math.pow(2, i);

    return result;
  }

}
