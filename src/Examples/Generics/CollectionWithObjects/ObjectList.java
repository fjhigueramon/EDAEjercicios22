package Examples.Generics.CollectionWithObjects;

public interface ObjectList {
    // Remember that this is an example of how NOT to design a collection
    int size();

    boolean isEmpty();

    void add(int i, Object o) throws IndexOutOfBoundsException, IllegalStateException;

    Object remove(int i) throws IndexOutOfBoundsException;

    Object set(int i, Object e) throws IndexOutOfBoundsException;

    Object get(int i) throws IndexOutOfBoundsException;

    String toString();
}
