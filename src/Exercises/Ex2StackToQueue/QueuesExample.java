package Exercises.Ex2StackToQueue;

public class QueuesExample {
    public static void main(String[] args) {
        QueueInterface<Integer> myArrayQueue = new ArrayQueue<>();
        QueueInterface<Integer> myLinkedQueue = new LinkedQueue<>();

        myArrayQueue.enqueue(1);
        myArrayQueue.enqueue(2);
        myArrayQueue.enqueue(3);
        System.out.println("--- IntegerArrayQueue ---");
        System.out.println("Stack: " + myArrayQueue.toString());
        System.out.println("Initial size: " + myArrayQueue.size());
        System.out.println("First pop: " + myArrayQueue.dequeue());
        System.out.println("Second pop: " + myArrayQueue.dequeue());
        System.out.println("Third pop: " + myArrayQueue.dequeue());
        System.out.println("Stack: " + myArrayQueue.toString());
        System.out.println("Is it empty? " + myArrayQueue.isEmpty());
        System.out.println("------------------\n");

        myLinkedQueue.enqueue(1);
        myLinkedQueue.enqueue(2);
        myLinkedQueue.enqueue(3);
        System.out.println("--- LinkedIntegerQueue ---");
        System.out.println("Stack: " + myLinkedQueue.toString());
        System.out.println("Initial size: " + myLinkedQueue.size());
        System.out.println("First pop: " + myLinkedQueue.dequeue());
        System.out.println("Second pop: " + myLinkedQueue.dequeue());
        System.out.println("Third pop: " + myLinkedQueue.dequeue());
        System.out.println("Stack: " + myLinkedQueue.toString());
        System.out.println("Is it empty? " + myLinkedQueue.isEmpty());
        System.out.println("------------------\n");
    }
}
