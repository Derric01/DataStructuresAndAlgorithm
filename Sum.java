import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first two numbers:");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        float d = a-b;
        int mult = a*b;
        float div = a/b;

        System.out.println("The sum of the two number is :"+sum);
        System.out.println("The difference:"+d);
        System.out.println("The multiplication :"+mult);
        System.out.println("The division:"+div);
        System.out.println("The modulus"+(a%b));

    }}

    
