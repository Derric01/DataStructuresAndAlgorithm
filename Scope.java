public class Scope {

    // 🔹 Class (Static) Scope – shared across all objects
    static int staticVar = 100;

    // 🔹 Instance Scope – unique to each object
    int instanceVar = 50;

    public void methodScopeExample() {
        // 🔹 Local Scope – exists only during method execution
        int localVar = 20;

        if (localVar > 10) {
            // 🔹 Block Scope – inside if-block
            int blockVar = 5;
            System.out.println("Block var: " + blockVar); // ✅ Accessible here
        }

        // System.out.println(blockVar); ❌ Error: blockVar not accessible here
        System.out.println("Local var: " + localVar); // ✅
    }

    public static void main(String[] args) {
        // 🔹 Method-local scope in main method
        int mainLocalVar = 10;

        Scope obj = new Scope();
        obj.methodScopeExample();

        System.out.println("Static var: " + staticVar);       // ✅ Accessible directly
        System.out.println("Instance var: " + obj.instanceVar); // ✅ Needs object
    }
}
