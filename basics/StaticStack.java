package basics;
class StaticStack {
   int maxSize;
   int top;
   int[] stackArray;

   public StaticStack(int var1) {
      this.maxSize = var1;
      this.stackArray = new int[this.maxSize];
      this.top = -1;
   }

   public void push(int var1) {
      if (this.top == this.maxSize - 1) {
         System.out.println("Stack overFlow cannot add " + var1);
      } else {
         this.stackArray[++this.top] = var1;
         System.out.println("Pushed:" + var1);
      }

   }

   public int pop() {
      if (this.top == -1) {
         System.out.println("Stack underflow  !! nothing to pop!!!");
         return -1;
      } else {
         int var1 = this.stackArray[this.top--];
         System.out.println("Popped:" + var1);
         return var1;
      }
   }

   public int peek() {
      if (this.top == -1) {
         System.out.println("Stack is Empty!!!");
         return -1;
      } else {
         return this.stackArray[this.top];
      }
   }

   public boolean isEmpty() {
      return this.top == -1;
   }

   public void PrintStack() {
      if (this.isEmpty()) {
         System.out.println("Stack is empty!!");
      } else {
         System.out.println("Stack elements are(Top to bottom ):");

         for(int var1 = this.top; var1 >= 0; --var1) {
            System.out.println(this.stackArray[var1]);
         }
      }

   }
}
