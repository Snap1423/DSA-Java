package Sorting;

public class insertion_sort {
    static void insertion(int [] arr, int n){
        for(int i =0; i<n-1; i++){
            int j =i;
            while(j>0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,1,4,3,5};

        // call the function
        insertion(arr,arr.length);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
