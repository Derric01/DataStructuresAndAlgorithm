import java.util.*;

public class Armstrong {

    public boolean isArmstrong(int num) {
        int original = num;
        int digits = 0;
        int sum = 0;

        // Step 1: Count digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Step 2: Calculate Armstrong sum
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Armstrong a = new Armstrong();

        System.out.println("Enter a number to check if it's an Armstrong number:");
        int n = obj.nextInt();

        if (a.isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number! 🎉");
        } else {
            System.out.println(n + " is NOT an Armstrong number.");
        }
    }
}
