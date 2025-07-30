package basics;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        System.out.println("Hey there is this basic java code");
        System.out.println(1243);
      //  System.out.println(args[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("You entered:"+n);
        System.out.println("Enter a String ");
        String s = sc.next();
        System.out.println("The string is+"+s);
        System.out.println("The length of the string is "+s.length());
        System.out.println("The string to uppercase is "+s.toUpperCase());
        System.out.println("The string to lowercase is  "+s.toLowerCase());
        System.out.println("The string to char array is :"+s.toCharArray());
        System.out.println("The string to byte array is :"+s.getBytes());


        System.out.println("Enter a float number ");
        float f = sc.nextFloat();
        System.out.println("The number entered is "+f);
        System.out.println("The square of the number is "+(f*f));
        byte a = 100;
        short b = 32000;
        int c = 100000;
        long d = 9999999999L;

        float e = 12.34f;
        double m = 123.456;

        char g = 'A';
        boolean h = true;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + m);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}