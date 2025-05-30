public class Second_Largest2 {
    public static int SecLargest(int arr[], int n) {
        if (n < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {

        int arr []={12,45,59,21,54,36,25,12,59};
        int n=arr.length;

        System.out.println("The second largest number from an Array is :"+ SecLargest(arr, n) );
    }
}
