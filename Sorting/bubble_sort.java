package Sorting;

public class bubble_sort {
    static void bubble(int[]arr, int n){
        for(int i = n-1; i>=1; i--){
            for(int j =0; j<= i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,4};

        // call the function
        bubble(arr,arr.length);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
