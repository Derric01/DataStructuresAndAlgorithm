package Algorithms;
public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = left +(right -left)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left = mid-1;
            }else{
                left = mid+1;
            }

           

        }
         return -1;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        int tar = 6;
        int result = binarySearch(arr1,tar);

        System.out.println("Element found at index "+ result);
        if(result ==-1){
            System.out.println("Element not found");
        }

    }
}
