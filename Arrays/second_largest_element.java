package Arrays;

public class second_largest_element {
    static void second_largest(int [] arr){
        int largest = arr[0];
        int secondlargest = -1;
        for (int i  = 1; i<arr.length; i++){
            if(arr[i]> largest){
                secondlargest = largest;
                largest = arr[i];
            }else if (arr[i] != largest && arr[i]> secondlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
    }
    static void second_smallest(int [] arr){
        int smallest = arr[0];
        int s_smallest = Integer.MAX_VALUE;
        for(int i  =1; i<arr.length; i++){
            if(arr[i]< smallest){
                s_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < s_smallest){
                s_smallest = arr[i];
            }
        }
        System.out.println(s_smallest);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,7,5};
        second_largest(arr);
        second_smallest(arr);
    }
}
