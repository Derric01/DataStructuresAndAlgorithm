

class StaticStack{
    int maxSize;
    int top;
    int[] stackArray;


    public StaticStack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    //push operation 
    public void push(int value){
        if(top == maxSize -1){
            System.out.println("Stack overFlow cannot add "+ value);

        }else{
            stackArray[++top] = value;
            System.out.println("Pushed:"+value);
        }
    }

    //pop operation 
    public int pop(){
        if(top ==-1){
            System.out.println("Stack underflow  !! nothing to pop!!!");
            return -1;
        }else{
            int popped = stackArray[top--];
            System.out.println("Popped:"+ popped);
            return popped;
        }
    }
    //peep operation
    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty!!!");
            return -1;
        }else{
            return stackArray[top];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void PrintStack(){
        if(isEmpty()){
            System.out.println("Stack is empty!!");
        }else{
            System.out.println("Stack elements are(Top to bottom ):");
            for(int i =top; i>=0 ; i--){
                System.out.println(stackArray[i]);
            }
        }
    }
}

public class Static_Stack{
    public static void main(String[] args){
        StaticStack s = new StaticStack(5);
        s.push(10);
        s.push(23);
        s.push(45);
        s.push(67);
        s.push(89);
        s.push(100); // This should trigger stack overflow
        System.out.println("Top element is :"+s.peek());
        s.pop();
        System.out.println("Is the stack empty ? :"+s.isEmpty());
        s.PrintStack();
     
    }


}


/*
Pushed:10
Pushed:23
Pushed:45
Pushed:67
Pushed:89
Stack overFlow cannot add 100
Top element is :89
Popped:89
Is the stack empty ? :false
Stack elements are(Top to bottom ):
67
45
23
10 
*/