package Exercises.Ex3JUnitTests;

public interface QueueInterface<E> {
    int size();
    boolean isEmpty();
    E first();
    void queue(E e) throws IllegalStateException;
    E dequeue();
    String toString();
}
