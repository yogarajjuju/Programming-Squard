package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};

        // the bruteforce way is to use inbuilt sort and print n-1
        // the optimal way is to use max variable and iterate the array
        int max =Integer.MIN_VALUE; // u we can use max=arr[0]

        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
