package Exercises.Ex1GenericStack;

// Para que sea tipo generico añado <E>
public interface GenericStackInterface<E> {
    int size();
    boolean isEmpty();
    E top();
    void push(E e);
    E pop();
    String toString();
}
