package Examples.Generics.CollectionWithFloats;

public interface FloatList {
    // Remember that this is an example of how NOT to design a collection
    int size();

    boolean isEmpty();

    void add(int i, float e) throws IndexOutOfBoundsException, IllegalStateException;

    float remove(int i) throws IndexOutOfBoundsException;

    float set(int i, float e) throws IndexOutOfBoundsException;

    float get(int i) throws IndexOutOfBoundsException;

    String toString();
}
