import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums); // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    /**
     * Uses the bubble sort algorithm to sort a list of numbers in-place
     * @param nums The list to be sorted
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - (i + 1); j++) {
                int k = j + 1;

                if (nums[j] > nums[k]) {
                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }
    }


}