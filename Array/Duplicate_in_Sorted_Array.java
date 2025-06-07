public class Duplicate_in_Sorted_Array {
    public static int removeDuplicates(int[] nums, int n) {
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 2, 2, 3, 3, 3, 4, 4 };
        int n = nums.length;
        System.out.print(removeDuplicates(nums, n));
    }
}
