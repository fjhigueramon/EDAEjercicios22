package Exercises.Ex2StackToQueue;

import java.util.LinkedList;

public class LinkedStack<E> implements StackInterface<E> {

    private LinkedList<E> list;

    public LinkedStack(){
        this.list = new LinkedList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E top() {
        return this.list.getFirst();
    }

    @Override
    public void push(E e) {
        this.list.addFirst(e);
    }

    @Override
    public E pop() {
        return this.list.removeFirst();
    }

    public String toString(){
        return this.list.toString();
    }
}
