// write  a function to predict whether a number is prime or not a prime

import java.util.*;
public class prime{
    public Boolean isPrime (int num){
       if(num <= 1){
         return false;
       }else{
          for(int i =2;i<=Math.sqrt(num); i++){
              if(num % i == 0){
                  return false;
              }
          }
          return true;
       }
    }

    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);

       System.out.println("Enter a number to find whether it is prime or not prime");
       int n = obj.nextInt();
       prime p  = new prime();

               if(p.isPrime(n)){
                System.out.println("The number is prime number !!");
            }
                else{
                    System.out.println("The number is not prime !!");
                }



    }
}