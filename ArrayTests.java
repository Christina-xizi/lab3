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
  public void testReverseInPlace2() {
    int[] input2 = { 3, 6, 5, 2 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 2, 5, 6, 3 }, input2);
  }
	
}
