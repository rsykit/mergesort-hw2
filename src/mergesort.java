public class mergesort {
    /**
     * Merge two sorted int arrays into a new sorted array.
     * Both input arrays must be non-null and sorted in non-decreasing order.
     *
     * @param a first sorted array
     * @param b second sorted array
     * @return new sorted array containing all elements from a and b
     * @throws IllegalArgumentException if a or b is null
     */
    public static int[] merge(int[] a, int[] b) {
        // Validate input
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input arrays must not be null");
        }

        // Create a new array to hold the merged result
        int[] result = new int[a.length + b.length];

        //Initialize three pointers: i for array a, j for array b, and k for the result array.
        int i = 0, j = 0, k = 0;

        //while both arrays have elements left to compare,
        while (i < a.length && j < b.length) 
        {
            // compare the current elements and add the smaller one to result
            if (a[i] <= b[j]) 
            {
                // then move the corresponding index forward
                result[k++] = a[i++];
            } 
            //otherwise, add the current element from b to result and move the index for b forward
            else 
            {
                result[k++] = b[j++];
            }
        }
        // Add remaining elements from a, if any
        while (i < a.length) result[k++] = a[i++];
        // Add remaining elements from b, if any
        while (j < b.length) result[k++] = b[j++];

        return result;
    }
}