package Sorting;
public class selection_sorting {
    public static void sel(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        // calling the function
        sel(arr, arr.length);

        // printing the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
