package Exercises.Ex2StackToQueue;

public interface QueueInterface<E> {
    int size();
    boolean isEmpty();
    E first();
    void enqueue(E e);
    E dequeue();
    String toString();
}
