package Exercises.Ex2StackToQueue;

public class ArrayStack<E> implements StackInterface<E> {

    public static final int CAPACITY=1000;
    E[] stack;
    int currentSize = -1;


    public ArrayStack(){
        this.stack = (E[]) new Object[CAPACITY];
    }
    public ArrayStack(int size){
        this.stack = (E[]) new Object[size];
    }

    @Override
    public int size() {
        return currentSize+1;
    }

    @Override
    public boolean isEmpty() {
        return currentSize==-1;
    }

    @Override
    public E top() {
        if (this.isEmpty()){
            return null;
        }
        return stack[currentSize];
    }

    @Override
    public void push(E e) {
        if (this.size() == stack.length){
            System.out.println("Stack is full");
        }
        currentSize++;
        stack[currentSize] = e;
    }

    @Override
    public E pop() {
        if (this.isEmpty()){
            return null;
        }
        E result = stack[currentSize];
        stack[currentSize] = null;
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
