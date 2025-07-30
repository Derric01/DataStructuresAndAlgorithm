package basics;
public class varargsExample {

    // Method using varargs
    public void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // newline
    }

    public static void main(String[] args) {
        VarargsExample obj = new VarargsExample();

        obj.printNumbers();                    // No arguments
        obj.printNumbers(1);                   // Single argument
        obj.printNumbers(1, 2, 3, 4, 5);        // Multiple arguments
    }
}
