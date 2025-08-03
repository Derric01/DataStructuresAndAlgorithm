import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter number of the elements for 1 d arraList: ");
        int n = sc.nextInt();
        System.out.println("Enter  " + n + " elements: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+i +":");
            list.add(sc.nextInt());
        }

        System.out.println("Lets print the elements !!");
        for(int j = 0;j<list.size();j++){
            System.out.println("At index j "+j+"="+list.get(j));
        }

        sc.close();

    }
}
