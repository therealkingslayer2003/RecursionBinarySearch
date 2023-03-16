import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    // Tests if the binary search algorithm returns the correct index for a key present in the array
    public void testBinarySearch() {
        int[] arr = {1, 3, 4, 6, 8, 9, 11};
        int key = 6;
        int expectedIndex = 3;

        int actualIndex = BinarySearch.binarySearch(arr, key);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    // Tests if the binary search algorithm returns -1 for a key not present in the array
    public void testBinarySearchKeyNotFound() {
        int[] arr = {1, 3, 4, 6, 8, 9, 11};
        int key = 5;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.binarySearch(arr, key);

        assertEquals(expectedIndex, actualIndex);
    }
    @Test
    //Test if the binary search algorithm when array is empty
    public void testBinarySearchEmptyArray(){
        int[] arr = {};
        int key = 2;

        int actualIndex = BinarySearch.binarySearch(arr, key);

        assertEquals(-1, actualIndex);
    }
    @Test
    // Tests if the binary search algorithm using recursion returns the correct index for a key present in the array
    public void testBinarySearchRecursion() {
        int[] arr = {1, 3, 4, 6, 8, 9, 11};
        int key = 4;
        int low = 0;
        int high = arr.length - 1;
        int expectedIndex = 2;

        int actualIndex = BinarySearch.binarySearchRecursion(arr, key, low, high);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    // Tests if the binary search algorithm using recursion returns -1 for a key not present in the array
    public void testBinarySearchRecursionKeyNotFound() {
        int[] arr = {1, 3, 4, 6, 8, 9, 11};
        int key = 7;
        int low = 0;
        int high = arr.length - 1;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.binarySearchRecursion(arr, key, low, high);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    //Tests the binary search algorithm when the array contains only one element , and this element is the one being searched for
    public void testBinarySearchRecursionSingleElementFound(){
        int[] arr = {1};
        int key = 1;
        int result = BinarySearch.binarySearchRecursion(arr, key, 0, arr.length - 1);
        assertEquals(0, result);
    }

    @Test
    //Tests the binary search algorithm when the array contains only one element , and this element is not the one being searched for
    public void testBinarySearchRecursionSingleElementNotFound() {
        int[] arr = {1};
        int key = 2;
        int result = BinarySearch.binarySearchRecursion(arr, key, 0, arr.length - 1);
        assertEquals(-1, result);
    }
}