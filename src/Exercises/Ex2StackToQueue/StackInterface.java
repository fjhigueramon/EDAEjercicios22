package Exercises.Ex2StackToQueue;

public interface StackInterface<E> {
    int size();
    boolean isEmpty();
    E top();
    void push(E e);
    E pop();
    String toString();
}
