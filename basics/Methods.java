package basics;

import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

     sum();// Calling the sum method to perform addition
     int ans = sum2();
     System.out.println("the answer of int return type is "+ans);   // Calling the sum2 method to get the result and print it
     System.out.println(greet()); // Calling the greet method to get a greeting message

     int mul = multiply(21324,43545);

     System.out.println(mul);
     String reversedString = reverse("siri sana");
     System.out.println(reversedString); // Calling the reverse method to reverse a string and print it
    }


    //return integer

    static int sum2(){
        int a = 67;
        int b = 3242535;

       int  res = a+b;


        return res;
    }
    static void sum(){
        //take 2 numbers as input and add it !!

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first number:");
        int a  = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
         int result = a +b ;
         System.out.println("The result is " + result);
        }

        static String greet(){
           String  greeting ="Hey life goes!! on sometimes some good byes are forever!!";


            return greeting;
        }

        static int multiply(int q,int w){
            return q*w;
        }

        static String reverse(String str){
            StringBuilder reversed = new StringBuilder(str);
            reversed.reverse();
            return reversed.toString();

        }

        static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}

        static int fibonacci(int n) {
            if (n <= 1) return n;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
}
    

