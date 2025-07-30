import java.util.*;

// 🎓 MASTER FILE: Java DSA with Full Depth, Explanations, and Examples
public class JavaDSADeepMaster {

    public static void main(String[] args) {
        System.out.println("🎯 MASTERING JAVA DSA STARTS NOW!\n");

        // -----------------------------
        // 1. 🧱 FIXED SIZE ARRAY
        // -----------------------------
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        System.out.println("🧱 Fixed Array Elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + ": " + nums[i]);
        }

        // -----------------------------
        // 2. 📦 ARRAYLIST (RESIZABLE)
        // -----------------------------
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("\n📦 ArrayList Contents:");
        for (String name : names) {
            System.out.println("👤 " + name);
        }

        // -----------------------------
        // 3. 🌀 STACK (LIFO)
        // -----------------------------
        Stack<Character> st = new Stack<>();
        String toReverse = "hello";
        for (char ch : toReverse.toCharArray()) {
            st.push(ch);
        }

        System.out.print("\n🔁 Reversed using Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
        System.out.println();

        // -----------------------------
        // 4. 🔁 QUEUE (FIFO)
        // -----------------------------
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.print("\n🚪 Queue Front to End: ");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();

        // -----------------------------
        // 5. 🔗 LINKED LIST - Full CRUD
        // -----------------------------
        LinkedListCRUD list = new LinkedListCRUD();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertFront(5);
        list.printList();
        list.deleteByValue(10);
        list.printList();

        // -----------------------------
        // 6. 🧠 HASHMAP - Word Frequency
        // -----------------------------
        System.out.println("\n📊 Word Frequency:");
        String line = "java is fun and java is powerful";
        String[] words = line.split(" ");
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println("📌 " + e.getKey() + ": " + e.getValue());
        }

        // -----------------------------
        // 7. 🌲 BINARY TREE TRAVERSALS
        // -----------------------------
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("\n🌿 Inorder  : ");
        inorder(root);
        System.out.print("\n🌿 Preorder : ");
        preorder(root);
        System.out.print("\n🌿 Postorder: ");
        postorder(root);
        System.out.println();

        // -----------------------------
        // 8. 🔍 RECURSION - FACTORIAL
        // -----------------------------
        System.out.println("\n🌀 Factorial of 5: " + factorial(5));
        System.out.println("🔁 Reverse 'Derric': " + reverseStr("Derric"));

        // -----------------------------
        // 9. 📊 BUBBLE SORT
        // -----------------------------
        int[] sortArr = {5, 1, 4, 2, 8};
        bubbleSort(sortArr);
        System.out.println("\n📊 Sorted Array (Bubble): " + Arrays.toString(sortArr));

        // -----------------------------
        // 10. 🔎 BINARY SEARCH
        // -----------------------------
        int index = binarySearch(sortArr, 4);
        System.out.println("🔎 Index of 4: " + index);
    }

    // 🔗 LINKED LIST NODE + CRUD METHODS
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static class LinkedListCRUD {
        Node head;

        void insertFront(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

        void insertEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = newNode;
        }

        void deleteByValue(int val) {
            if (head == null) return;
            if (head.val == val) {
                head = head.next;
                return;
            }
            Node curr = head;
            while (curr.next != null && curr.next.val != val)
                curr = curr.next;
            if (curr.next != null)
                curr.next = curr.next.next;
        }

        void printList() {
            System.out.print("\n🔗 LinkedList: ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " → ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // 🌲 BINARY TREE NODE + TRAVERSALS
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // 🔁 RECURSION EXAMPLES
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static String reverseStr(String s) {
        if (s.length() <= 1) return s;
        return reverseStr(s.substring(1)) + s.charAt(0);
    }

    // 📊 BUBBLE SORT
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // 🔎 BINARY SEARCH (iterative)
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
