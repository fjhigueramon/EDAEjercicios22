package Examples.Generics.CollectionWithObjects;

public class ArrayObjectList implements ObjectList {

    public static final int CAPACITY = 16;
    private Object[] data;
    private int size = 0;

    public ArrayObjectList(){
        this(CAPACITY);
    }

    public ArrayObjectList(int size){
        this.data = new Object[size];
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
    public void add(int i, Object e) throws IndexOutOfBoundsException, IllegalStateException {
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
    public Object remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        Object result = data[i];
        for (int j = i; j < size - 1; j++) {
            data[j] = data[j + 1];
        }
        size--;
        return result;
    }

    @Override
    public Object set(int i, Object e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        Object replaced = data[i];
        data[i] = e;
        return replaced;
    }

    @Override
    public Object get(int i) throws IndexOutOfBoundsException {
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
