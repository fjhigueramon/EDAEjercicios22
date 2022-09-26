package Exercises.Ex3JUnitTests;

public class ArrayQueue<E> implements QueueInterface<E> {

    public static final int CAPACITY=1000;
    E[] queue;
    int firstElement=0;
    int lastElement=0;


    public ArrayQueue(){
        this.queue = (E[]) new Object[CAPACITY];
    }
    public ArrayQueue(int size){
        this.queue = (E[]) new Object[size];
    }

    @Override
    public int size() {
        return lastElement - firstElement;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public E first() {
        if (this.isEmpty()){
            return null;
        }
        return queue[firstElement];
    }

    @Override
    public void queue(E e) throws IllegalStateException {
        if (this.lastElement == queue.length){
            throw new IllegalStateException("Queue is full");
        }
        queue[lastElement++] = e;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()){
            return null;
        }
        E result = queue[firstElement];
        queue[firstElement] = null;
        firstElement++;
        return result;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = this.firstElement; i < this.lastElement; i++) {
            result.append(this.queue[i]);
            if (i < this.lastElement - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
