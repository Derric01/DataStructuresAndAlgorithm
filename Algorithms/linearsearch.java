package Algorithms;
public class linearsearch {
    public static void main(String args[]){
        int[] nums = {23,45,1,23,4546,-63,75,97,8,23,89};
        int target = 97;
        boolean ans = LinearSearch(nums,target);
        System.out.println("Found:" +ans);
    }
    static boolean LinearSearch(int[] nums,int target){
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
