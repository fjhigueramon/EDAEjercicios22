package Exercises.Ex2StackToQueue;

public class ArrayQueue<E> implements QueueInterface<E> {

    public static final int CAPACITY=1000;
    E[] queue;
    int currentSize = -1;

    // Constructores

    public ArrayQueue(){
        this.queue = (E[]) new Object[CAPACITY];
    }
    public ArrayQueue(int size){
        this.queue = (E[]) new Object[size];
    }

    // Operaciones de la interfaz

    @Override
    public int size(){
        return currentSize+1;
    }

    @Override
    public boolean isEmpty() {
        return currentSize==-1;
    }

    @Override
    public E first() {
        if (this.isEmpty()){
            return null;
        }
        return queue[0];
    }

    @Override
    public void enqueue(E e) {
        if (this.size() == queue.length){
            System.out.println("Stack is full");
        }
        currentSize++;
        for (int i = 0; i < currentSize; i++) {
            queue[i + 1] = queue[i]; 
        }

        queue[0] = e;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()){
            return null;
        }
        E result = queue[currentSize];
        queue[currentSize] = null;
        currentSize--;
        return result;
    }
    
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = currentSize; i >= 0; i--) {
            result.append(this.queue[i]);
            if (i > 0) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
    
}
