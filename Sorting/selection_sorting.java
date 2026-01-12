package Sorting;

public class selection_sorting {
    public static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i =0; i< n-1;i++){
            int minIndex =i; // assuming the current index holds minimum value
            for(int j =i +1; j< n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            // swapping the value
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        // printing the sorted array
        System.out.println("After selection sort: ");
        for(int num: arr){
            System.out.println(num + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,5,7,6,9,8,10};

        // before sorting the array
        System.out.println("Before sorting: ");
        for(int num: arr){
            System.out.println(num + " ");
        }
        System.out.println();

        // call selection sort
        selection_sort(arr);

    }
}
