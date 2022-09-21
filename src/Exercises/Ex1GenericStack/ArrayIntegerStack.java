package Exercises.Ex1GenericStack;

public class ArrayIntegerStack implements IntegerStackInterface {

    public static final int CAPACITY=1000;
    int[] stack;
    int currentSize = -1;


    public ArrayIntegerStack(){
        this.stack = new int[CAPACITY];
    }
    public ArrayIntegerStack(int size){
        this.stack = new int[size];
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
    public Integer top() {
        if (this.isEmpty()){
            return null;
        }
        return stack[currentSize];
    }

    @Override
    public void push(Integer e) {
        if (this.size() == stack.length){
            System.out.println("Stack is full");
        }
        currentSize++;
        stack[currentSize] = e;
    }

    @Override
    public Integer pop() {
        if (this.isEmpty()){
            return null;
        }
        Integer result = stack[currentSize];
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
