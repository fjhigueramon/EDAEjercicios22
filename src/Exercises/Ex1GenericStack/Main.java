package Exercises.Ex1GenericStack;

public class Main {

    public static void main(String[] args) {
        IntegerStackInterface myStack = new ArrayIntegerStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("--- IntegerArrayStack ---");
        System.out.println("Stack: " + myStack.toString());
        System.out.println("Initial size: " + myStack.size());
        System.out.println("First pop: " + myStack.pop());
        System.out.println("Second pop: " + myStack.pop());
        System.out.println("Third pop: " + myStack.pop());
        System.out.println("Stack: " + myStack.toString());
        System.out.println("Is it empty? " + myStack.isEmpty());
        System.out.println("------------------\n");

        // Código que debería funcionar
//        GenericStackInterface<Integer> myGenericStack = new ArrayGenericStack<Integer>();
//        myGenericStack.push(1);
//        myGenericStack.push(2);
//        myGenericStack.push(3);
//        System.out.println("--- IntegerArrayStack ---");
//        System.out.println("Stack: " + myGenericStack.toString());
//        System.out.println("Initial size: " + myGenericStack.size());
//        System.out.println("First pop: " + myGenericStack.pop());
//        System.out.println("Second pop: " + myGenericStack.pop());
//        System.out.println("Third pop: " + myGenericStack.pop());
//        System.out.println("Stack: " + myGenericStack.toString());
//        System.out.println("Is it empty? " + myGenericStack.isEmpty());
//        System.out.println("------------------\n");

    }

}
