package Arrays;

public class largest_element {
    static void largest_value(int []arr){
        int largest = arr[0];
        for (int i =0; i< arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int [] arr = {2,1,4,3,5};
        largest_value(arr);

    }
}
