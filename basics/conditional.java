package basics;
import java.util.*;
public class conditional {
    public static void main(String args[]){
//if else    statement
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter two numbers");
      int a = obj.nextInt();
      double e = obj.nextDouble();
      if(a>e){
        System.out.println("a is greater than b !!");

      }else if(a<e){
        System.out.println("b is greater than a!!");
      }else{
        System.out.println("Both are equal !!");
      }
  //while loop
     while(a>0){
         System.out.println("a is positive!!");
         a--;
     } 

     //do while loop

     do{
        System.out.println("This is a do while loop ");
     }while(a<0);

       //for loop 

       for(int i =0;i<8;i++){
        System.out.println("This is a for loop iteration "+i);
       }
         //switch statement
         System.out.println("Enter a number between 1 to 5");
         int n = obj.nextInt();
         switch(n){
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The numbver is two !");
                break;

            case 3:
                System.out.println("The number is three !");
                break;
            case 4:
                System.out.println("The number  is four !");
                break;
            case 5:
                System.out.println("The number is five !!");
                break;

            default:  
                System.out.println("The number is not between 1 to 5 !!");
                break;
         }
    }
}
