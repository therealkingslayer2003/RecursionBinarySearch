public class BinarySearch {
    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7}, 7));
        int[] test = new int[]{1,2,3,4,5,6,7};
        System.out.println(binarySearchRecursion(test, 7, 0, test.length - 1));
    }
    public static int binarySearch(int[] array, int key){   //Default Binary Search algorithm
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = low + (high - low) / 2;

            if(key < array[middle]){
                high = middle - 1;
            } else if (key > array[middle]) {
                low = middle + 1;
            } else{
                return middle;
            }
        }
        return -1;
    }
    public static int binarySearchRecursion(int[] array, int key, int low, int high){   //Implementation with recursion

        int middle = low + (high - low) / 2;

        if(low > high) return -1;


        if(key == array[middle]) return middle;
        else if (key < array[middle]){
            return binarySearchRecursion(array, key, low, middle -1);
        } else {
            return binarySearchRecursion(array, key, middle + 1, high);
        }
    }
}
