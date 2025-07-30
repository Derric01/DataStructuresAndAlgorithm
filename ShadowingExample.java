public class ShadowingExample {

    int x = 10; // Instance variable

    public void printX() {
        int x = 20; // Local variable shadows the instance variable

        System.out.println("Local x = " + x);            // Outputs 20
        System.out.println("Instance x = " + this.x);    // Access instance variable using 'this'
    }

    public static void main(String[] args) {
        ShadowingExample obj = new ShadowingExample();
        obj.printX();
    }
}
