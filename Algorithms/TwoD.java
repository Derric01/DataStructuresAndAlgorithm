package Algorithms;

public class TwoD{
    public static void main(String[] args){
        int [][] arr ={
               {1,23,4,78},
               {12,34,87},
               {12,34,23},
               {12,34,45}
        };

        int target = 45;
        System.out.println("Found:" + search(arr, target));

        
    }
    static boolean search(int[][] arr,int target){
       for(int i=0 ;i<arr.length;i++){
        for(int j=0 ;j<arr[i].length;j++){
            if(arr[i][j] ==target){
                return true;
            }
        }
       }
       return false;
    }
}