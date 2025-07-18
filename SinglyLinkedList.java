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
}
