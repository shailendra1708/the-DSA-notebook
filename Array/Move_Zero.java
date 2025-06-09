import java.util.Arrays;

class Move_Zero {
    public static void moveZeroes(int[] nums) {
        int j = -1, temp;
        int n = nums.length;

        // Find the first zero
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // No zero? Return
        if (j == -1) return;

        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 0, 3, 4, 5, 0, 1, 5, 0, 6, 0};

        // Call the method (it changes nums in-place)
        moveZeroes(nums);

        // Print the modified array
        System.out.println(Arrays.toString(nums));
    }
}
