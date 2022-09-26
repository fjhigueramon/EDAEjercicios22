package Exercises.Ex2StackToQueue;

import java.util.LinkedList;

public class LinkedQueue<E> implements QueueInterface<E> {
    
    private LinkedList<E> list;

    // Constructor

    public LinkedQueue(){
        this.list = new LinkedList<>();
    }

    // Operaciones de la interfaz

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E first() {
        return this.list.getFirst();
    }

    @Override
    public void enqueue(E e) {
        this.list.addFirst(e);
    }

    @Override
    public E dequeue() {
        return this.list.removeLast();
    }

    public String toString(){
        return this.list.toString();
    }
}
