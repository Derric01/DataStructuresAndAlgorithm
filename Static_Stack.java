public class Static_Stack {
   public static void main(String[] var0) {
      StaticStack var1 = new StaticStack(5);
      var1.push(10);
      var1.push(23);
      var1.push(45);
      var1.push(67);
      var1.push(89);
      var1.push(100);
      System.out.println("Top element is :" + var1.peek());
      var1.pop();
      System.out.println("Is the stack empty ? :" + var1.isEmpty());
      var1.PrintStack();
   }
}
