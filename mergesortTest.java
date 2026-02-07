import org.junit.Test;
import static org.junit.Assert.*;
public class mergesortTest {

    // Test cases for the merge method in mergesort class, 
    // Testing two non-empty sorted arrays
    @Test
    public void testMerge_BothArraysNonEmpty() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }

    // Testing one empty array and one non-empty sorted array
    @Test
    public void testMerge_OneArrayEmpty() {
        int[] a = {};
        int[] b = {2, 4, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }
    // Testing both arrays that are empty
    @Test
    public void testMerge_BothArraysEmpty() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        assertArrayEquals(expected, mergesort.merge(a, b));
    }
    
    // Testing null input for the first array, expecting an IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testMerge_NullArray() {
        int[] a = null;
        int[] b = {2, 4, 6};
        mergesort.merge(a, b);
    }

}
