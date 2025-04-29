import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums, false); // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    /**
     * Uses the bubble sort algorithm to sort a list of numbers in-place
     * @param nums The list of numbers to sort
     * @param ascending Whether the list should be sorted ascending or descending
     */
    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - (i + 1); j++) {
                boolean condition = ascending
                        ? (nums[j] > nums[j + 1])
                        : nums[j] < nums[j + 1];

                if (condition) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Overloaded method to sort a list of numbers ascendingly
     * @param nums The list of numbers to be sorted
     */
    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
    }

    /**
     * Uses the selection sort algorithm to sort a list of numbers in-place
     * @param nums The list to be sorted
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

    /**
     * Uses the insertion sort algorithm to sort a list of numbers in-place
     * @param nums The list to be sorted
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }
}
