<<<<<<< HEAD
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    // Insertion
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Position must be > 0");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deletion
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public void deleteAtPosition(int pos) {
        if (pos <= 0) {
            System.out.println("Position must be > 0");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtBeginning(5);
        list.insertAtPosition(7, 2);
        list.display();             // 5 -> 7 -> 10 -> null
        list.deleteAtPosition(2);
        list.display();             // 5 -> 10 -> null
        list.deleteAtEnd();
        list.display();             // 5 -> null
    }
=======
public class SinglyLinkedList {
   Node head;

   public void insertAtBeginning(int var1) {
      Node var2 = new Node(var1);
      var2.next = this.head;
      this.head = var2;
   }

   public void insertAtEnd(int var1) {
      Node var2 = new Node(var1);
      if (this.head == null) {
         this.head = var2;
      } else {
         Node var3;
         for(var3 = this.head; var3.next != null; var3 = var3.next) {
         }

         var3.next = var2;
      }
   }

   public void insertAtPosition(int var1, int var2) {
      if (var2 <= 0) {
         System.out.println("Position must be > 0");
      } else {
         Node var3 = new Node(var1);
         if (var2 == 1) {
            this.insertAtBeginning(var1);
         } else {
            Node var4 = this.head;

            for(int var5 = 1; var4 != null && var5 < var2 - 1; ++var5) {
               var4 = var4.next;
            }

            if (var4 == null) {
               System.out.println("Position out of range");
            } else {
               var3.next = var4.next;
               var4.next = var3;
            }
         }
      }
   }

   public void deleteAtBeginning() {
      if (this.head == null) {
         System.out.println("List is empty");
      } else {
         this.head = this.head.next;
      }
   }

   public void deleteAtEnd() {
      if (this.head == null) {
         System.out.println("List is empty");
      } else if (this.head.next == null) {
         this.head = null;
      } else {
         Node var1;
         for(var1 = this.head; var1.next.next != null; var1 = var1.next) {
         }

         var1.next = null;
      }
   }

   public void deleteAtPosition(int var1) {
      if (var1 <= 0) {
         System.out.println("Position must be > 0");
      } else if (this.head == null) {
         System.out.println("List is empty");
      } else if (var1 == 1) {
         this.deleteAtBeginning();
      } else {
         Node var2 = this.head;

         for(int var3 = 1; var2.next != null && var3 < var1 - 1; ++var3) {
            var2 = var2.next;
         }

         if (var2.next == null) {
            System.out.println("Position out of range");
         } else {
            var2.next = var2.next.next;
         }
      }
   }

   public void display() {
      for(Node var1 = this.head; var1 != null; var1 = var1.next) {
         System.out.print(var1.data + " -> ");
      }

      System.out.println("null");
   }

   public static void main(String[] var0) {
      SinglyLinkedList var1 = new SinglyLinkedList();
      var1.insertAtEnd(10);
      var1.insertAtBeginning(5);
      var1.insertAtPosition(7, 2);
      var1.display();
      var1.deleteAtPosition(2);
      var1.display();
      var1.deleteAtEnd();
      var1.display();
   }
>>>>>>> f73621e8af0f58c0b59f7c7350dd41e93a0206eb
}
