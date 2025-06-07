public class Sorted_Rotated_Array {

    public static boolean check(int[] nums) {
        int count = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 1, 2, 3, };

        System.out.println("Is the array sorted and rotated? " + check(nums));
    }
}
