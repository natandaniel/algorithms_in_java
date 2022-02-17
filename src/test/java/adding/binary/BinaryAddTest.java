package adding.binary;

import org.junit.Assert;
import org.junit.Test;

public class BinaryAddTest {

	@Test
	public void Given_10InBinary_When_BinaryAdding10With10_Then_ShouldReturn20InBinaryFormat() {
		int[] a = new int[] { 1, 0, 1, 0 }; // 10 in decimal

		int[] sum = BinaryAdd.add(a, a, 4); // 20 in decimal

		Assert.assertEquals(5, sum.length);
		Assert.assertEquals(1, sum[0]);
		Assert.assertEquals(0, sum[1]);
		Assert.assertEquals(1, sum[2]);
		Assert.assertEquals(0, sum[3]);
		Assert.assertEquals(0, sum[4]);
	}

}
