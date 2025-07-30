package basics;
// 🌟 Welcome to the ULTIMATE Java Basics File - Fully Commented, Interview-Ready, Beginner-Friendly
// Created with ❤️ for learning and mastering Java from scratch

import java.util.*; // 📦 Importing all utilities, especially Scanner for input

// 👑 Main class - must match filename when public
public class JavaBasicsAllInOne {

    // 🚀 Entry point of Java Program
    public static void main(String[] args) {

        System.out.println("🔰 Welcome to Java World!");

        // -----------------------------------------
        // 🔢 VARIABLES & DATA TYPES
        // -----------------------------------------
        int age = 20;                   // Integer
        float height = 5.9f;           // Float (must have f)
        double weight = 65.5;          // Double
        char grade = 'A';              // Character
        boolean isCoder = true;        // Boolean
        String name = "Derric";        // String (Class)

        System.out.println("🙋 Name: " + name + ", Grade: " + grade);

        // 🧠 TYPE CASTING
        double x = 10.75;
        int y = (int) x;  // Explicit casting
        System.out.println("📉 Type cast double " + x + " to int: " + y);

        // -----------------------------------------
        // 💬 INPUT USING SCANNER
        // -----------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("📥 Enter your city: ");
        String city = sc.nextLine();

        System.out.print("📥 Enter your age: ");
        int inputAge = sc.nextInt();

        System.out.println("📍 You are " + inputAge + " years old from " + city);

        // -----------------------------------------
        // ⚙️ OPERATORS DEMO
        // -----------------------------------------
        int a = 10, b = 3;
        System.out.println("➕ a + b = " + (a + b));
        System.out.println("➖ a - b = " + (a - b));
        System.out.println("✖️ a * b = " + (a * b));
        System.out.println("➗ a / b = " + (a / b)); // Integer division
        System.out.println("🧮 a % b = " + (a % b)); // Modulus

        // -----------------------------------------
        // 🔁 CONDITIONALS
        // -----------------------------------------
        if (inputAge >= 18) {
            System.out.println("✅ You are an adult!");
        } else {
            System.out.println("⛔ You are underage.");
        }

        // 🔀 SWITCH
        switch (city.toLowerCase()) {
            case "bangalore":
                System.out.println("🏙️ Garden City!");
                break;
            case "mumbai":
                System.out.println("🏙️ City of Dreams!");
                break;
            default:
                System.out.println("🌏 Explore your city!");
        }

        // -----------------------------------------
        // 🔄 LOOPS
        // -----------------------------------------

        System.out.println("🔁 FOR LOOP (1 to 5)");
        for (int i = 1; i <= 5; i++) {
            System.out.println("🚀 Loop i = " + i);
        }

        System.out.println("🔁 WHILE LOOP (count < 3)");
        int count = 0;
        while (count < 3) {
            System.out.println("📈 Count = " + count);
            count++;
        }

        System.out.println("🔁 DO-WHILE LOOP (runs at least once)");
        int z = 0;
        do {
            System.out.println("📊 Do z = " + z);
            z++;
        } while (z < 2);

        // -----------------------------------------
        // 📦 ARRAYS
        // -----------------------------------------
        int[] scores = {90, 80, 70, 60};
        System.out.println("📚 Scores Array:");
        for (int s : scores) {
            System.out.println("🎯 Score = " + s);
        }

        // -----------------------------------------
        // 🧠 METHODS
        // -----------------------------------------
        greetUser();
        int total = addNumbers(5, 7);
        System.out.println("🧮 Sum from method: " + total);

        // -----------------------------------------
        // 💡 OOP - OBJECTS & CLASSES
        // -----------------------------------------
        Student s1 = new Student("Derric", 101);
        s1.showDetails();

        // ⚡ Static usage
        System.out.println("🌐 Student School: " + Student.schoolName);

        // ✅ MINI LOGIC: Prime Number Check
        System.out.print("🔍 Enter a number to check prime: ");
        int primeCheck = sc.nextInt();
        System.out.println(isPrime(primeCheck) ? "✅ Prime!" : "❌ Not Prime!");

        sc.close(); // ✅ Close Scanner
    }

    // ✨ Method: No return, no parameter
    public static void greetUser() {
        System.out.println("👋 Hello! Welcome to Java Learning!");
    }

    // 🎯 Method: With parameter & return
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 💡 Method: Prime number checker
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// 🧑‍🎓 Class to demonstrate OOP
class Student {
    String name;
    int rollNo;
    static String schoolName = "Green Valley School"; // static field

    // 🧱 Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // 🧾 Method to display info
    void showDetails() {
        System.out.println("🧑‍🎓 Student Name: " + name);
        System.out.println("🆔 Roll No: " + rollNo);
    }
}
