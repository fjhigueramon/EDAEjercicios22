package Exercises.Ex1GenericStack;

public class ArrayGenericStack<E> implements GenericStackInterface<E> {

    // Atributos de la clase
    public static final int CAPACITY = 1000;
    E[] stack;
    int currentSize = -1;

    // Constructor
    public ArrayGenericStack() {
        this.stack = (E[]) new Object[CAPACITY];        // Not safe
    }

    // Operaciones de la interfaz

    @Override
    public int size(){
        return this.currentSize + 1;
    }

    @Override
    public boolean isEmpty(){
        return this.currentSize == -1;
    }

    @Override
    public E top(){
        if (this.isEmpty()) {
            return null;
        }

        return this.stack[currentSize];
    }

    @Override
    public void push(E e) {
        if (this.currentSize == CAPACITY) {
            throw new IllegalStateException();
        }

        currentSize++;
        stack[currentSize] = e;
    }

    @Override
    public E pop(){
        if (this.isEmpty()) {
            return null;
        }

        E result = stack[currentSize];
        currentSize--;
        return result;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = currentSize; i >= 0; i--) {
            result.append(this.stack[i]);
            if (i > 0) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

}