package Examples.Generics.SolutionUsingGenerics;

public interface GeneralList<E> {

    int size();

    boolean isEmpty();

    void add(int i, E o) throws IndexOutOfBoundsException, IllegalStateException;

    E remove(int i) throws IndexOutOfBoundsException;

    E set(int i, E e) throws IndexOutOfBoundsException;

    E get(int i) throws IndexOutOfBoundsException;

    String toString();
}
