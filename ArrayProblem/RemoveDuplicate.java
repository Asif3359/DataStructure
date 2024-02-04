package ArrayProblem;

import java.util.Arrays;

class RemoveDuplicate {

    public static void main(String[] args) {
        int array[] = {1, 4, 2, 2, 8, 9, 1, 3};

        int n = array.length;

        if (n == 0 || n == 1) {
            System.out.println("No duplicates to remove.");
            return;
        }
        // 1 1 2 2 3 4 8 9
        Arrays.sort(array);

        int i = 0;
        for (int j = 1; j < n; j++) {

            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }

        // i represents the index of the last unique element
        // The size of the unique elements is i + 1
        System.out.print("Array with duplicates removed: ");
        for (int j = 0; j < i + 1; j++) {
            System.out.print(array[j] + " ");
        }
    }
}


/*
 * class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
 */
