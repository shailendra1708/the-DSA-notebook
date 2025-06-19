public class Max_consecutive_number {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, count = 0, max = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        int nums[]={1,1,0,1,0,1,1,1,1,0,0,0,1};

System.err.println(findMaxConsecutiveOnes(nums));
    }
}

