package Exercises.Ex3JUnitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestGenericQueue {

    ArrayQueue<Integer> myQueue;

    @BeforeEach
    void initializeStack(){
        this.myQueue = new ArrayQueue<>();
    }

    private void queueSomeElements(){
        this.myQueue.queue(1);
        this.myQueue.queue(2);
        this.myQueue.queue(3);
    }

    @Test
    @DisplayName("Queue and Dequeue three elements.")
    void queueAndDequeue(){
        this.queueSomeElements();
        String queueState = myQueue.toString();
        int x = this.myQueue.dequeue();
        Assertions.assertEquals(1, x, "Expected 1, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.dequeue();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.dequeue();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
    }

    @Test
    @DisplayName("Test first() method")
    void first() {
        this.queueSomeElements();
        String queueState = myQueue.toString();
        int x = this.myQueue.dequeue();
        Assertions.assertEquals(1, x, "Expected 1, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.first();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.first();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.dequeue();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.first();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.first();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
        queueState = myQueue.toString();
        x = this.myQueue.dequeue();
        Assertions.assertEquals(3, x, "Expected 1, got " + 3 + ". The state of the queue was " + queueState);
    }

    @Test
    @DisplayName("Test size() method")
    void size() {
        String queueState = myQueue.toString();
        int x = this.myQueue.size();
        Assertions.assertEquals(0, x, "Expected 0, got " + x + ". The state of the queue was " + queueState);

        this.queueSomeElements();
        queueState = myQueue.toString();
        x = this.myQueue.size();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
    }

    @Test
    @DisplayName("Test if queue is full and if it throws exception")
    void isFull() {
        queueSomeElements();
        Assertions.assertThrows(IllegalStateException.class, () -> this.myQueue.queue(4));
    }
}
