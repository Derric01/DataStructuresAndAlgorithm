package basics;
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int a = 10;
        float b = a;  // int to float
        System.out.println("Implicit casting (int to float): " + b);

        // Explicit casting (narrowing)
        float c = 10.5f;
        int d = (int) c;  // float to int
        System.out.println("Explicit casting (float to int): " + d);

        //automatic type promotion in expressions
        int x  = 257;
        byte y = (byte) (x);
        System.out.println("The automatic promotion in expressions: " + y);
       

        int i = 23;
        int j = 643;
        int k = 90;

        double o = (double) i*j/k;

        System.out.println(o);
        /*double
↑
float
↑
long
↑
int
↑
char / short / byte
 */


    
    }
}
