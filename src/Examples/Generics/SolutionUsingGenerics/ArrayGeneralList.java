package Examples.Generics.SolutionUsingGenerics;

public class ArrayGeneralList<E> implements GeneralList<E> {

    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public ArrayGeneralList(){
        this(CAPACITY);
    }

    public ArrayGeneralList(int size){
        this.data = (E[]) new Object[size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
        if (i < 0 || i >= n){
            throw new IndexOutOfBoundsException("Illegal index: " + i);
        }
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
        checkIndex(i, size+1);
        if (size == data.length){
            throw new IllegalStateException("Array is full");
        }
        for (int j = size - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }
        data[i] = e;
        size++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E result = data[i];
        for (int j = i; j < size - 1; j++) {
            data[j] = data[j + 1];
        }
        size--;
        return result;
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E replaced = data[i];
        data[i] = e;
        return replaced;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        return data[i];
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < size; i++) {
            result.append(this.data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
