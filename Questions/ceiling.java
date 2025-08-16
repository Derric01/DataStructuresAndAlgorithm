//this is a problem solution for ceiling number that is greater than or equal to the target

public class ceiling{
 public static int sol(int arr[],int target){
    int left =0;
    int right = arr.length -1;
    int ans = -1;
    while(left <= right){
        int mid = left +(right -left)/2;
        if(arr[mid]>=target){

            ans = mid;

            right = mid -1;
        }
        else{
            left = mid +1;
        }


    }
    return ans; // If no ceiling found
 }

 public static void main(String[] args) {
     int[] arr1 = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,17};
     int t = 16;
     int result = sol(arr1,t);
     if(result != -1){
        System.out.println("The element is found at the index"+ result);
     }else{
        System.out.println("The element is not found in the array");
     }
 }}
