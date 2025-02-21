public class Ascending_array_elements
{
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if current element is greater than next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
