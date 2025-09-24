package Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] ={1,0,3,4,5};
        // we need check if the array is sorted or not in ascending order
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    // we are creating a method to check if the arr is sorted or not
     static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            // we are iteraton the arr from index 1
            // we are check if the previous element of the arr is smaller than current element
            if(arr[i]<arr[i-1]){
                return false;
            }

        }
        return true;

     }
}
