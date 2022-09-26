package Exercises.Ex3JUnitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class TestCaseGenericStack {

    Stack<Integer> myStack;

    @BeforeEach
    void initializeStack(){
        this.myStack = new Stack<>();
    }

    private void pushSomeElements(){
        this.myStack.push(1);
        this.myStack.push(2);
        this.myStack.push(3);
    }

    @Test
    @DisplayName("Push and pop three elements")
    void pushAndPop() {
        this.pushSomeElements();
        String queueState = myStack.toString();
        int x = this.myStack.pop();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.pop();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.pop();
        Assertions.assertEquals(1, x, "Expected 1, got " + x + ". The state of the queue was " + queueState);
    }

    @Test
    @DisplayName("Test peek() method")
    void peek() {
        this.pushSomeElements();
        String queueState = myStack.toString();
        int x = this.myStack.pop();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.peek();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.peek();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.pop();
        Assertions.assertEquals(2, x, "Expected 2, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.peek();
        Assertions.assertEquals(1, x, "Expected 1, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.peek();
        Assertions.assertEquals(1, x, "Expected 1, got " + x + ". The state of the queue was " + queueState);
        queueState = myStack.toString();
        x = this.myStack.pop();
        Assertions.assertEquals(1, x, "Expected 1, got " + x + ". The state of the queue was " + queueState);
    }

    @Test
    @DisplayName("Test size() method")
    void size() {
        String queueState = myStack.toString();
        int x = this.myStack.size();
        Assertions.assertEquals(0, x, "Expected 0, got " + x + ". The state of the queue was " + queueState);

        this.pushSomeElements();
        queueState = myStack.toString();
        x = this.myStack.size();
        Assertions.assertEquals(3, x, "Expected 3, got " + x + ". The state of the queue was " + queueState);
    }

}
