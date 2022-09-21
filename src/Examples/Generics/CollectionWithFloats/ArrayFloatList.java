package Examples.Generics.CollectionWithFloats;

public class ArrayFloatList implements FloatList{

    public static final int CAPACITY = 16;
    private float[] data;
    private int size = 0;

    public ArrayFloatList(){
        this(CAPACITY);
    }

    public ArrayFloatList(int size){
        this.data = new float[size];
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
    public void add(int i, float e) throws IndexOutOfBoundsException, IllegalStateException {
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
    public float remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        float result = data[i];
        for (int j = i; j < size - 1; j++) {
            data[j] = data[j + 1];
        }
        size--;
        return result;
    }

    @Override
    public float set(int i, float e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        float replaced = data[i];
        data[i] = e;
        return replaced;
    }

    @Override
    public float get(int i) throws IndexOutOfBoundsException {
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
