import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseOdd() {
    int[] input1 = {1,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 1 }, input1);
  }


  @Test
  public void testReversedEven() {
    int[] input1 = {1,4,6,8};
    assertArrayEquals(new int[]{8,6,4,1}, ArrayExamples.reversed(input1));
  }

@Test
  public void testReverseInPlace() {
    int[] input = { 4, 7, 12, 22 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] { 22, 12, 7, 4 }, input);
  }
}
