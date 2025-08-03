import java.util.*;


public class ArraylisttwoD {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        System.out.println("Enter number of rowws:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();


        System.out.println("Enter elements for "+rows +"x" +cols+"Matrix:");

        for(int i =0;i<rows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<cols;j++){
                System.out.println("Element [" + i + "][" + j + "]: ");
                row.add(sc.nextInt());

            }
            matrix.add(row);
        }

        System.out.println("The array elements are:");
        for(ArrayList<Integer> row :matrix){
            for(int num :row){
                System.out.println(num +" ");
            }
            System.out.println();
        }

    }
}
