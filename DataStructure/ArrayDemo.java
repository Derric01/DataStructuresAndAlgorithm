public class ArrayDemo {
    public static void main(String[] args){
        System.out.println("Lets print 1 d array");
        int[] num = {12,23,67,89,45,35,90,100};

        for(int i =0;i<num.length;i++){
            System.out.println("At index"+i+" ="+ num[i]);
        }
        System.out.println("\n--------------------\n");

        System.out.println("This is 2d array");
        int[][] num2d = {
            {12,34,556},
            {23,45,678},
            {234,567,450}
        };

        for(int row=0; row<num2d.length;row++){
            for (int col=0; col<num2d[row].length;col++){
                System.out.println(num2d[row][col] +" ");
            }
            System.out.println(); // New line after each row
        }
    }
}
