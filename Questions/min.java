
import java.util.Arrays;
import java.util.Scanner;

public class min {

    public static void main(String[] args){
        int[] nums = {12,3,4,43,23,87,937};
        System.out.println(min(nums));
    }
    

    static int min(int[] nums){
        int min= nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]<min){
                min= nums[i];
            }
        }
        return min;
    }
}
