package Exercises.Ex2StackToQueue;

public class StacksExample {

    public static void main(String[] args) {
        StackInterface<Integer> myArrayStack = new ArrayStack<>();
        StackInterface<Integer> myLinkedStack = new LinkedStack<>();

        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        System.out.println("--- IntegerArrayStack ---");
        System.out.println("Stack: " + myArrayStack.toString());
        System.out.println("Initial size: " + myArrayStack.size());
        System.out.println("First pop: " + myArrayStack.pop());
        System.out.println("Second pop: " + myArrayStack.pop());
        System.out.println("Third pop: " + myArrayStack.pop());
        System.out.println("Stack: " + myArrayStack.toString());
        System.out.println("Is it empty? " + myArrayStack.isEmpty());
        System.out.println("------------------\n");

        myLinkedStack.push(1);
        myLinkedStack.push(2);
        myLinkedStack.push(3);
        System.out.println("--- LinkedIntegerStack ---");
        System.out.println("Stack: " + myLinkedStack.toString());
        System.out.println("Initial size: " + myLinkedStack.size());
        System.out.println("First pop: " + myLinkedStack.pop());
        System.out.println("Second pop: " + myLinkedStack.pop());
        System.out.println("Third pop: " + myLinkedStack.pop());
        System.out.println("Stack: " + myLinkedStack.toString());
        System.out.println("Is it empty? " + myLinkedStack.isEmpty());
        System.out.println("------------------\n");



    }

}
