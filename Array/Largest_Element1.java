
public class Largest_Element1 {

    public static int Largest(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int arr[] = { 25, 43, 41, 19, 42, 31, 24, 36 };
        System.out.println("The largest number of an array is : " + Largest(arr));

    }
}
