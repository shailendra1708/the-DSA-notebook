class Missing_Element {
    public static int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + nums[i];
        }

        int total = N * (N + 1) / 2;

        return total - sum;

    }

    public static void main(String[] args) {
      int nums[] ={0,4,5,7,6,9,2,1,8};

      System.out.println(missingNumber(nums));
    }
}