public class BinarySearch {

    /**
     * This class should not be instantiated
     */
    private BinarySearch() { }

    /**
     * Returns the index of the specified key in the specified array
     *
     * @param   a the array of integers, must be sorted in ascending array
     * @param   key the search key
     * @return  index of key in array 'a' if present;
     *          -1 otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) { // Key is in first half or not present
                hi = mid - 1;
            } else if (key > a[mid]) { // Key is in second half or not present
                lo = mid + 1;
            } else return mid;
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Generate an array of ints
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        // Let's see if it works
        int shouldBe1 = indexOf(a, 1);
        int shouldBe5 = indexOf(a, 5);
        int shouldBeMinus1 = indexOf(a, 11);

        System.out.println("Value of shouldBe1 : " + shouldBe1 + "\nValue of shouldBe5 : " + shouldBe5 + "\nValue of shouldBeMinus1 : " + shouldBeMinus1);
    }
}
